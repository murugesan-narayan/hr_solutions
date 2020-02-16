package algorithms.sorting;

import java.util.ArrayList;

public class QuickSort2Sorting {
    static void quickSort(int[] arr) {
        sort(arr, 0, arr.length-1);
    }

    static void sort(int arr[], int start, int end) {
        if(start >= end)
            return;

        int pos = partition(arr,start,end);

        sort(arr,start,pos-1);
        sort(arr,pos+1,end);

        printArray(arr,start, end);
    }

    static int partition(int ar[], int start, int end) {
        int pivot = ar[start];
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for(int i = start+1 ; i <= end; i++) {
            if(ar[i] > pivot)
                right.add(ar[i]);
            else
                left.add(ar[i]);
        }
        copy(left,ar,start);
        int pi = left.size()+start;
        ar[pi] = pivot;
        copy(right,ar,pi+1);

        return pi;
    }

    static void copy(ArrayList<Integer> list, int ar[], int startIdx)
    {
        for(int num : list)
        {
            ar[startIdx++] = num;
        }
    }

    static void printArray(int[] ar,int start, int end) {
        for(int i = start; i <= end;i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }

    static void quickSort1(int[] arr) {
        sort1(arr, 0, arr.length-1);
        printArray(arr);
    }

    static void sort1(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition1(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort1(arr, low, pi-1);
            sort1(arr, pi+1, high);
        }
    }

    static int partition1(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                i++;

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

        return i+1;
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
