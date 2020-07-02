package algorithms.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPermutationTest {

    @Test
    void largestPermutation() {
        int[] permutation = LargestPermutation.largestPermutation(1,
                new int[]{4, 2, 3, 5, 1});
        assertArrayEquals(new int[]{5, 2, 3, 4, 1}, permutation);
    }
    @Test
    void largestPermutation1() {
        int[] permutation = LargestPermutation.largestPermutation(1,
                new int[]{2, 1, 3});
        assertArrayEquals(new int[]{3, 1, 2}, permutation);
    }
    @Test
    void largestPermutation2() {
        int[] permutation = LargestPermutation.largestPermutation(1,
                new int[]{2, 1});
        assertArrayEquals(new int[]{2, 1}, permutation);
    }
    @Test
    void largestPermutation3() {
        int[] permutation = LargestPermutation.largestPermutation(2,
                new int[]{2, 1});
        assertArrayEquals(new int[]{2, 1}, permutation);
    }
}
