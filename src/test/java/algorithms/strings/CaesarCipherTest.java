package algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {

    @Test
    void caesarCipher() {
        String enc = CaesarCipher.caesarCipher("middle-Outz", 2);
        assertEquals("okffng-Qwvb", enc);
    }
}