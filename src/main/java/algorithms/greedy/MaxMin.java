package algorithms.greedy;

import java.util.Arrays;

import static java.lang.Integer.MAX_VALUE;

public class MaxMin {
    // Complete the maxMin function below.
    static int maxMin(int k, int[] arr) {
        Arrays.sort(arr);
        int minUnfair = MAX_VALUE;
        for (int i = 0; i <= arr.length-k; i++) {
            int unfair = arr[i + k-1] - arr[i];
            minUnfair = Math.min(minUnfair, unfair);

        }
        return minUnfair;

    }
}
