package datastructures.queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DownToZeroIITest {

    @Test
    void downToZero() {
        int downToZero = DownToZeroII.downToZero(4);
        assertEquals(3, downToZero);
    }

    @Test
    void downToZero1() {
        int downToZero = DownToZeroII.downToZero(5);
        assertEquals(4, downToZero);
    }
}