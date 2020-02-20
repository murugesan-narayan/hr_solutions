package algorithms.impl.medium;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class ExtraLongFactorialsTest {

    @Test
    void factorial() {
        BigInteger factorial = ExtraLongFactorials.factorial(25);
        assertEquals("15511210043330985984000000", factorial.toString());
    }
}