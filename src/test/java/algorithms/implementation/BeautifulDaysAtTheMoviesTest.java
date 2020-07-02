package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeautifulDaysAtTheMoviesTest {

    @Test
    void beautifulDays() {
        int beautifulDays = BeautifulDaysAtTheMovies.beautifulDays(20, 23, 6);
        assertEquals(2, beautifulDays);
    }

    @Test
    void beautifulDays2() {
        int beautifulDays = BeautifulDaysAtTheMovies.beautifulDays(2, 3, 7);
        assertEquals(2, beautifulDays);
    }
}