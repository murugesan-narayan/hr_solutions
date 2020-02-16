package algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuckBalanceTest {

    @Test
    void luckBalance() {
        int k = 3;
        int[][] arr = new int[][]{{5, 1}, {2, 1}, {1, 1}, {8, 1}, {10, 0}, {5, 0}};
        int luckBalance = LuckBalance.luckBalance(k, arr);
        assertEquals(29, luckBalance);
    }
}