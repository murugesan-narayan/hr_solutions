package algorithms.greedy;

import java.util.Arrays;

public class PriyankaAndToys {
    static int toys(int[] w) {
        Arrays.sort(w);
        int containers = 1;
        int limit = w[0] + 4;
        for (int i = 1; i < w.length; i++) {
            if (w[i] > limit) {
                containers++;
                limit = w[i] + 4;
            }
        }
        return containers;
    }
}
