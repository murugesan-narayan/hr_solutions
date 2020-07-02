package algorithms.sorting;

public class InsertionSortPart1 {
    static void insertionSort1(int n, int[] arr) {
        for (int i = n-1; i >= 0; i--) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j+1] = arr[j];
                j--;
                for (int v : arr)
                    System.out.print(v +" ");
                System.out.println();
            }
            arr[j+1] = key;
        }
        for (int v : arr)
            System.out.print(v +" ");

    }
}
