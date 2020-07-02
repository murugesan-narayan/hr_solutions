package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppendAndDeleteTest {

    @Test
    void appendAndDelete() {
        String isConverted = AppendAndDelete.appendAndDelete("hackerhappy", "hackerrank", 9);
        assertEquals("Yes", isConverted);

    }

    @Test
    void appendAndDelete2() {
        String isConverted = AppendAndDelete.appendAndDelete("hackerhappy1", "hackerrank1", 11);
        assertEquals("Yes", isConverted);

    }
}