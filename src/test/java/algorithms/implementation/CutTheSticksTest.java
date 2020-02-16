package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CutTheSticksTest {

    @Test
    void cutTheSticks() {
        int[] sticks = CutTheSticks.cutTheSticks(new int[]{5, 4, 4, 2, 2, 8});
        assertArrayEquals(new int[] {6,4,2,1}, sticks);
    }
}