package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AngryProfessorTest {

    @Test
    void angryProfessor() {
        String cancel = AngryProfessor.angryProfessor(3,
                new int[]{-1, -3, 4, 2});
        assertEquals("YES", cancel);
    }

    @Test
    void angryProfessor2() {
        String cancel = AngryProfessor.angryProfessor(2,
                new int[]{-1, -3, 4, 2});
        assertEquals("NO", cancel);
    }
}