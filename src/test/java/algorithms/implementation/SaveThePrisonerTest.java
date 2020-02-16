package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaveThePrisonerTest {
    @Test
    public void saveThePrisoner() {
        int prisoner = SaveThePrisoner.saveThePrisoner(5, 2, 1);
        assertEquals(2, prisoner);
    }

   @Test
    public void saveThePrisoner1() {
        int prisoner = SaveThePrisoner.saveThePrisoner(7, 19, 2);
        assertEquals(6, prisoner);
    }

   @Test
    public void saveThePrisoner2() {
        int prisoner = SaveThePrisoner.saveThePrisoner(499999999, 999999998, 2);
        assertEquals(1, prisoner);
    }

}