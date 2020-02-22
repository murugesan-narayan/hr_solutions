package algorithms.impl.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class D3DSurfaceAreaTest {

    @Test
    void surfaceArea() {
        int[][] ints = new int[][] {{1, 3, 4},
                {2, 2, 3}, {1, 2, 4}};
        int area = D3DSurfaceArea.surfaceArea(ints);
        assertEquals(60, area);
    }
}