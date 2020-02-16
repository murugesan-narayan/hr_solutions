package algorithms.implementation;

import java.util.Arrays;

public class CavityMap {
    static String[] cavityMap(String[] grid) {
        for (int i = 1; i < grid.length-1; i++) {
            char[] cg = grid[i].toCharArray();
            char[] pg = grid[i - 1].toCharArray();
            char[] ng = grid[i + 1].toCharArray();
            for (int j = 1; j < cg.length - 1; j++) {
                int middleUpper = Character.getNumericValue(pg[j]);
                int left = Character.getNumericValue(cg[j - 1]);
                int right = Character.getNumericValue(cg[j + 1]);
                int middleUnder = Character.getNumericValue(ng[j]);
                int[] adjacent = new int[] {
                    middleUpper, left, right, middleUnder };
                int ij = Character.getNumericValue(cg[j]);
                long count = Arrays.stream(adjacent).filter(a -> a < ij).count();
                if (count == adjacent.length)
                    cg[j]= 'X';
            }
            grid[i] = new String(cg);
        }
        return grid;
    }
}
