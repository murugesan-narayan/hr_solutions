package algorithms.impl.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingTheLeaderboardTest {

    @Test
    void climbingLeaderboard() {
        int[] scores = new int[]{
        100, 100, 50 ,40 ,40, 20, 10};
        int[] alice = new int[]{
        5 ,25, 50, 120};
        int[] ranks = ClimbingTheLeaderboard.climbingLeaderboard(scores, alice);
        assertArrayEquals(new int[]{6 ,4 ,2 ,1}, ranks);

    }
}