package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpingOnTheCloudsRevisitedTest {

    @Test
    void jumpingOnClouds() {
        int energy = JumpingOnTheCloudsRevisited.jumpingOnClouds(
                new int[]{0, 0, 1, 0, 0, 1, 1, 0},
                2);
        assertEquals(92, energy);
    }
    @Test
    void jumpingOnClouds1() {
        int energy = JumpingOnTheCloudsRevisited.jumpingOnClouds(
                new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0},
                3);
        assertEquals(80, energy);
    }
}