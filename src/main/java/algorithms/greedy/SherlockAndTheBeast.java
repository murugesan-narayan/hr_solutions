package algorithms.greedy;

import java.util.Arrays;

public class SherlockAndTheBeast {
    static void decentNumber(int n) {
        int x = 0;
        int y = 0;
        for (int i = n; i >= 0; i--) {
            if (i % 3 == 0 && (n - i) % 5 == 0) {
                x = i;
                y = n - i;
                break;
            }
        }
        if (x == 0 && y == 0)
            System.out.println(-1);
        else {
            char[] ca = new char[n];
            Arrays.fill(ca, 0, x, '5');
            Arrays.fill(ca, x, n, '3');
            System.out.println(ca);
        }
    }
}
