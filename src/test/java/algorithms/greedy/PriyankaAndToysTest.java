package algorithms.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriyankaAndToysTest {

    @Test
    void toys() {
        int containers = PriyankaAndToys.toys(new int[]{1, 2, 3, 21, 7, 12, 14, 21});
        assertEquals(4, containers);
    }
}