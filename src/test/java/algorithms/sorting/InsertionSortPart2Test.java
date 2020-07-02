package algorithms.sorting;

import org.junit.jupiter.api.Test;


class InsertionSortPart2Test {

    @Test
    void insertionSort2() {
        InsertionSortPart2.insertionSort2(8, new int[]{1, 4, 3, 5, 1, 6,1, 2});
    }

    @Test
    void insertionSort3() {
        InsertionSortPart2.insertionSort2(7, new int[]{1, 4, 3, 5, 1, 6,1});
    }
}