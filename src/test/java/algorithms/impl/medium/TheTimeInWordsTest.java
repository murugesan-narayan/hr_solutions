package algorithms.impl.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheTimeInWordsTest {

    @Test
    void timeInWords() {
        String timeInWords = TheTimeInWords.timeInWords(5, 47);
        assertEquals(
                "thirteen minutes to six", timeInWords
        );
    }
}