package algorithms.implementation;

public class TheHurdleRace {
    static int hurdleRace(int k, int[] height) {
        int doses = 0;
        for (int h : height) {
            if (h > k) doses = Math.max(doses, h-k);
        }
        return doses;
    }
}
