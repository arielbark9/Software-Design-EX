import java.util.ArrayList;
import java.util.Arrays;

public class SeasonUtil {
    public static final Season[] SEASONS = Season.values();
    public static void sortSeasonable(Comparable[] seasonables) {
        Arrays.sort(seasonables);
    }

    static String reportAll(Seasonable[] seasonables) {
        StringBuilder res = new StringBuilder();
        for (Seasonable s : seasonables) {
            res.append(s.toString()).append('\n');
        }
        res.deleteCharAt(res.lastIndexOf("\n"));
        return res.toString();
    }
}
