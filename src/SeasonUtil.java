import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;

public class SeasonUtil {

    /**
     * @param seasonables an inter-comparable array to be sorted
     * @Contract(mutates = "seasonables")
     */
    public static void sortSeasonable(Comparable[] seasonables) {
        Arrays.sort(seasonables);
    }


    static String reportAll(Seasonable[] seasonables) {
        StringBuilder res = new StringBuilder();
        for (Seasonable s : seasonables) {
            res.append(s.toString()).append('\n');
        }
        // delete last newline
        res.deleteCharAt(res.lastIndexOf("\n"));
        return res.toString();
    }
}
