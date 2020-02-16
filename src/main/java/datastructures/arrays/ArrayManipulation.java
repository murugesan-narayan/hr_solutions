package datastructures.arrays;


import java.util.Scanner;
public class ArrayManipulation {

    static long arrayManipulation(int n, int[][] queries) {

        long outputArray[] = new long[n + 2];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            outputArray[a] += k;
            outputArray[b+1] -= k;
        }
        long max = getMax(outputArray);
        return max;
    }

    /**
     * @param inputArray
     * @return
     */
    private static long getMax(long[] inputArray) {
        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int queries[][] = new int[m][3];

        for (int i = 0; i < m; i++) {
        queries[i][0] = sc.nextInt();
        queries[i][1] = sc.nextInt();
        queries[i][2] = sc.nextInt();
        }
        long max = arrayManipulation(n, queries);
        System.out.println(max);
        sc.close();
    }

    static long arrayManipulation_MyCode(int n, int[][] queries) {
        long[] arr = new long[n+1];
        for(int i=0; i<queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            arr[a-1] += k;
            arr[b] -= k;
        }
        long result = 0;
        long sum = 0;
        for(int j=0; j<arr.length; j++) {
            sum += arr[j];
            result = Math.max(sum, result);
        }
        return result;
    }
}
