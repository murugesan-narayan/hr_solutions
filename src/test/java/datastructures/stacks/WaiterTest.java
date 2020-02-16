package datastructures.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaiterTest {

    @Test
    void waiter() {
        int[] number = new int[]{3, 4, 7, 6, 5};
        int q = 1;
        int[] plates = Waiter.waiter(number, q);
        assertArrayEquals(new int[]{4,6,3,7,5}, plates);

    }

    @Test
    void waiter1() {
        int[] number = new int[]{3, 3, 4, 4, 9};
        int q = 2;
        int[] plates = Waiter.waiter(number, q);
        assertArrayEquals(new int[]{4,4,9,3,3}, plates);
    }
}