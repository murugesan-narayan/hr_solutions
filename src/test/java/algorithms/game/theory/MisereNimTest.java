package algorithms.game.theory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MisereNimTest {

    @Test
    void misereNim() {
        assertEquals("First", MisereNim.misereNim(new int[]{7, 6}));
    }
}