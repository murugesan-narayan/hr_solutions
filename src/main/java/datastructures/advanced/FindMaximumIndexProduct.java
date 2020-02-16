package datastructures.advanced;

import java.util.Arrays;

public class FindMaximumIndexProduct {
    static long solve(int[] arr) {
        long maxIndexProduct = 0;
        for (int i = 0; i < arr.length; i++) {
            long li = getLeftIndex(i, arr);
            long ri = (li == 0) ? 0 : getRightIndex(i, arr);
            long indexProduct = li * ri;
            maxIndexProduct = Math.max(maxIndexProduct, indexProduct);
        }
        return maxIndexProduct;
    }

    private static int getRightIndex(int i, int[] arr) {
        for (int k = i+1; k < arr.length; k++) {
            if (arr[k] > arr[i]) return k+1;
        }
        return 0;
    }

    private static int getLeftIndex(int i, int[] arr) {
        for (int j = i-1; j >= 0; j--) {
            if (arr[j] > arr[i]) return j+1;
        }
        return 0;
    }
}
