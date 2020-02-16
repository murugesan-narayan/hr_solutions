package algorithms.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripleSumTest {

    @Test
    void triplets() {
        int[] a = {1, 3, 5};
        int[] b = {2, 3};
        int[] c = {1, 2, 3};
        long triplets = TripleSum.triplets(a, b, c);
        assertEquals(8, triplets);
    }
}