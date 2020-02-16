package algorithms.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreedyFloristTest {

    @Test
    void getMinimumCost() {
        int[] c = new int[]{2, 5, 6};
        int k = 2;
        int minimumCost = GreedyFlorist.getMinimumCost(k, c);
        assertEquals(15, minimumCost);
    }
}
