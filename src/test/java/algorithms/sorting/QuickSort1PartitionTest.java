package algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSort1PartitionTest {

    @Test
    void quickSort() {
        int[] sorted = QuickSort1Partition.quickSort(new int[]{4, 5, 3, 7, 2});
        assertArrayEquals(new int[]{3, 2, 4, 5, 7}, sorted);
    }
}