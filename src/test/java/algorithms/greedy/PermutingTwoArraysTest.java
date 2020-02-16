package algorithms.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutingTwoArraysTest {

    @Test
    void twoArrays() {
        String valid = PermutingTwoArrays.twoArrays(
                10,
                new int[]{2, 1, 3},
                new int[]{7, 8, 9}
        );
        assertEquals("YES", valid);
    }
    @Test
    void twoArrays1() {
        String valid = PermutingTwoArrays.twoArrays(
                5,
                new int[]{1, 2, 2, 1},
                new int[]{3, 3, 3, 4}
        );
        assertEquals("NO", valid);
    }
}
