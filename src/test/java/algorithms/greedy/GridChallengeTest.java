package algorithms.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GridChallengeTest {

    @Test
    void gridChallenge() {
        String inOrder = GridChallenge.gridChallenge(new String[]{
                "ebacd",
                "fghij",
                "olmkn",
                "trpqs",
                "xywuv"
        });
        assertEquals("YES", inOrder);
    }

    @Test
    void gridChallenge1() {
        String inOrder = GridChallenge.gridChallenge(new String[]{
                "mpxz",
                "abcd",
                "wlmf"
        });
        assertEquals("NO", inOrder);
    }
}
