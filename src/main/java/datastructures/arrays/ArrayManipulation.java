package datastructures.arrays;

import java.util.Scanner;

public class ArrayManipulation {

    static long arrayManipulation(int n, int[][] queries) {

        long[] outputArray = new long[n + 2];
        for (int[] query : queries) {
            int a = query[0];
            int b = query[1];
            int k = query[2];
            outputArray[a] += k;
            outputArray[b + 1] -= k;
        }
        return getMax(outputArray);
    }

    private static long getMax(long[] inputArray) {
        long max = Long.MIN_VALUE;
        long sum = 0;
        for (long l : inputArray) {
            sum += l;
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
        queries[i][0] = sc.nextInt();
        queries[i][1] = sc.nextInt();
        queries[i][2] = sc.nextInt();
        }
        long max = arrayManipulation(n, queries);
        System.out.println(max);
        sc.close();
    }

/*    static long arrayManipulation_MyCode(int n, int[][] queries) {
        long[] arr = new long[n+1];
        for (int[] query : queries) {
            int a = query[0];
            int b = query[1];
            int k = query[2];
            arr[a - 1] += k;
            arr[b] -= k;
        }
        long result = 0;
        long sum = 0;
        for (long l : arr) {
            sum += l;
            result = Math.max(sum, result);
        }
        return result;
    }*/
}
