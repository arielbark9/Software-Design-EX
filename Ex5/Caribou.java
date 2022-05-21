public class Caribou extends Animal {

    /**
     * Flag to tell if the caribou is migrating
     */
    private boolean migrating;

    /**
     * If the Caribou is migrating, where is it migrating to.
     * possible values: north, south.
     */
    private String migratingTo;

    Caribou(float weight, Season season) {
        super(weight, season, null);
        if (this.getCurrentSeason() == Season.WINTER) {
            color = Color.WHITE;
            migrating = true;
            migratingTo = "south";
        }
        else if (this.getCurrentSeason() == Season.SUMMER){
            color = Color.BROWN;
            migrating = true;
            migratingTo = "north";
        }
        else {
            color = Color.BROWN;
            migrating = false;
        }
    }

    @Override
    public String toString() {
        if (migrating)
            return String.format("Caribou: I am migrating %s. My weight is: %d and my color is: %s",migratingTo,weight,color);
        else
            return String.format("Caribou: My weight is: %d and my color is: %s",weight,color);
    }

    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (this.getCurrentSeason()) {
            case WINTER: // Caribou migrates south
                this.color = Color.WHITE;
                this.migrating = true;
                this.migratingTo = "south";
                break;
            case SPRING:
                this.color = Color.BROWN;
                migrating = false;
                break;
            case SUMMER: // Caribou migrates north
                this.migrating = true;
                this.migratingTo = "north";
                break;
            case FALL:
                this.migrating = false;
                break;
        }
    }
}
