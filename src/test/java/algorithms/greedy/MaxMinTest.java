package algorithms.greedy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxMinTest {

    @Test
    void maxMin() {
        int[] arr = new int[]{10, 100, 300, 200, 1000, 20, 30};
        int minUnfair = MaxMin.maxMin(3, arr);
        assertEquals(20, minUnfair);
    }

    @Test
    void maxMin2() {
        int[] arr = new int[]{10, 100, 300, 200, 1000, 20, 30};
        int minUnfair = MaxMin.maxMin(5, arr);
        assertEquals(190, minUnfair);
    }

}
