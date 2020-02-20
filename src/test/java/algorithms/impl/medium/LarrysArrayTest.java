package algorithms.impl.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LarrysArrayTest {

    @Test
    void larrysArray() {
        String sortPossible = LarrysArray.larrysArray(new int[]{3, 1, 2});
        assertEquals("YES", sortPossible);
    }
    @Test
    void larrysArray1() {
        String sortPossible = LarrysArray.larrysArray(new int[]{1, 3, 4, 2});
        assertEquals("YES", sortPossible);
    }
    @Test
    void larrysArray2() {
        String sortPossible = LarrysArray.larrysArray(new int[]{1, 2, 3, 5, 4});
        assertEquals("NO", sortPossible);
    }
    @Test
    void larrysArray3() {
        String sortPossible = LarrysArray.larrysArray(
                new int[]{17, 21, 2, 1, 16, 9, 12, 11, 6, 18, 20, 7, 14, 8, 19, 10, 3, 4, 13, 5, 15});
        assertEquals("YES", sortPossible);
    }
}