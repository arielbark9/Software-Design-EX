public class Bear extends Animal {

    private boolean sleeping;

    Bear(float weight, Season season) {
        super(weight,season,Color.BROWN);
        sleeping = getCurrentSeason() != Season.WINTER;
    }

    @Override
    public String toString() {
        if (!sleeping)
            return String.format("Bear. My weight is: %d and my color is: %s",this.weight, this.color);
        else
            return String.format("Bear. I am sleeping. My weight is: %d and my color is: %s",this.weight, this.color);

    }

    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (this.getCurrentSeason()) {
            case WINTER -> {
                this.setWeight(this.weight * (4f / 5));
                this.sleeping = true;
            }
            case SPRING -> {
                this.setWeight(this.weight * (3f / 4));
                this.sleeping = false;
            }
            case SUMMER -> {
                this.setWeight(this.weight * (4f / 3));
                this.sleeping = false;
            }
            case FALL -> {
                this.setWeight(this.weight * (5f / 4));
                this.sleeping = false;
            }
        }
    }
}
