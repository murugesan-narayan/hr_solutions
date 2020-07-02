package datastructures.heap;


//import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class JesseAndCookies {
    public static void main(String[] args) {
        int k = 90;
        int[] A = new int[]{13, 47, 74, 12, 89, 74, 18, 38};
        int v = cookies1(k, A);
        System.out.println("v = " + v);
    }
    /*
     * Complete the cookies function below.
     */
    static int cookies1(int k, int[] A) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(A.length);
        pq.addAll(Arrays.stream(A).boxed().collect(Collectors.toList()));
        int count = 0;
        while (pq.size() > 1 && pq.peek() < k) {
            Integer v1 = pq.poll();
            if (v1 == null) v1 = 0;
            Integer v2 = pq.poll();
            if (v2 == null) v2 = 0;
            int newVal = v1 + (2 * v2);
            pq.add(newVal);
            count++;
        }
        Integer re = pq.peek();
        if (re == null) re = 0;
        return re >= k ? count : -1;
    }


    //private static final Scanner scanner = new Scanner(System.in);

/*    public static void main1(String[] args) {//throws IOException {
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
    }*/
}
