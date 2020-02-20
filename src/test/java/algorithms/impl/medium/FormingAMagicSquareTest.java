package algorithms.impl.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormingAMagicSquareTest {

    @Test
    void formingMagicSquare() {
        int cost = FormingAMagicSquare.formingMagicSquare(
                new int[][]{
                        {4, 9, 2},
                        {3, 5, 7},
                        {8, 1, 5}
                }
        );
        assertEquals(1, cost);
    }
    @Test
    void formingMagicSquare1() {
        int cost = FormingAMagicSquare.formingMagicSquare(
                new int[][]{
                        {4, 8, 2},
                        {4, 5, 7},
                        {6, 1, 6}
                }
        );
        assertEquals(4, cost);
    }
    @Test
    void formingMagicSquare2() {
        int cost = FormingAMagicSquare.formingMagicSquare(
                new int[][]{
                        {4, 5, 8},
                        {2, 4, 1},
                        {1, 9, 7}
                }
        );
        assertEquals(14, cost);
    }
}