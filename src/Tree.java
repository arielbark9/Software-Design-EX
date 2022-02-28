import org.jetbrains.annotations.NotNull;

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
        season = season.next();
    }

    @Override
    public int compareTo(@NotNull Object o) {
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
