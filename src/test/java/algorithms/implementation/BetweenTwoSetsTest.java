package algorithms.implementation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BetweenTwoSetsTest {

    @Test
    void getTotalX() {
        List<Integer> list1 = Arrays.asList(2, 4);
        List<Integer> list2 = Arrays.asList(16, 32, 96);
        int totalX = BetweenTwoSets.getTotalX(list1, list2);
        assertEquals(3, totalX);
    }
}