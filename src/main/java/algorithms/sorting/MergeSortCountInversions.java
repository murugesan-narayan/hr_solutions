package algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortCountInversions {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }
            scanner.close();
            long result = countInversions(arr);
            System.out.println("result = " + result);
        }
    }

    static long countInversions(int[] arr) {
        int temp[] = new int[arr.length];
        long count = mergeSort(arr, temp, 0, arr.length - 1);
        return count;
    }

    private static long mergeSort(int[] arr, int[] temp, int left, int right) {
        int mid = 0;
        long inversionCount = 0;
        if (left < right) {
            mid = (left + right) / 2;
            inversionCount += mergeSort(arr, temp, left, mid);
            inversionCount += mergeSort(arr, temp, mid+1, right);
            inversionCount += merge(arr, temp, left, mid+1, right);
        }
        return inversionCount;
    }

    private static long merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left, j = mid, k = left;
        long swaps = 0;
        while (i < mid && j <= right) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else {
                temp[k++] = arr[j++];
                swaps += mid-i;
            }
        }
        while(i < mid) temp[k++] = arr[i++];
        while(j <= right) temp[k++] = arr[j++];
        for (i = left; i <= right; i++)
            arr[i] = temp[i];
        return swaps;
    }
    /*
    *//* An auxiliary recursive method that sorts the input array and
      returns the number of inversions in the array. *//*
    static int _mergeSort(int arr[], int temp[], int left, int right)
    {
        int mid, inv_count = 0;
        if (right > left) {
            *//* Divide the array into two parts and call _mergeSortAndCountInv()
           for each of the parts *//*
            mid = (right + left) / 2;

            *//* Inversion count will be sum of inversions in left-part, right-part
          and number of inversions in merging *//*
            inv_count = _mergeSort(arr, temp, left, mid);
            inv_count += _mergeSort(arr, temp, mid + 1, right);

            *//*Merge the two parts*//*
            inv_count += merge(arr, temp, left, mid + 1, right);
        }
        return inv_count;
    }

    *//* This method merges two sorted arrays and returns inversion count in
       the arrays.*//*
    static int merge(int arr[], int temp[], int left, int mid, int right)
    {
        int i, j, k;
        int inv_count = 0;

        i = left; *//* i is index for left subarray*//*
        j = mid; *//* j is index for right subarray*//*
        k = left; *//* k is index for resultant merged subarray*//*
        while ((i <= mid - 1) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];

                *//*this is tricky -- see above explanation/diagram for merge()*//*
                inv_count = inv_count + (mid - i);
            }
        }

        *//* Copy the remaining elements of left subarray
       (if there are any) to temp*//*
        while (i <= mid - 1)
            temp[k++] = arr[i++];

        *//* Copy the remaining elements of right subarray
       (if there are any) to temp*//*
        while (j <= right)
            temp[k++] = arr[j++];

        *//*Copy back the merged elements to original array*//*
        for (i = left; i <= right; i++)
            arr[i] = temp[i];

        return inv_count;
    }*/
}
