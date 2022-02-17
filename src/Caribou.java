public class Caribou extends Animal {

    private boolean migrating;
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
            case WINTER -> {
                this.color = Color.WHITE;
                this.migrating = true;
                this.migratingTo = "south";
            }
            case SPRING -> {
                this.color = Color.BROWN;
                migrating = false;
            }
            case SUMMER -> {
                this.migrating = true;
                this.migratingTo = "north";
            }
            case FALL -> this.migrating = false;
        }
    }
}
