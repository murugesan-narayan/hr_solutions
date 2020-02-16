package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManasaAndStonesTest {

    @Test
    void stones() {
        int[] stones = ManasaAndStones.stones(3, 1, 2);
        assertArrayEquals(new int[]{2, 3, 4 }, stones);
    }
}