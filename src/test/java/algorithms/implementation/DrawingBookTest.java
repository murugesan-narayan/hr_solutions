package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawingBookTest {

    @Test
    void pageCount() {
        assertEquals(1, DrawingBook.pageCount(7, 3));
    }

    @Test
    void pageCount3() {
        assertEquals(1, DrawingBook.pageCount(6, 2));
    }
}
