package algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigSortingTest {

    @Test
    void bigSorting() {
        String[] arr = new String[] {"31415926535897932384626433832795", "1", "3", "10", "3", "5"};
        String[] result = BigSorting.bigSorting(arr);
        assertArrayEquals(new String[] {"1", "3", "3", "5", "10", "31415926535897932384626433832795"},
                result);
    }
}