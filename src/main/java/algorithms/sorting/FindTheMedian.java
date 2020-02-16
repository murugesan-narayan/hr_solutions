package algorithms.sorting;

import java.util.Arrays;

public class FindTheMedian {
    static int findMedian(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
}
