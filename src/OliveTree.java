public class OliveTree extends Tree {

    private boolean gives_fruit;

    OliveTree(int height, Season season) {
        super(height,season,Color.GREEN);
        gives_fruit = season == Season.SUMMER;
    }

    @Override
    public String toString() {
        if (this.gives_fruit)
            return String.format("Olive tree. I give fruit. My height is: %d and my color is: %s",
                    this.height, this.leavesColor);
        else if (this.leavesColor == null)
            return String.format("Olive tree. My height is: %d and i have no leaves",
                    this.height);
        else
            return String.format("Olive tree. My height is: %d and my color is: %s",
                    this.height, this.leavesColor);
    }

    @Override
    public void changeSeason() {
        super.changeSeason();

        switch (season){
            case WINTER, FALL ->{
                this.height = this.height + 5;
                gives_fruit = false;
            }
            case SPRING ->{
                this.height = this.height + 10;
                gives_fruit = false;
            }
            case SUMMER ->{
                this.height = this.height + 10;
                gives_fruit = true;
            }
        }
    }
}
