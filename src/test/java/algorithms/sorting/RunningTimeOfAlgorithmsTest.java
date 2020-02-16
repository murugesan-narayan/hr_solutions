package algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningTimeOfAlgorithmsTest {

    @Test
    void runningTime() {
        int time = RunningTimeOfAlgorithms.runningTime(new int[]{2, 1, 3, 1, 2});
        assertEquals(4, time);
    }
}