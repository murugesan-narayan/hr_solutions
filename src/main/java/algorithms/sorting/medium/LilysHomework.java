package algorithms.sorting.medium;

import java.util.*;

public class LilysHomework {
    static int lilysHomework(int[] arr) {
        Integer[] idxs = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            idxs[i] = i;
        }
        Arrays.sort(idxs, Comparator.comparingInt(i -> arr[i]));
        int swaps1 = countSwaps(idxs);

        Arrays.sort(idxs, (i1, i2) -> arr[i2] - arr[i1]);
        int swaps2 = countSwaps(idxs);

        return Math.min(swaps1, swaps2);
    }

    static int countSwaps(Integer[] idxs) {
        int swaps = 0;
        boolean[] visited = new boolean[idxs.length];

        for (int i = 0; i < idxs.length; i++) {
            if (visited[i]) continue;
            int j = i;
            do {
                visited[j] = true;
                j = idxs[j];
                swaps++;
            } while(j != i);
            swaps--;
        }
        return swaps;
    }
}
