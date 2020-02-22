package algorithms.impl.medium;

import java.util.ArrayList;
import java.util.List;

public class TheGridSearch {
    static String gridSearch(String[] G, String[] P) {

        List<int[]> startIndices = new ArrayList<>();
        for (int i = 0; i < G.length; i++) {
            String s = G[i];
            int fi = 0;
            while(s.indexOf(P[0], fi) != -1) {
                int si = s.indexOf(P[0], fi);
                startIndices.add(new int[]{i, si});
                fi = si + 1;
            }
        }
        boolean found = false;
        main:
        for (int[] point : startIndices) {
            int row = point[0];
            int col = point[1];
            for (int j = 1; j < P.length && !found; j++) {
                String pat = P[j];
                String rec = G[++row];
                int index = rec.indexOf(pat, col);
                if (index != col)
                    continue main;
            }
            found = true;
        }
        return found ? "YES" : "NO";
    }
}
