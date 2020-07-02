package algorithms.sorting;

import org.junit.jupiter.api.Test;


class InsertionSortPart1Test {

    @Test
    void insertionSort1() {
        //InsertionSortPart1.insertionSort1(7, new int[]{5,3,7,1,8,9,2}); //this wont sort
        InsertionSortPart1.insertionSort1(5, new int[]{2, 4, 6, 8, 3});
    }

    @Test
    void insertionSort2() {
        InsertionSortPart1.insertionSort1(6, new int[]{2, 4, 6, 8, 3,1});
    }
}
