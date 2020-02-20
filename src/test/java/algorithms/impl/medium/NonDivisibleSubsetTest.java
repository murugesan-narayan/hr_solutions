package algorithms.impl.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NonDivisibleSubsetTest {

    @Test
    void nonDivisibleSubset() {
        int count = NonDivisibleSubset.nonDivisibleSubset(3,
                Arrays.asList(1, 7, 2, 4));
        assertEquals(3, count);
    }
}