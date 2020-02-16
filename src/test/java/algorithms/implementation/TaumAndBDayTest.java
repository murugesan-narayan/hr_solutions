package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaumAndBDayTest {
    @Test
    void taumBday11() {
        long cost = TaumAndBDay.taumBday(68406, 12718,
                532909, 315341, 201009);
        assertEquals(39331944938L, cost);
    }
    @Test
    void taumBday() {
        long cost = TaumAndBDay.taumBday(27984, 1402,
                619246, 615589, 247954);
        assertEquals(18192035842L, cost);
    }

    @Test
    void taumBday2() {
        long cost = TaumAndBDay.taumBday(7, 7,
                4, 2, 1);
        assertEquals(35, cost);
    }

    @Test

    void taumBday3() {
        long cost = TaumAndBDay.taumBday(3, 6,
                9, 1, 1);
        assertEquals(12, cost);
    }
}
