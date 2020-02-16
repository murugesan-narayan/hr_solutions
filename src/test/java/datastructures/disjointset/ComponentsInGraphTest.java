package datastructures.disjointset;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ComponentsInGraphTest {

    @Test
    void componentsInGraph() {
        int[][] gb = new int[][]{{1, 6}, {2, 7}, {3, 8},
                                {4, 9}, {2, 6}};

        int[] minMaxComponents = ComponentsInGraph.componentsInGraph(gb);

        assertArrayEquals(new int[]{2, 4}, minMaxComponents);
    }

    @Test
    void componentsInGraph1() {
        int[][] gb = new int[][]{{5, 56},{4, 51},{2, 53},{8, 52},{5, 43},
                {2, 80},{5, 47},{4 ,79},{3, 75},{1, 67},
                {7 ,61},{2, 57},{5 ,47},{4, 63},{10, 79},
                {1 ,57},{4, 42},{8, 79},{6, 53},{3, 74},
                {7 ,60},{10 ,79},{5 ,46},{3 ,50},{6 ,57},
                {8 ,71},{6, 74},{10, 44},{9, 80},{7, 59},
                {7, 74},{6, 55},{3, 77},{3, 53},{5, 50},
                {9, 70},{4, 72},{5, 73},{6, 70},{7, 46}};

        int[] minMaxComponents = ComponentsInGraph.componentsInGraph(gb);

        assertArrayEquals(new int[]{11, 25}, minMaxComponents);
    }
}