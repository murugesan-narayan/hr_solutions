package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedKaprekarNumbersTest {

    @Test
    void kaprekarNumbers() {
        ModifiedKaprekarNumbers.kaprekarNumbers(1,100);
    }
    @Test
    void kaprekarNumbers1() {
        ModifiedKaprekarNumbers.kaprekarNumbers(400,700);
    }
}