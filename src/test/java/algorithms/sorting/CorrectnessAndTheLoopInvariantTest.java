package algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorrectnessAndTheLoopInvariantTest {

    @Test
    void insertionSort() {
        CorrectnessAndTheLoopInvariant.insertionSort(new int[]{7, 4, 3, 5, 6, 2});
    }
}