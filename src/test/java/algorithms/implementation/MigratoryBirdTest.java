package algorithms.implementation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MigratoryBirdTest {

    @Test
    void migratoryBirds() {
        List<Integer> list = Arrays.asList(1, 4, 4, 4, 5, 3);
        int birdType = MigratoryBird.migratoryBirds(list);
        assertEquals(4, birdType);
    }
}