package datastructures.heap;


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JesseAndCookies {
    public static void main(String[] args) {
        int k = 90;
        int[] A = new int[]{13, 47, 74, 12, 89, 74, 18, 38};
        cookies1(k, A);
    }
    /*
     * Complete the cookies function below.
     */
    static int cookies1(int k, int[] A) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(A.length);
        pq.addAll(Arrays.stream(A).boxed().collect(Collectors.toList()));
        int count = 0;
        while (pq.size() > 1 && pq.peek() < k) {
            int v1 = pq.poll();
            int v2 = pq.poll();
            int newVal = v1 + 2 * v2;
            pq.add(newVal);
            count++;
        }
        return pq.peek() >= k ? count : -1;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main1(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0].trim());

        int k = Integer.parseInt(nk[1].trim());

        int[] A = new int[n];

        String[] AItems = scanner.nextLine().split(" ");

        for (int AItr = 0; AItr < n; AItr++) {
            int AItem = Integer.parseInt(AItems[AItr].trim());
            A[AItr] = AItem;
        }

        int result = cookies1(k, A);
        System.out.println("result = " + result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();
    }
}
