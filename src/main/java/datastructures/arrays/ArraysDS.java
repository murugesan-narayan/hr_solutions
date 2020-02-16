package datastructures.arrays;

import java.util.Scanner;

public class ArraysDS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        for (int arr_i = n - 1; arr_i >= 0; arr_i--) {
            System.out.print(arr[arr_i] + " ");
        }
        in.close();
    }

    /*static int[] reverseArray(int[] a) {
        for (int i=0; i<a.length/2; i++) {
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
        return a;
    }*/
}
