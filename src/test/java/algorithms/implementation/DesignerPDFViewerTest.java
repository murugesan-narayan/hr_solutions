package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesignerPDFViewerTest {

    @Test
    void designerPdfViewer() {
        int area = DesignerPDFViewer.designerPdfViewer(
                new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}
                , "abc"
        );
        assertEquals(9, area);
    }
}