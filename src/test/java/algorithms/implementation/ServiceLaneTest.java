package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceLaneTest {

    @Test
    void serviceLane() {
        int[] maximum_width = ServiceLane.serviceLane(
                new int[]{2, 3, 1, 2, 3, 2, 3, 3},
                new int[][]{
                        {0, 3}, {4, 6},
                        {6, 7}, {3, 5},
                        {0, 7}
                });
        assertArrayEquals(new int[]{1, 2, 3, 2, 1}, maximum_width);
    }
}