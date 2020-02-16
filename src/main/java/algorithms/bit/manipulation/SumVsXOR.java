package algorithms.bit.manipulation;

public class SumVsXOR {
    static long sumXor(long n) {
        long unset_bits=0;
        while (n > 0) {
            if ((n & 1) == 0)
                unset_bits++;
            n=n>>1;
        }
        return 1L << unset_bits;
    }
}
