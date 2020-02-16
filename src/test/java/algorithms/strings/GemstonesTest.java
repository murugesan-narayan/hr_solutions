package algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GemstonesTest {

    @Test
    void gemstones() {
        String[] arr = new String[]{"abcdde", "baccd", "eeabg"};
        int gemstones = Gemstones.gemstones(arr);
        assertEquals(2, gemstones);
    }
}