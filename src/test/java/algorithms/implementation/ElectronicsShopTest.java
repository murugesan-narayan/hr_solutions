package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectronicsShopTest {

    @Test
    void getMoneySpent() {
        int spent = ElectronicsShop.getMoneySpent(
                new int[]{1,2},
                new int[]{2,3}, 3
        );
        assertEquals(3, spent);
    }

    @Test
    void getMoneySpent1() {
        int spent = ElectronicsShop.getMoneySpent(
                new int[]{1,2},
                new int[]{2,3}, 5
        );
        assertEquals(5, spent);
    }
}
