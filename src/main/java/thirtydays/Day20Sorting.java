package thirtydays;

import java.util.Arrays;
import java.util.Scanner;

public class Day20Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        in.close();
        /*int count = 0;
        boolean swapped = true;
        for (int j = a.length - 1; (j >= 0 && swapped); j--) {
            swapped = false;
            for (int k = 0; k < j; k++) {

                if (a[k] > a[k + 1]) {
                    int temp = a[k];
                    count++;
                    a[k] = a[k + 1];
                    a[k + 1] = temp;
                    swapped = true;
                }
            }
        }*/
        int numSwaps = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-1; j++) {
                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    numSwaps++;
                }
            }
        }
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
        System.out.println(Arrays.toString(a));
    }

}
