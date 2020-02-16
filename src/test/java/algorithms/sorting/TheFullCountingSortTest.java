package algorithms.sorting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TheFullCountingSortTest {

    @Test
    void countSort() {
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("0", "ab"));
        list.add(Arrays.asList("6", "cd"));
        list.add(Arrays.asList("0", "ef"));
        list.add(Arrays.asList("6", "gh"));
        list.add(Arrays.asList("4", "ij"));
        list.add(Arrays.asList("0", "ab"));
        list.add(Arrays.asList("6", "cd"));
        list.add(Arrays.asList("0", "ef"));
        list.add(Arrays.asList("6", "gh"));
        list.add(Arrays.asList("0", "ij"));
        list.add(Arrays.asList("4", "that"));
        list.add(Arrays.asList("3", "be"));
        list.add(Arrays.asList("0", "to"));
        list.add(Arrays.asList("1", "be"));
        list.add(Arrays.asList("5", "question"));
        list.add(Arrays.asList("1", "or"));
        list.add(Arrays.asList("2", "not"));
        list.add(Arrays.asList("4", "is"));
        list.add(Arrays.asList("4", "the"));
        list.add(Arrays.asList("2", "to"));
        TheFullCountingSort.countSort(list);
    }
}