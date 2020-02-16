package algorithms.implementation;

import java.util.stream.IntStream;

public class ModifiedKaprekarNumbers {
    static void kaprekarNumbers(int p, int q) {
        int[] arr = IntStream.rangeClosed(p, q).toArray();
        boolean found = false;
        for (int v : arr) {
            long pv = (long) Math.pow(v, 2);
            String spv = String.valueOf(pv);
            int n = spv.length();
            int mid = n/2;
            String lv = spv.substring(0, mid);
            String rv = spv.substring(mid, n);
            if (lv.equals("")) lv ="0";
            if (rv.equals("")) rv ="0";
            int v1 = Integer.parseInt(lv);
            int v2 = Integer.parseInt(rv);
            int sum = v1 + v2;
            if (v == sum) {
                found = true;
                System.out.print(v + " ");
            }
        }
        if (!found)
            System.out.println("INVALID RANGE");
    }
}
