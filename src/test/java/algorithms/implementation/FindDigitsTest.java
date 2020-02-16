package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDigitsTest {

    @Test
    void findDigits() {
        int count = FindDigits.findDigits(1012);
        assertEquals(3, count);
    }
}