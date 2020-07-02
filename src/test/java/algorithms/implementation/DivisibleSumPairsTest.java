package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleSumPairsTest {

    @Test
    void divisibleSumPairs() {
        int pairs = DivisibleSumPairs.divisibleSumPairs(
                6, 3,
                new int[]{1, 3, 2, 6, 1, 2}
        );
        assertEquals(5, pairs);
    }

    @Test
    void divisibleSumPairs2() {
        int pairs = DivisibleSumPairs.divisibleSumPairs(
                7, 5,
                new int[]{1, 3, 2, 6, 1, 2, 2}
        );
        assertEquals(3, pairs);
    }
}