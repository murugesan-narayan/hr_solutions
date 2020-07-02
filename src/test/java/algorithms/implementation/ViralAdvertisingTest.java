package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ViralAdvertisingTest {

    @Test
    void viralAdvertising() {
        int liked = ViralAdvertising.viralAdvertising(3);
        assertEquals(9, liked);
    }

    @Test
    void viralAdvertising1() {
        int liked = ViralAdvertising.viralAdvertising(2);
        assertEquals(5, liked);
    }
}