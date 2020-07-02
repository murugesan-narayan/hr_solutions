package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HalloweenSaleTest {

    @Test
    void howManyGames() {
        int games = HalloweenSale.howManyGames(20, 3, 6, 80);
        assertEquals(6, games);
    }

    @Test
    void howManyGames1() {
        int games = HalloweenSale.howManyGames(21, 5, 7, 85);
        assertEquals(8, games);
    }
}
