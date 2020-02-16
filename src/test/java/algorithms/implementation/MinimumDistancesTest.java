package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDistancesTest {

    @Test
    void minimumDistances() {
        int min = MinimumDistances.minimumDistances(new int[]{7, 1, 3, 4, 1, 7});
        assertEquals(3, min);
    }

}
