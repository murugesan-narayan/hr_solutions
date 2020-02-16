package algorithms.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IceCreamParlorTest {

    @Test
    void whatFlavors() {
        int[] cost = new int[]{1, 4, 5, 3, 2};
        int money = 4;
        int[] flavors = IceCreamParlor.whatFlavors(cost, money);
        assertEquals(1, flavors[0]);
        assertEquals(4, flavors[1]);
    }

    @Test
    void whatFlavors_1() {
        int[] cost = new int[]{2, 2, 4, 3};
        int money = 4;
        int[] flavors = IceCreamParlor.whatFlavors(cost, money);
        assertEquals(1, flavors[0]);
        assertEquals(2, flavors[1]);
    }
}