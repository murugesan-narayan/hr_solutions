package algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfThronesITest {

    @Test
    void gameOfThrones() {
        String isPalindrome = GameOfThronesI.gameOfThrones("aaabbbb");
        assertEquals("YES", isPalindrome);
        isPalindrome = GameOfThronesI.gameOfThrones("cdefghmnopqrstuvw");
        assertEquals("NO", isPalindrome);
        isPalindrome = GameOfThronesI.gameOfThrones("cdcdcdcdeeeef");
        assertEquals("YES", isPalindrome);
    }
}