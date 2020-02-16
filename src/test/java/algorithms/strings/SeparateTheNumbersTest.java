package algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparateTheNumbersTest {

    @Test
    void separateNumbers() {
        SeparateTheNumbers.separateNumbers("10001001100210031004100510061007");
        SeparateTheNumbers.separateNumbers("1234");
        SeparateTheNumbers.separateNumbers("91011");
        SeparateTheNumbers.separateNumbers("99100");
        SeparateTheNumbers.separateNumbers("101103");
        SeparateTheNumbers.separateNumbers("010203");
        SeparateTheNumbers.separateNumbers("13");
        SeparateTheNumbers.separateNumbers("1");
        SeparateTheNumbers.separateNumbers("99910001001");
        SeparateTheNumbers.separateNumbers("7891011");
        SeparateTheNumbers.separateNumbers("9899100");
        SeparateTheNumbers.separateNumbers("999100010001");
    }
}