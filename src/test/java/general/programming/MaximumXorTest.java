package general.programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumXorTest {

    @Test
    void maxXor() {
        int[] arr = new int[]{0, 1, 2};
        int[] queries = new int[]{3,7,2};
        int[] maxXor = MaximumXor.maxXor(arr, queries);
        assertArrayEquals(new int[]{3,7,3}, maxXor);
    }
}