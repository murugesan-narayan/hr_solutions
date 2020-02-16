package algorithms.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarraySumTest {

    @Test
    void maximumSum() {
        long[] a = new long[]{3, 3, 9, 9, 5};
        long m = 7;
        long maximumSumModulo = MaximumSubarraySum.maximumSum(a, m);
        assertEquals(6, maximumSumModulo);
    }

    @Test
    void maximumSum_1() {
        long[] a = new long[]{1, 5, 9};
        long m = 5;
        long maximumSumModulo = MaximumSubarraySum.maximumSum(a, m);
        assertEquals(4, maximumSumModulo);
    }
}