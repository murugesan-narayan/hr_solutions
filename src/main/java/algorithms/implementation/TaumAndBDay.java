package algorithms.implementation;

public class TaumAndBDay {
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        long tbc = 1L * b * bc;
        long twc = 1L * w * wc;
        if (bc > wc + z) {
            tbc = 0;
            twc += b * 1L * (wc + z);
        } else if (wc > bc + z) {
            twc = 0;
            tbc += w * 1L * (bc + z);
        }
        long tc = tbc + twc;
        return tc;
    }

}
