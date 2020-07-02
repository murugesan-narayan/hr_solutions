package algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntroToTutorialChallengesTest {

    @Test
    void introTutorial() {
        int v = IntroToTutorialChallenges.introTutorial(1, new int[]{1});
        assertEquals(0, v);
    }

    @Test
    void introTutorial1() {
        int v = IntroToTutorialChallenges.introTutorial(3, new int[]{1,2});
        assertEquals(-1, v);
    }
}
