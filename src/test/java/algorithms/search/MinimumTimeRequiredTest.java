package algorithms.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumTimeRequiredTest {

    @Test
    void minTime() {
        long[] machines = new long[]{2, 3, 2};
        long goal = 10;
        long minTime = MinimumTimeRequired.minTime(machines, goal);
        assertEquals(8, minTime);
    }

    @Test
    void minTime_1() {
        long[] machines = new long[]{1, 3, 4};
        long goal = 10;
        long minTime = MinimumTimeRequired.minTime(machines, goal);
        assertEquals(7, minTime);
    }
}