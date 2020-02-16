package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CavityMapTest {

    @Test
    void cavityMap() {
        String[] cavityMap = CavityMap.cavityMap(new String[]{
                "1112",
                "1912",
                "1892",
                "1234"
        });
        assertArrayEquals(new String[] {
                "1112",
                "1X12",
                "18X2",
                "1234"
        }, cavityMap);
    }
}