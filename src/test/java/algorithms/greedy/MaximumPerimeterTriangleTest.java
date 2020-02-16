package algorithms.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumPerimeterTriangleTest {

    @Test
    void maximumPerimeterTriangle() {
        int[] triangle = MaximumPerimeterTriangle.maximumPerimeterTriangle(
                new int[]{1, 1, 1, 3, 3}
        );
        assertArrayEquals(new int[]{1, 3, 3}, triangle);
    }
}