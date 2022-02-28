import org.jetbrains.annotations.NotNull;

import java.util.IllegalFormatConversionException;

public abstract class Animal implements Seasonable,Comparable{
    protected int weight;
    private Season season;
    protected Color color;

    Animal(float weight, Season season, Color color){
        this.setWeight(weight);
        this.season = season;
        this.color = color;
    }

    protected void setWeight(float weight) {
        this.weight = (int)weight;
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
        Animal animal;
        try {
           animal = (Animal)o;
        }
        catch (ClassCastException ex) {
            throw ex;
        }
        // Compare with weight
        return this.weight - animal.weight;
    }
}
