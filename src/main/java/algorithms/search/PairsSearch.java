package algorithms.search;

import java.util.Arrays;

public class PairsSearch {
    static int pairs(int k, int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1;
                 j < arr.length && Math.abs(arr[i] - arr[j]) <= k;
                 j++)
                if (Math.abs(arr[i] - arr[j]) == k) count++;
        }
        return count;
    }
}
