package algorithms.greedy;

import java.util.Arrays;

public class MarcsCakewalk {
    static long marcsCakewalk(int[] calorie) {
        Arrays.sort(calorie);
        long minMiles = 0;
        int l = calorie.length;
        for (int i = 0; i < l; i++) {
            minMiles += Math.pow(2, l-1-i) * calorie[i];
        }
        return minMiles;
    }
}
