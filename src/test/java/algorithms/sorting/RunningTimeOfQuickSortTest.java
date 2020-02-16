package algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningTimeOfQuickSortTest {

    @Test
    void quickSort() {
        RunningTimeOfQuickSort.quickSort(new int[]{1, 3, 9, 8, 2, 7, 5});
    }
}