package algorithms.sorting;

public class CountingSort1 {
    static int[] countingSort(int[] arr) {
        int[] counts = new int[100];
        for (int v : arr) {
            if (v < 100) counts[v] = counts[v] + 1;
        }
        return counts;
    }
}
