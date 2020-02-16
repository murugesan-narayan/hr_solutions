package algorithms.greedy;

import java.util.Arrays;

public class GridChallenge {
    static String gridChallenge(String[] grid) {
        int gl = grid.length;
        int sl = grid[0].length();
        char[][] grids = new char[gl][gl];
        int i = 0;
        for (String g : grid) {
            char[] c = g.toCharArray();
            Arrays.sort(c);
            grids[i++] = c;
        }
        for (int j = 0; j < sl; j++) {
            char pc = 'a';
            for (int k = 0; k < gl; k++) {
                char c = grids[k][j];
                if (pc > c)
                    return "NO";
                pc = c;
            }
        }
        return "YES";
    }
}
