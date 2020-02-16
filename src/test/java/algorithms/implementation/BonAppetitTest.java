package algorithms.implementation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BonAppetitTest {

    @Test
    void bonAppetit() {
        List<Integer> list = Arrays.asList(3, 10, 2, 9);
        BonAppetit.bonAppetit(list, 1, 12);
    }
}