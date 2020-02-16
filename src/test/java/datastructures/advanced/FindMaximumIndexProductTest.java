package datastructures.advanced;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaximumIndexProductTest {

    @Test
    void solve() {
        int[] arr = new int[]{5, 4, 3, 4, 5};
        long maximumIndex = FindMaximumIndexProduct.solve(arr);
        assertEquals(8, maximumIndex);
    }

    @Test
    void solve1() {
        int[] arr = new int[]{1000000000, 1000000000, 1000000000, 0, 1000000000, 1000000000};
        long maximumIndex = FindMaximumIndexProduct.solve(arr);
        assertEquals(15, maximumIndex);
    }
}