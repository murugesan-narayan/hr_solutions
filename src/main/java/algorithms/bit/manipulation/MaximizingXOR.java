package algorithms.bit.manipulation;

public class MaximizingXOR {
    static int maximizingXor(int l, int r) {
        return Integer.highestOneBit(l ^ r) * 2 - 1;
    }

    static int maximizingXor1(int l, int r) {
        int maxXor = 0;
        for (int i = l; i <= r; i++) {
            for (int j = i+1; j <= r; j++) {
                maxXor = Math.max(maxXor, i^j);
            }
        }
        return maxXor;
    }
}
