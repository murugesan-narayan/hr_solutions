package algorithms.impl.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueensAttackIITest {

    @Test
    void queensAttack() {
        int count = QueensAttackII.queensAttack(
                4, 0,
                4, 4,
                new int[][]{}
        );
        assertEquals(9, count);
    }

    @Test
    void queensAttack1() {
        int count = QueensAttackII.queensAttack(
                2, 2,
                2, 2,
                new int[][]{ {1,2}, {2,3} }
        );
        assertEquals(2, count);
    }
}