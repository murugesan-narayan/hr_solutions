package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleAndOrangeTest {

    @Test
    void countApplesAndOranges() {
        int[] apples = new int[] {-2, 2, 1};
        int[] oranges = new int[] {5, -6};
        AppleAndOrange.countApplesAndOranges(7, 11,
                5,15, apples, oranges);

    }
}