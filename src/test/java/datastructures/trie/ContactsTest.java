package datastructures.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactsTest {

    @Test
    void contacts() {
        String[][] queries = new String[][]{
                {"add", "hack"}, {"add", "hackerrank"},
                {"find", "hac"}, {"find", "hak"}};
        int[] counts = Contacts.contacts(queries);
        assertArrayEquals(new int[]{2,0}, counts);
    }
}