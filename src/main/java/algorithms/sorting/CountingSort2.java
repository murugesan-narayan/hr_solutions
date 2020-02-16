package algorithms.sorting;

import java.util.Arrays;

public class CountingSort2 {
    static int[] countingSort(int[] arr) {
        int[] counts = new int[100];
        for (int v : arr) {
            if (v < 100) counts[v] = counts[v] + 1;
        }
        int i = 0;
        for (int j = 0; j < counts.length; j++) {
            int k = counts[j];
            while (k-- >= 1)
                arr[i++] = j;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
