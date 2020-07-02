package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryFineTest {

    @Test
    void libraryFine() {
        int fine = LibraryFine.libraryFine(9, 6, 2015, 6, 6, 2015);
        assertEquals(45, fine);
    }

    @Test
    void libraryFine1() {
        int fine = LibraryFine.libraryFine(7, 7, 2016, 7, 8, 2016);
        assertEquals(0, fine);
    }
}