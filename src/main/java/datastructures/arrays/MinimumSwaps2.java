package datastructures.arrays;

import java.util.*;

public class MinimumSwaps2 {
    public static void main(String[] args) {
        int[] a = new int[] {4, 3, 1, 2};
        int swaps = 0;
        for (int i=0; i<a.length; i++) {
            int current = a[i];
            int target = a[current-1];
            while (current != target) {
                a[i] = target;
                a[current-1] = current;
                swaps++;
                current = target;
                target = a[current-1];
            }
        }
        System.out.println("swaps = " + swaps);
    }

    private static int swapElement(int[] a, int i) {
        int swaps = 0;
        int current = a[i];
        int target = a[current-1];
        if(current != target) {
            a[i] = target;
            a[current-1] = current;
            swaps++;
        }
        return swaps;
    }
}
