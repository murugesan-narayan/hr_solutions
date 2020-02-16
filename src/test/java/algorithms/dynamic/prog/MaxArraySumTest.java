package algorithms.dynamic.prog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxArraySumTest {

    @Test
    void maxSubsetSum() {
        int[] arr = new int[]{2, 1, 5, 8, 4};
        int maxSubsetSum = MaxArraySum.maxSubsetSum(arr);
        assertEquals(11, maxSubsetSum);
    }

    @Test
    void maxSubsetSum_1() {
        int[] arr = new int[]{3, 7, 4, 6, 5};
        int maxSubsetSum = MaxArraySum.maxSubsetSum(arr);
        assertEquals(13, maxSubsetSum);
    }
}