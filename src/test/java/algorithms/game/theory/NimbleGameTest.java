package algorithms.game.theory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NimbleGameTest {

    @Test
    void nimbleGame() {
        assertEquals("First", NimbleGame.nimbleGame(new int[]{5, 7}));
    }
}