package algorithms.bit.manipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumVsXORTest {
    @Test
    public void sumXor() {
        long count = SumVsXOR.sumXor(5);
        assertEquals(2, count);
    }
    @Test
    public void sumXor2() {
        long count = SumVsXOR.sumXor(6);
        assertEquals(2, count);
    }
}