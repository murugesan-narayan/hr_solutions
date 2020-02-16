package algorithms.implementation;

public class SequenceEquation {
    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];
        int ic = 0;
        for (int i = 1; i <= p.length; i++) {
            int j;
            for (j = 0; j < p.length; j++) {
                if (p[j] == i) break;
            }
            int k;
            for (k = 0; k < p.length; k++) {
                if (p[k] == j+1) break;
            }
            result[ic++] = k+1;
        }
        return result;
    }
}
