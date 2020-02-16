package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyLadybugsTest {

    @Test
    void happyLadybugs() {
        String happy = HappyLadybugs.happyLadybugs("DD__FQ_QQF");
        assertEquals("YES", happy);
        String happy1 = HappyLadybugs.happyLadybugs("AABBC");
        assertEquals("NO", happy1);
        String happy2 = HappyLadybugs.happyLadybugs("AABBC_C");
        assertEquals("YES", happy2);
        String happy3 = HappyLadybugs.happyLadybugs("AABCBC");
        assertEquals("NO", happy3);
    }
}