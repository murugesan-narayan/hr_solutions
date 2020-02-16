package algorithms.dynamic.prog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandiesTest {

    @Test
    void candies() {
        int n = 3;
        int[] arr = new int[]{1,2,2};
        long candies = Candies.candies(n, arr);
        assertEquals(4, candies);
    }

    @Test
    void candies_1() {
        int n = 10;
        int[] arr = new int[]{2,4,2,6,1,7,8,9,2,1};
        long candies = Candies.candies(n, arr);
        assertEquals(19, candies);
    }

    @Test
    void candies_2() {
        int n = 8;
        int[] arr = new int[]{2,4,3,5,2,6,4,5};
        long candies = Candies.candies(n, arr);
        assertEquals(12, candies);
    }
}