package algorithms.search;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SherlockAndArrayTest {

    @Test
    void balancedSums() {
        List<Integer> arr = Arrays.asList(5,6,8,11);
        String balanced = SherlockAndArray.balancedSums(arr);
        assertEquals("YES", balanced);
    }
}