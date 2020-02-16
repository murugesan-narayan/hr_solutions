package algorithms.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairsSearchTest {

    @Test
    void pairs_1() {
        int[] arr = new int[]{1, 2, 3, 4};
        int k = 1;
        int count = PairsSearch.pairs(k, arr);
        assertEquals(3, count);
    }

    @Test
    void pairs_2() {
        int[] arr = new int[]{1, 5, 3, 4, 2};
        int k = 2;
        int count = PairsSearch.pairs(k, arr);
        assertEquals(3, count);
    }
}