package algorithms.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JimAndTheOrdersTest {

    @Test
    void jimOrders() {
        int[] customers = JimAndTheOrders.jimOrders(
                new int[][]{{8, 1},
                        {4, 2},
                        {5, 6},
                        {3, 1},
                        {4, 3}
                }
        );
        assertArrayEquals(new int[]{4, 2, 5, 1, 3}, customers);
    }
    @Test
    void jimOrders1() {
        int[] customers = JimAndTheOrders.jimOrders(
                new int[][]{{1, 1},
                        {1, 1}
                }
        );
        assertArrayEquals(new int[]{1, 2}, customers);
    }
}