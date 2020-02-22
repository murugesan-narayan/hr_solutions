package algorithms.impl.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AbsolutePermutationTest {

    @Test
    void absolutePermutation_11() {
        int[][] tests = new int[][] {{10, 3}
        //,{8, 2}, {8, 0},{7, 0},{10, 1}
        };
        for (int[] t : tests) {
            int[] ints = AbsolutePermutation.absolutePermutation(t[0], t[1]);
            System.out.println(Arrays.toString(ints));
        }
        //assertArrayEquals(new int[]{2, 1}, ints);
    }
    @Test
    void absolutePermutation() {
        int[] ints = AbsolutePermutation.absolutePermutation(2, 1);
        assertArrayEquals(new int[]{2, 1}, ints);
    }
    @Test
    void absolutePermutation1() {
        int[] ints = AbsolutePermutation.absolutePermutation(3, 0);
        assertArrayEquals(new int[]{1, 2, 3}, ints);
    }
    @Test
    void absolutePermutation2() {
        int[] ints = AbsolutePermutation.absolutePermutation(3, 2);
        assertArrayEquals(new int[]{-1}, ints);
    }
}