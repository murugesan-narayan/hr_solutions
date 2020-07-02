package algorithms.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class PermutingTwoArrays {
    static String twoArrays(int k, int[] A, int[] B) {
        Arrays.sort(A);
        B = Arrays.stream(B).boxed().sorted(Comparator.reverseOrder()).mapToInt(a->a).toArray();
        for (int i = 0; i < A.length; i++) {
            if (A[i] + B[i] < k)
                return "NO";
        }
        return "YES";
    }
}
