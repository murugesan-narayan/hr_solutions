package datastructures.queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DownToZeroIITest {

    @Test
    void downToZero() {
        int downToZero = DownToZeroII.downToZero(4);
        assertEquals(3, downToZero);
    }
}