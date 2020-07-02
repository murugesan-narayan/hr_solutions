package algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoCharactersTest {

    @Test
    void alternate() {
        int count = TwoCharacters.alternate("beabeefeab");
        assertEquals(5, count);
    }

    @Test
    void alternate1() {
        int count = TwoCharacters.alternate("beabeefeab1");
        assertEquals(5, count);
    }
}