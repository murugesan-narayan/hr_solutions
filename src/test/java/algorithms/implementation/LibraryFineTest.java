package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryFineTest {

    @Test
    void libraryFine() {
        int fine = LibraryFine.libraryFine(9, 6, 2015, 6, 6, 2015);
        assertEquals(45, fine);
    }
}