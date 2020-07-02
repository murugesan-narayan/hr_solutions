package algorithms.implementation;

public class SaveThePrisoner {
    static int saveThePrisoner(int n, int m, int s) {
        if (n == 1) return n;
        int rem = m % n;
        if (rem == 0) rem = n;
        s = s-1 + rem;
        if (s > n) s = s-n;
        return s;
    }
}
