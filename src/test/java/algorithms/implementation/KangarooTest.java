package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KangarooTest {

    @Test
    void kangaroo() {
        String meets = Kangaroo.kangaroo(0, 2, 5, 3);
        assertEquals("NO", meets);
    }

    @Test
    void kangaroo2() {
        String meets = Kangaroo.kangaroo(21, 6, 47, 3);
        assertEquals("NO", meets);
    }

    @Test
    void kangaroo1() {
        String meets = Kangaroo.kangaroo(0, 3, 4, 2);
        assertEquals("YES", meets);
    }
}