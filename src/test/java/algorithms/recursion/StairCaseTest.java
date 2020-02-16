package algorithms.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StairCaseTest {

    @Test
    void stepPerms() {
        int stepPerms = StairCase.stepPerms(1);
        assertEquals(1, stepPerms);
    }

    @Test
    void stepPerms_1() {
        int stepPerms = StairCase.stepPerms(3);
        assertEquals(4, stepPerms);
    }

    @Test
    void stepPerms_2() {
        int stepPerms = StairCase.stepPerms(7);
        assertEquals(44, stepPerms);
    }

}