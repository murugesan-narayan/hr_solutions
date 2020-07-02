package algorithms.implementation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class BirthdayChocolateTest {

    @Test
    void birthday() {
        int count = BirthdayChocolate.birthday(
                Arrays.asList(1, 2, 1, 3, 2),
                3, 2);
        assertEquals(2, count);
    }
    @Test
    void birthday1() {
        int count = BirthdayChocolate.birthday(
                Collections.singletonList(4),
                4, 1);
        assertEquals(1, count);
    }
}