package algorithms.bit.manipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LonelyIntegerTest {

    @Test
    void lonelyinteger() {
        int lone = LonelyInteger.lonelyinteger(new int[]{1});
        assertEquals(1, lone);
    }
    @Test
    void lonelyinteger3() {
        int lone = LonelyInteger.lonelyinteger(new int[]{0, 0, 1, 2, 1});
        assertEquals(2, lone);
    }
    @Test
    void lonelyinteger2() {
        int lone = LonelyInteger.lonelyinteger(new int[]{1,1,2});
        assertEquals(2, lone);
    }
}