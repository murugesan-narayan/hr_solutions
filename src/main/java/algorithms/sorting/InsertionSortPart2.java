package algorithms.sorting;

public class InsertionSortPart2 {
    static void insertionSort2(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
            for (int v : arr)
                System.out.print(v +" ");
            System.out.println();
        }
    }
}
