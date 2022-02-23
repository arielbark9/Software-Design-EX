import java.util.IllegalFormatConversionException;

public abstract class Tree implements Comparable, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;

    Tree(float height, Season season, Color leavesColor){
        this.setHeight(height);
        this.season = season;
        this.leavesColor = leavesColor;
    }

    protected void setHeight(float height) {
        this.height = (int)height;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public void changeSeason() {
        switch (season) {
            case FALL:
                season = Season.WINTER;
                break;
            case WINTER:
                season = Season.SPRING;
                break;
            case SPRING:
                season = Season.SUMMER;
                break;
            case SUMMER:
                season = Season.FALL;
                break;
        }
    }

    @Override
    public int compareTo(Object o) {
        if (o == null) throw new NullPointerException("Error! Can't compare null value.");
        Tree tree;
        try {
            tree = (Tree)o;
        }
        catch (ClassCastException ex) {
            throw ex;
        }
        return this.height - tree.height;
    }
}
