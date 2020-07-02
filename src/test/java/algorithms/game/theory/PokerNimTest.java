package algorithms.game.theory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokerNimTest {

    @Test
    void pokerNim() {
       assertEquals("First", PokerNim.pokerNim(5, new int[]{3, 2}));
    }

    @Test
    void pokerNim2() {
        assertEquals("First", PokerNim.pokerNim(7, new int[]{3, 2}));
    }
}