package algorithms.impl.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrganizingContainersOfBallsTest {

    @Test
    void organizingContainers() {
        int[][] input = new int[][] {
                {1, 3, 1}, {2, 1, 2}, {3, 3, 3}};
        String result = OrganizingContainersOfBalls.organizingContainers(input);
        assertEquals("Impossible", result);
    }
    @Test
    void organizingContainers1() {
        int[][] input = new int[][] {
                {0, 2, 1}, {1, 1, 1}, {2, 0, 0}};
        String result = OrganizingContainersOfBalls.organizingContainers(input);
        assertEquals("Possible", result);
    }
}