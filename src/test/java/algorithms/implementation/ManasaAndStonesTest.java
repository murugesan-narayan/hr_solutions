package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManasaAndStonesTest {

    @Test
    void stones() {
        int[] stones = ManasaAndStones.stones(3, 1, 2);
        assertArrayEquals(new int[]{2, 3, 4 }, stones);
    }

    @Test
    void stones1() {
        int[] stones = ManasaAndStones.stones(5, 2, 3);
        assertArrayEquals(new int[]{8, 9, 10, 11, 12 }, stones);
    }
}
