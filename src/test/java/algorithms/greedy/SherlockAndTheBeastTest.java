package algorithms.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SherlockAndTheBeastTest {

    @Test
    void decentNumber() {
        SherlockAndTheBeast.decentNumber(1);
        SherlockAndTheBeast.decentNumber(3);
        SherlockAndTheBeast.decentNumber(5);
        SherlockAndTheBeast.decentNumber(11);
    }
}