package algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheMedianTest {

    @Test
    void findMedian() {
        int median = FindTheMedian.findMedian(new int[]{0, 1, 2, 4, 6, 5, 3});
        assertEquals(3, median);
    }
}