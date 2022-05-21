public class OliveTree extends Tree {

    private boolean givesFruit;

    OliveTree(float height, Season season) {
        super(height,season,Color.GREEN);
        givesFruit = season == Season.FALL;
    }

    @Override
    public String toString() {
        if (this.givesFruit)
            return String.format("Olive tree. I give fruit. My height is: %d and my color is: %s",
                    this.height, this.leavesColor);
        else {
            if (this.leavesColor == null)
                return String.format("Olive tree. My height is: %d and i have no leaves",
                        this.height);
            else
                return String.format("Olive tree. My height is: %d and my color is: %s",
                        this.height, this.leavesColor);
        }
    }

    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (season) {
            case SPRING:
            case SUMMER: // Tree grows by 10
                this.height = this.height + 10;
                givesFruit = false;
                break;
            case WINTER: // Tree grows by 5
                this.height = this.height + 5;
                givesFruit = false;
                break;
            case FALL: // Tree grows by 5 and gives fruit
                this.height = this.height + 5;
                givesFruit = true;
                break;
        }
    }
}
