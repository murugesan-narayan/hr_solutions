package algorithms.greedy;

public class BeautifulPairs {
    static int beautifulPairs(int[] A, int[] B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    count++;
                    A[i] = -1;
                    B[j] = -1;
                    break;
                }
            }
        }
        if (count == A.length)
            return count - 1;
        return count + 1;
    }
}
