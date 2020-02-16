package algorithms.greedy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.Integer.MAX_VALUE;

public class MinAbsDiffInArr {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }


        //int[] arr = new int[]{-2, 2, 4};
        List<Integer> list = Arrays.stream(arr).sorted()
                .boxed().collect(Collectors.toList());
        // Initialize difference as infinite
        int diff = MAX_VALUE;
        System.out.println("list = " + list.size());
        // Find the min diff by comparing adjacent
        // pairs in sorted array
        for (int i=0; i<list.size()-1; i++) {
            int fv = list.get(i);
            int sv = list.get(i+1);
            int ad = Math.abs(fv - sv);
            if (ad<10) System.out.println("ad = " + ad);
            if (ad < diff)
                diff = ad;
        }
        // Return min diff
        //return diff;
        System.out.println("diff = " + diff);
    }
}
