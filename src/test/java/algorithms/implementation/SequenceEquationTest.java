package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenceEquationTest {

    @Test
    void permutationEquation() {
        int[] ints = SequenceEquation.permutationEquation(
                new int[] {5, 2, 1, 3, 4}
        );
        assertArrayEquals(new int[]{4, 2, 5, 1, 3}, ints);
    }
}