package algorithms.greedy;

import java.util.Arrays;

public class MaximumPerimeterTriangle {
    static int[] maximumPerimeterTriangle(int[] sticks) {
        Arrays.sort(sticks);
        int al = sticks.length;
        for (int i = al-1; i > 1; i--) {
            int fv = sticks[i-2];
            int sv = sticks[i-1];
            int tv = sticks[i];
            if (fv + sv > tv && fv + tv > sv && sv + tv > fv) {
                return new int[] {fv, sv, tv};
            }
        }
        return new int[] {-1};
    }
}
