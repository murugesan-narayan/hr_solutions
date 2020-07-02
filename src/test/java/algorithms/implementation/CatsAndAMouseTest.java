package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatsAndAMouseTest {

    @Test
    void catAndMouse() {
        String who = CatsAndAMouse.catAndMouse(1, 2, 3);
        assertEquals("Cat B", who);
    }

    @Test
    void catAndMouse2() {
        String who = CatsAndAMouse.catAndMouse(2, 3, 5);
        assertEquals("Cat B", who);
    }
}