package general.programming;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class FriendCircleQueries {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                new FileInputStream("src/main/java/general/programming/fcdata.txt")));
        //int q = scanner.nextInt();//100000
        int q = Integer.parseInt(bufferedReader.readLine().trim());//100000
        //bufferedReader.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] queries = new int[q][2];

        for (int i = 0; i < q; i++) {
            String[] queriesRowItems = bufferedReader.readLine().split(" ");
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }
        bufferedReader.close();
        System.out.println(LocalDateTime.now());
        int[] ans = maxCircle(queries);
        System.out.println(LocalDateTime.now());
        for (int i = 0; i < ans.length; i++)
            System.out.println(ans[i]);
    }

    public static void main1(String[] args) {
        int[][] queries = new int[][] {
                {1, 2}, {3, 4}, {1, 3},
                {5, 7}, {5, 6}, {7, 4} };
        int[] ans = maxCircle(queries);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    static int[] maxCircle(int[][] queries) {
        int[] result = new int[queries.length];
        Map<Integer, Set<Integer>> countMap = new HashMap<>();
        int countMax = 0;
        for (int i = 0; i < queries.length; i++) {
            int[] arr = queries[i];
            int v1 = arr[0];
            int v2 = arr[1];
            Set<Integer> c1 = countMap.get(v1);
            Set<Integer> c2 = countMap.get(v2);
            if (c1 == null && c2 == null) {
                Set<Integer> set = new HashSet<>();
                set.add(v1); set.add(v2);
                countMap.put(v1, set);
                countMap.put(v2, set);
                if (countMax < 2) countMax = 2;
                result[i] = countMax;
            } else if (c1 == null && c2 != null) {
                c2.add(v1);
                if (countMax < c2.size())
                    countMax = c2.size();
                countMap.put(v1, c2);
                result[i] = countMax;
            } else if (c1 != null && c2 == null) {
                c1.add(v2);
                if (countMax < c1.size())
                    countMax = c1.size();
                countMap.put(v2, c1);
                result[i] = countMax;
            } else {
                if (c1 == c2) /* NO OPS */;
                else if (c1.size()>c2.size()) {
                    c1.addAll(c2);
                    if (countMax < c1.size())
                        countMax = c1.size();
                    for (int iv : c2) countMap.put(iv, c1);
                } else {
                    c2.addAll(c1);
                    if (countMax < c2.size())
                        countMax = c2.size();
                    for (int iv : c1) countMap.put(iv, c2);
                }
                result[i] = countMax;
            }
        }
        return result;
    }
}
