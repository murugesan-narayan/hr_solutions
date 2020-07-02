package algorithms.implementation;

import java.util.Arrays;

public class ServiceLane {
    static int[] serviceLane(int[] width, int[][] cases) {
        int[] result = new int[cases.length];
        int ri = 0;
        for (int[] c : cases) {
            int s = c[0];
            int e = c[1];
            int[] range = Arrays.copyOfRange(width, s, e + 1);
            int min = Arrays.stream(range).min().orElse(0);
            result[ri++] = min;
        }
        return result;
    }
}
