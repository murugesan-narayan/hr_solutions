package algorithms.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MissingNumbers {
    static int[] missingNumbers(int[] arr, int[] brr) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < brr.length; i++) {
            if (i < arr.length)
                map1.put(arr[i], map1.getOrDefault(arr[i], 0)+1);
            map2.put(brr[i], map2.getOrDefault(brr[i], 0)+1);
        }
        Set<Integer> set = new TreeSet<>();
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            Integer key = entry.getKey();
            Integer val = map1.get(key);
            if (val == null || entry.getValue().intValue() != val.intValue())
                set.add(key);
        }
        return set.stream().mapToInt(a->a).toArray();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int n = scanner.nextInt();
        int n = Integer.parseInt(br.readLine());
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

//        String[] arrItems = scanner.nextLine().split(" ");
        String[] arrItems = br.readLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

//        int m = scanner.nextInt();
        int m = Integer.parseInt(br.readLine());
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] brr = new int[m];

//        String[] brrItems = scanner.nextLine().split(" ");
        String[] brrItems = br.readLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            brr[i] = brrItem;
        }

        int[] result = missingNumbers(arr, brr);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
/*
        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
*/

        scanner.close();
    }
}
