package algorithms.strings.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestValuePalindromeTest {

    @Test
    void highestValuePalindrome() {
        String highest = HighestValuePalindrome.highestValuePalindrome("3943", 4, 1);
        assertEquals("3993", highest);
    }

    @Test
    void highestValuePalindrome1() {
        String highest = HighestValuePalindrome.highestValuePalindrome("3993", 2, 2);
        assertEquals("9993", highest);
    }
}