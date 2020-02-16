package algorithms.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeautifulPairsTest {

    @Test
    void beautifulPairs() {
        int pairs = BeautifulPairs.beautifulPairs(
                new int[]{1, 2, 3, 4},
                new int[]{1, 2, 3, 3}
        );
        assertEquals(4, pairs);
    }
    @Test
    void beautifulPairs1() {
        int pairs = BeautifulPairs.beautifulPairs(
                new int[]{3, 5, 7, 11, 5, 8},
                new int[]{5, 7, 11, 10, 5, 8}
        );
        assertEquals(6, pairs);
    }
}