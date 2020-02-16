package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppendAndDeleteTest {

    @Test
    void appendAndDelete() {
        String isConverted = AppendAndDelete.appendAndDelete("hackerhappy", "hackerrank", 9);
        assertEquals("Yes", isConverted);

    }
}