package algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void anagram() {
        int changes11 = Anagram.anagram("fdhlvosfpafhalll");
        assertEquals(5, changes11);
        int changes1 = Anagram.anagram("aaabbb");
        assertEquals(3, changes1);
        int changes2 = Anagram.anagram("ab");
        assertEquals(1, changes2);
        int changes3 = Anagram.anagram("abc");
        assertEquals(-1, changes3);
        int changes4 = Anagram.anagram("mnop");
        assertEquals(2, changes4);
        int changes5 = Anagram.anagram("xyyx");
        assertEquals(0, changes5);
        int changes6 = Anagram.anagram("xaxbbbxx");
        assertEquals(1, changes6);
    }
}