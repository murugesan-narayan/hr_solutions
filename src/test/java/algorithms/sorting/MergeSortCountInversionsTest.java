package algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortCountInversionsTest {

    @Test
    void countInversions() {
        int[] arr = new int[]{2, 1, 3, 1, 2};
        long l = MergeSortCountInversions.countInversions(arr);
        assertEquals(4, l);
    }

    @Test
    void countInversions_2() {
        int[] arr = new int[]{2, 4, 1};
        long l = MergeSortCountInversions.countInversions(arr);
        assertEquals(2, l);
    }

    @Test
    void countInversions_3() {
        int[] arr = new int[]{1, 1, 1, 2, 2};
        long l = MergeSortCountInversions.countInversions(arr);
        assertEquals(0, l);
    }

    @Test
    void countInversions_4() {
        int[] arr = new int[]{1, 5, 3, 7};
        long l = MergeSortCountInversions.countInversions(arr);
        assertEquals(1, l);
    }

    @Test
    void countInversions_5() {
        int[] arr = new int[]{7, 5, 3, 1};
        long l = MergeSortCountInversions.countInversions(arr);
        assertEquals(6, l);
    }

}