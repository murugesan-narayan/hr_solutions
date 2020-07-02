package algorithms.game.theory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfStonesTest {

    @Test
    void gameOfStones() {
        assertEquals("First", GameOfStones.gameOfStones(5));
    }

    @Test
    void gameOfStones2() {
        assertEquals("Second", GameOfStones.gameOfStones(7));
    }
}