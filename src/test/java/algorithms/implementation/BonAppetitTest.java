package algorithms.implementation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class BonAppetitTest {

    @Test
    void bonAppetit() {
        List<Integer> list = Arrays.asList(3, 10, 2, 9);
        BonAppetit.bonAppetit(list, 1, 12);
    }

    @Test
    void bonAppetit2() {
        List<Integer> list = Arrays.asList(3, 10, 2, 9);
        BonAppetit.bonAppetit(list, 2, 15);
    }
}