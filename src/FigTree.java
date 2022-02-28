public class FigTree extends Tree {

    /**
     * Flag to tell if the Tree is giving fruit
     */
    private boolean givesFruit;

    FigTree(float height, Season season) {
        super(height, season, null);
        switch (season) {
            case WINTER:
                leavesColor = null;
                givesFruit = false;
                break;
            case SPRING:
                leavesColor = Color.GREEN;
                givesFruit = false;
                break;
            case SUMMER:
                leavesColor = Color.GREEN;
                givesFruit = true;
                break;
            case FALL:
                leavesColor = Color.YELLOW;
                givesFruit = false;
                break;
        }
    }

    @Override
    public String toString() {
        if (this.givesFruit)
            return String.format("Fig tree. I give fruit. My height is: %d and my color is: %s",
                this.height, this.leavesColor);
        else {
            if (this.leavesColor == null)
                return String.format("Fig tree. My height is: %d and I have no leaves",
                        this.height);
            else
                return String.format("Fig tree. My height is: %d and my color is: %s",
                        this.height, this.leavesColor);
        }

    }

    @Override
    public void changeSeason() {
        super.changeSeason();

        switch (season) {
            case WINTER: // Tree grows by 20
                this.height = this.height + 20;
                leavesColor = null;
                break;
            case SPRING: // Tree grows by 30
                this.height = this.height + 30;
                leavesColor = Color.GREEN;
                break;
            case SUMMER: // Tree grows by 30 and gives fruit
                this.height = this.height + 30;
                givesFruit = true;
                break;
            case FALL: // Tree grows by 20
                this.height = this.height + 20;
                leavesColor = Color.YELLOW;
                givesFruit = false;
                break;
        }
    }
}
