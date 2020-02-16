package algorithms.bit.manipulation;

public class LonelyInteger {
    static int lonelyinteger(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result ^= a[i];
        }
        return result;
    }
}
