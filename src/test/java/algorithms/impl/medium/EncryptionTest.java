package algorithms.impl.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptionTest {

    @Test
    void encryption() {
        String encryption = Encryption.encryption("haveaniceday");
        assertEquals("hae and via ecy", encryption);
    }
    @Test
    void encryption1() {
        String encryption = Encryption.encryption("feedthedog    ");
        assertEquals("fto ehg ee dd", encryption);
    }
    @Test
    void encryption2() {
        String encryption = Encryption.encryption("chillout");
        assertEquals("clu hlt io", encryption);
    }
}