package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheHurdleRaceTest {

    @Test
    void hurdleRace() {
        int doses = TheHurdleRace.hurdleRace(4,
                new int[]{1, 6, 3, 5, 2});
        assertEquals(2, doses);
    }
}