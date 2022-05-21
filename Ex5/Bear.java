public class Bear extends Animal {

    /**
     * Flag to tell if the bear is sleeping (only in winter)
     */
    private boolean sleeping;

    Bear(float weight, Season season) {
        super(weight,season,Color.BROWN);
        sleeping = this.getCurrentSeason() == Season.WINTER;
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
            case WINTER: // 20% decrease in weight
                this.setWeight(this.weight * (4f / 5));
                this.sleeping = true;
                break;
            case SPRING: // 25% decrease in weight
                this.setWeight(this.weight * (3f / 4));
                this.sleeping = false;
                break;
            case SUMMER: // 33% increase in weight
                this.setWeight(this.weight * (4f / 3));
                this.sleeping = false;
                break;
            case FALL: // 25% increase in weight
                this.setWeight(this.weight * (5f / 4));
                this.sleeping = false;
                break;
        }
    }
}
