package algorithms.bit.manipulation;

public class LonelyInteger {
    static int lonelyInteger(int[] a) {
        int result = 0;
        for (int value : a) {
            result ^= value;
        }
        return result;
    }
}
