package algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {

    @Test
    void caesarCipher() {
        String enc = CaesarCipher.caesarCipher("middle-Outz", 2);
        assertEquals("okffng-Qwvb", enc);
    }
    @Test
    void caesarCipher1() {
        String enc = CaesarCipher.caesarCipher("middle-1Outz", 3);
        assertEquals("plggoh-1Rxwc", enc);
    }

}