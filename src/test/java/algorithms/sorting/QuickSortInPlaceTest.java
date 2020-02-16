package algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortInPlaceTest {

    @Test
    void quickSort() {
        QuickSortInPlace.quickSort(new int[]{1, 3, 9, 8, 2, 7, 5});
    }
}