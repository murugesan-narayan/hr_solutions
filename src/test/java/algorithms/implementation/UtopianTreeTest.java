package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtopianTreeTest {

    @Test
    void utopianTree() {
        int height = UtopianTree.utopianTree(4);
        assertEquals(7, height);
    }

    @Test
    void utopianTree1() {
        int height = UtopianTree.utopianTree(5);
        assertEquals(14, height);
    }
}
