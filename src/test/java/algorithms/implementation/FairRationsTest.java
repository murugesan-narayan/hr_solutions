package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FairRationsTest {

    @Test
    void fairRations() {
        String count = FairRations.fairRations(new int[]{2, 3, 4, 5, 6});
        assertEquals("4", count);
    }
    @Test
    void fairRations1() {
        String count = FairRations.fairRations(new int[]{1,2});
        assertEquals("NO", count);
    }
}