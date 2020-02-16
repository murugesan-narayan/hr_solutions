package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SherlockAndSquaresTest {

    @Test
    void squares() {
        int c1 = SherlockAndSquares.squares(3, 9);
        int c2 = SherlockAndSquares.squares(17, 24);
        assertEquals(2, c1);
        assertEquals(0, c2);
    }
    @Test
    void squares1() {
        int c1 = SherlockAndSquares.squares(465868129, 988379794);
        int c2 = SherlockAndSquares.squares(181510012, 293922871);
        assertEquals(9855, c1);
        assertEquals(3672, c2);
    }
}