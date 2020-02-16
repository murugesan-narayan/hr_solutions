package algorithms.implementation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PickingNumbersTest {

    @Test
    void pickingNumbers() {
        List<Integer> list = Arrays.asList(4, 6, 5, 3, 3, 1);
        int len = PickingNumbers.pickingNumbers(list);
        assertEquals(3, len);
    }
}