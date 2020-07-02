package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDigitsTest {

    @Test
    void findDigits() {
        int count = FindDigits.findDigits(1012);
        assertEquals(3, count);
    }

    @Test
    void findDigits1() {
        int count = FindDigits.findDigits(10112);
        assertEquals(4, count);
    }
}