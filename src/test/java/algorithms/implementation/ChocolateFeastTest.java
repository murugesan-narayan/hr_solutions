package algorithms.implementation;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ChocolateFeastTest {

    @Test
    void chocolateFeast() {
        int feast = ChocolateFeast.chocolateFeast(10, 2, 5);
        assertEquals(6, feast);
    }
    @Test
    void chocolateFeast1() {
        int feast = ChocolateFeast.chocolateFeast(12, 4, 4);
        assertEquals(3, feast);
    }
    @Test
    void chocolateFeast2() {
        int feast = ChocolateFeast.chocolateFeast(6, 2, 2);
        assertEquals(5, feast);
    }

}