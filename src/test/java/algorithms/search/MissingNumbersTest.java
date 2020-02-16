package algorithms.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumbersTest {

    @Test
    void missingNumbers() {
        int[] arr = new int[] {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
        int[] brr = new int[] {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};
        int[] missingNumbers = MissingNumbers.missingNumbers(arr, brr);
        assertArrayEquals(new int[]{204, 205, 206}, missingNumbers);
    }
}