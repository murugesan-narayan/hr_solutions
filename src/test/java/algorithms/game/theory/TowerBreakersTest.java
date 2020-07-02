package algorithms.game.theory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TowerBreakersTest {

    @Test
    void towerBreakers() {
        assertEquals(1, TowerBreakers.towerBreakers(3, 5));
    }

    @Test
    void towerBreakers2() {
        assertEquals(1, TowerBreakers.towerBreakers(5, 6));
    }
}
