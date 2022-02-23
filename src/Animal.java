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
        Animal animal;
        try {
           animal = (Animal)o;
        }
        catch (ClassCastException ex) {
            throw ex;
        }
        return this.weight - animal.weight;
    }
}
