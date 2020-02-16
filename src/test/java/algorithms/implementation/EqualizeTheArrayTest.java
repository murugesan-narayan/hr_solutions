package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualizeTheArrayTest {

    @Test
    void equalizeArray() {
        int minDel = EqualizeTheArray.equalizeArray(new int[]{3, 3, 2, 1, 3});
        assertEquals(2, minDel);
    }
}