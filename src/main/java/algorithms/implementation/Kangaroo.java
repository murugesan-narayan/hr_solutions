package algorithms.implementation;

public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 <= v2) return "NO";
        else {
            long d1 = x1;
            long d2 = x2;
            while (d1 < d2) {
                d1 += v1;
                d2 += v2;
            }
            if (d1 == d2)
                return "YES";
        }
        return "NO";
    }
}
