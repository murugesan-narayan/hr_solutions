package algorithms.implementation;

public class TaumAndBDay {
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        long tbc = (long) b * bc;
        long twc = (long) w * wc;
        if (bc > wc + z) {
            tbc = 0;
            twc += (long) b * (wc + z);
        } else if (wc > bc + z) {
            twc = 0;
            tbc += (long) w * (bc + z);
        }
        return tbc + twc;
    }

}
