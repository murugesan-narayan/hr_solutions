package eltest.livecoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChallengeTest {
    @Test
    public void testChallenge() {
        String S = "abppplee";
        String[] D = {"able", "ale", "apple", "bale", "kangaroo"};
        Challenge test = new Challenge();
        String result = test.solution(S, D);
        assertEquals("apple", result);

    }
}