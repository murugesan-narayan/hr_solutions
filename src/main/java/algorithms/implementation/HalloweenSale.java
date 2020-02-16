package algorithms.implementation;

public class HalloweenSale {
    static int howManyGames(int p, int d, int m, int s) {
        int games = 0;
        int cost = p;
        while (cost <= s) {
            games++;
            System.out.println("p = " + p);
            if (p-d >= m) p -= d;
            else p = m;
            cost += p;
        }
        return games;
    }
}
