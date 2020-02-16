package algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClosestNumbersTest {

    @Test
    void closestNumbers() {
        int[] pairs = ClosestNumbers.closestNumbers(
                new int[]{
                        -20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854
                }
        );
        assertArrayEquals(new int[]{-20, 30}, pairs);
    }
}