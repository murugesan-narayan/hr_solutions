package datastructures.stacks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxRiddleTest {

    @Test
    void riddle() {
        long[] arr = new long[]{2, 6, 1, 12};
        long[] riddle = MinMaxRiddle.riddle(arr);
        long[] res = new long[]{12, 2, 1, 1};
        boolean equals = Arrays.equals(res, riddle);
        assertEquals(true, equals);
    }
}