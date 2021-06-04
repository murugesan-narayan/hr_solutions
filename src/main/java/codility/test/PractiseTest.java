package codility.test;
import java.util.*;

public class PractiseTest {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int min = 1;
        int len = A.length;
        Arrays.sort(A);
        if (A[0] > 1) return min;
        if (A[len-1] < 1) return min;
        for (int a : A) {
            if (a == min) {
                min++;
            }
        }
        return min;
    }
}
