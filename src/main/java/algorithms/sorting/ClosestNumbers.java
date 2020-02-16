package algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestNumbers {

    static int[] closestNumbers(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            int diff = arr[i+1] - arr[i];
            if (diff < minDiff) {
                list.clear();
                minDiff = diff;
            }
            if (diff <= minDiff)
                list.add(Arrays.asList(arr[i], arr[i+1]));
        }
        int[] result = new int[list.size()*2];
        int i = 0;
        for (List<Integer> pair : list) {
            result[i++] = pair.get(0);
            result[i++] = pair.get(1);
        }
        return result;
    }
}
