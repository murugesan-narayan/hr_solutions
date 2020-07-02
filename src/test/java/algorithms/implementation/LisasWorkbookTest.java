package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LisasWorkbookTest {

    @Test
    void workbook() {
        int spec_problems = LisasWorkbook.workbook(3, new int[]{4, 2, 6, 1, 10});
        assertEquals(4, spec_problems);
    }

    @Test
    void workbook1() {
        int spec_problems = LisasWorkbook.workbook(2, new int[]{4, 2, 6, 1, 10});
        assertEquals(2, spec_problems);
    }
}
