package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularArrayRotationTest {

    @Test
    void circularArrayRotation() {
        int[] values = CircularArrayRotation.circularArrayRotation(
                new int[]{3, 4, 5}, 2,
                new int[]{1, 2}
        );
        assertArrayEquals(new int[]{5,3}, values);
    }

    @Test
    void circularArrayRotation2() {
        int[] values = CircularArrayRotation.circularArrayRotation(
                new int[]{3, 4, 5}, 3,
                new int[]{1, 2}
        );
        assertArrayEquals(new int[]{4,5}, values);
    }
}
