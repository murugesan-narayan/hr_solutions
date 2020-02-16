package algorithms.implementation;


public class ChocolateFeast {
    static int chocolateFeast(int n, int c, int m) {
        int count = n/c;
        if (count < m) return count;
        else if (count == m) return count+1;
        int wrap = count;
        do {
            count += wrap/m;
            wrap = (wrap / m) + (wrap % m);
        } while (wrap>=m);

        return count;
    }

}
