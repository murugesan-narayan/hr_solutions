package algorithms.sorting.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LilysHomeworkTest {

    @Test
    void lilysHomework() {
        int swaps = LilysHomework.lilysHomework(new int[]{2, 5, 3, 1});
        assertEquals(2, swaps);
    }

}