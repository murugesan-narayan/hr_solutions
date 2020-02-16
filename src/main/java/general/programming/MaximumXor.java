package general.programming;

public class MaximumXor {
    //TODO not completed
    static int[] maxXor(int[] arr, int[] queries) {
        // solve here
        int[] result = new int[queries.length];
        int i = 0;
        for (int q : queries) {
            int max = 0;
            for (int a : arr) {
                int xor = q ^ a;
                if (xor > max) max = xor;
            }
            result[i++] = max;
        }
        return result;
    }
}
