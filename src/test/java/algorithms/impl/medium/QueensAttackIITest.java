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
}