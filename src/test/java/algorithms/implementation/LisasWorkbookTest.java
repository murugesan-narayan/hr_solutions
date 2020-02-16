package algorithms.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LisasWorkbookTest {

    @Test
    void workbook() {
        int spec_problems = LisasWorkbook.workbook(5, 3, new int[]{4, 2, 6, 1, 10});
        assertEquals(4, spec_problems);
    }
}