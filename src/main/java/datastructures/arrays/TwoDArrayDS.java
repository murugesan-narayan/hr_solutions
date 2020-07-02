package datastructures.arrays;

import java.util.Scanner;

public class TwoDArrayDS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int arr_i = 0; arr_i < 6; arr_i++) {
            for (int arr_j = 0; arr_j < 6; arr_j++) {
                arr[arr_i][arr_j] = in.nextInt();
            }
        }

        int maxsum = Integer.MIN_VALUE;
        for (int arr_i = 0; arr_i < 6; arr_i++) {
            for (int arr_j = 0; arr_j < 6; arr_j++) {

                if ((arr_j + 2) < 6 && (arr_i + 2) < 6) {
                    int sum = arr[arr_i][arr_j] + arr[arr_i][arr_j + 1] + arr[arr_i][arr_j + 2]
                            + arr[arr_i + 1][arr_j + 1] + arr[arr_i + 2][arr_j] + arr[arr_i + 2][arr_j + 1]
                            + arr[arr_i + 2][arr_j + 2];
                    if (sum > maxsum) {
                        maxsum = sum;
                    }
                }

            }
        }
        System.out.println(maxsum);
        in.close();
    }

    //MyCode
/*    static int hourglassSum(int[][] a) {
        List<Integer> hourGlassSumList = new ArrayList<>();
        for (int i=0; i<a.length-2; i++) {
            for (int j=0; j<a.length-2; j++) {
                int hourGlassSum = a[i][j]      + a[i][j+1]   + a[i][j+2]
                                                + a[i+1][j+1] +
                                   a[i+2][j]    + a[i+2][j+1] + a[i+2][j+2];
                hourGlassSumList.add(hourGlassSum);
            }
        }
        return Collections.max(hourGlassSumList);
    }

    static int hourglassSum1(int[][] a) {
        int max = 0;
        for (int i=0; i<a.length-2; i++) {
            for (int j=0; j<a.length-2; j++) {
                int hourGlassSum = a[i][j]      + a[i][j+1]   + a[i][j+2]
                        + a[i+1][j+1] +
                        a[i+2][j]    + a[i+2][j+1] + a[i+2][j+2];
                max = Math.max(max, hourGlassSum);
            }
        }
        return max;
    }*/

}
