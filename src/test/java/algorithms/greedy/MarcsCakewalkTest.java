package algorithms.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarcsCakewalkTest {

    @Test
    void marcsCakewalk() {
        long minMiles = MarcsCakewalk.marcsCakewalk(new int[]{1, 3, 2});
        assertEquals(11, minMiles);
    }
}