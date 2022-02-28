public interface Seasonable {
    /**
     * @return current season
     */
    Season getCurrentSeason();

    /**
     * change object season to next season.
     */
    void changeSeason();
}