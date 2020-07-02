package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheProgrammerTest {

    @Test
    void dayOfProgrammer() {
        String day = DayOfTheProgrammer.dayOfProgrammer(1800);
        assertEquals("12.09.1800", day);
    }

    @Test
    void dayOfProgrammer2() {
        String day = DayOfTheProgrammer.dayOfProgrammer(1500);
        assertEquals("12.09.1500", day);
    }
}