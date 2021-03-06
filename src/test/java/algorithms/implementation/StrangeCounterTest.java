package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrangeCounterTest {

    @Test
    void strangeCounter() {
        long l = StrangeCounter.strangeCounter(4);
        assertEquals(6, l);
    }

    @Test
    void strangeCounter1() {
        long l = StrangeCounter.strangeCounter(5);
        assertEquals(5, l);
    }
}