package algorithms.search;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TripleSum {

    static long triplets(int[] a, int[] b, int[] c) {
        a = Arrays.stream(a).distinct().sorted().toArray();
        b = Arrays.stream(b).distinct().sorted().toArray();
        c = Arrays.stream(c).distinct().sorted().toArray();
        long count = 0;
        for (int j=0; j < b.length; j++) {
            int bv = b[j];
            long ca = 0, cc = 0;
            for (int i=0; i < a.length && bv >= a[i]; i++)
                ca++;
            for (int k=0; k < c.length && bv >= c[k]; k++)
                cc++;
            count += ca*cc;
        }
        return count;
    }
}
