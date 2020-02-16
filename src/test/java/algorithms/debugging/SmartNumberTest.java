package algorithms.debugging;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartNumberTest {

    @Test
    void isSmartNumber() {
        boolean smartNumber = SmartNumber.isSmartNumber(2);
        assertEquals(false, smartNumber);
    }
    @Test
    void isSmartNumber1() {
        boolean smartNumber = SmartNumber.isSmartNumber(169);
        assertEquals(true, smartNumber);
    }
}