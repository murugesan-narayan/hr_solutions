package algorithms.bit.manipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximizingXORTest {

    @Test
    void maximizingXor() {
        int xor = MaximizingXOR.maximizingXor(10, 15);
        assertEquals(7, xor);
    }
    @Test
    void maximizingXor1() {
        int xor = MaximizingXOR.maximizingXor(11,100);
        assertEquals(127, xor);
    }
}