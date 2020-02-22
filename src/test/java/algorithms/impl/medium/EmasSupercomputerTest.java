package algorithms.impl.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmasSupercomputerTest {

    @Test
    void twoPluses() {
        String[] input = new String[]{
                "GGGGGG",
                "GBBBGB",
                "GGGGGG",
                "GGBBGB",
                "GGGGGG"
        };
        int maxProduct = EmasSupercomputer.twoPluses(input);
        assertEquals(5, maxProduct);
    }
    @Test
    void twoPluses1() {
        String[] input = new String[]{
                "BGBBGB",
                "GGGGGG",
                "BGBBGB",
                "GGGGGG",
                "BGBBGB",
                "BGBBGB"
        };
        int maxProduct = EmasSupercomputer.twoPluses(input);
        assertEquals(25, maxProduct);
    }
}