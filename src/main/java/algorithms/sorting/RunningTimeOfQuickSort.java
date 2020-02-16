package algorithms.sorting;

import java.util.Arrays;

public class RunningTimeOfQuickSort {
    static int shifts = 0;
    static void quickSort(int[] arr) {
        int insertShifts = getInsertionSortShifts(Arrays.copyOfRange(arr, 0, arr.length));
        sort(arr, 0, arr.length-1);
        System.out.println(insertShifts - shifts);
    }

    static void sort(int arr[], int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition1(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    static int partition1(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                i++;
                shifts++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        shifts++;
//        printArray(arr);
        return i+1;
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    static int getInsertionSortShifts(int[] arr) {
        int shifts = 0;
        for(int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j = j - 1;
                shifts++;
            }
            arr[j + 1] = value;
        }
        return shifts;
    }

}
