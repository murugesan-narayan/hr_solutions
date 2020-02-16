package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlatlandSpaceStationsTest {

    @Test
    void flatlandSpaceStations() {
        int stations = FlatlandSpaceStations.flatlandSpaceStations(1, new int[]{0});
        assertEquals(0, stations);
    }
    @Test
    void flatlandSpaceStations1() {
        int stations = FlatlandSpaceStations.flatlandSpaceStations(6, new int[]{0, 1, 2, 4, 3, 5});
        assertEquals(0, stations);
    }
    @Test
    void flatlandSpaceStations2() {
        int stations = FlatlandSpaceStations.flatlandSpaceStations(20, new int[]{13, 1, 11, 10, 6});
        assertEquals(6, stations);
    }
}