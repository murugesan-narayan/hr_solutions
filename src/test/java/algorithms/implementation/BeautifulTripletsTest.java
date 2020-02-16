package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeautifulTripletsTest {

    @Test
    void beautifulTriplets() {
        int beautifulTriplets = BeautifulTriplets.beautifulTriplets(3,
                new int[]{1, 2, 4, 5, 7, 8, 10});
        assertEquals(3, beautifulTriplets);
    }
}