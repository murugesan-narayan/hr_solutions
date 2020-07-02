package algorithms.game.theory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntroductionToNimGameTest {

    @Test
    void nimGame() {
        assertEquals("First", IntroductionToNimGame.nimGame(new int[]{1,2}));
    }

    @Test
    void nimGame2() {
        assertEquals("First", IntroductionToNimGame.nimGame(new int[]{15,12}));
    }
}