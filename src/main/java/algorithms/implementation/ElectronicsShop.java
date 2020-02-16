package algorithms.implementation;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int spent = -1;
        for (int kv : keyboards) {
            for (int dv : drives) {
                int cost = kv + dv;
                if (cost <= b)
                    spent = Math.max(spent, cost);
            }
        }
        return spent;
    }
}
