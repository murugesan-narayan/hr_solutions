package algorithms.debugging;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XORStringsTest {

    @Test
    void stringsXOR() {
        String s = "3";
        String t = "5";
        assertEquals("1", XORStrings.stringsXOR(s, t));
    }
}