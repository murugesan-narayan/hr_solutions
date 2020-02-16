package algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheLoveLetterMysteryTest {

    @Test
    void theLoveLetterMystery() {
        int ops1 = TheLoveLetterMystery.theLoveLetterMystery("abc");
        assertEquals(2, ops1);
        int ops2 = TheLoveLetterMystery.theLoveLetterMystery("abcba");
        assertEquals(0, ops2);
        int ops3 = TheLoveLetterMystery.theLoveLetterMystery("abcd");
        assertEquals(4, ops3);
        int ops4 = TheLoveLetterMystery.theLoveLetterMystery("cba");
        assertEquals(2, ops4);
    }
}