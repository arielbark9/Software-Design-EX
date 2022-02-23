public class FigTree extends Tree {
    private boolean gives_fruit;

    FigTree(float height, Season season) {
        super(height, season, null);
        switch (season) {
            case WINTER -> {
                leavesColor = null;
                gives_fruit = false;
            }
            case SPRING -> {
                leavesColor = Color.GREEN;
                gives_fruit = false;
            }
            case SUMMER -> {
                leavesColor = Color.GREEN;
                gives_fruit = true;
            }
            case FALL -> {
                leavesColor = Color.YELLOW;
                gives_fruit = false;
            }
        }
    }

    @Override
    public String toString() {
        if (this.gives_fruit)
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
            case WINTER:
                this.height = this.height + 20;
                leavesColor = null;
                break;
            case SPRING:
                this.height = this.height + 30;
                leavesColor = Color.GREEN;
                break;
            case SUMMER:
                this.height = this.height + 30;
                gives_fruit = Boolean.TRUE;
                break;
            case FALL:
                this.height = this.height + 20;
                leavesColor = Color.YELLOW;
                gives_fruit = false;
                break;
        }
    }
}
