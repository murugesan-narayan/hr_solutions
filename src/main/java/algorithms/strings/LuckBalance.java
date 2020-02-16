package algorithms.strings;

import java.util.*;

public class LuckBalance {
    static int luckBalance(int k, int[][] contests) {
        List<Integer> impContests = new ArrayList<>();
        List<Integer> unImpContests = new ArrayList<>();
        for (int[] data: contests) {
            if (data[1] == 1) impContests.add(data[0]);
            else unImpContests.add(data[0]);
        }
        Collections.sort(impContests, Comparator.<Integer>naturalOrder().reversed());
        int sum = 0;
        for (int i = 0; !impContests.isEmpty() && i < k; i++) {
            sum += impContests.remove(0);
        }
        int unImpCount = unImpContests.stream().reduce((a,b)->a+b).orElse(0);
        int remImpCount = impContests.stream().reduce((a,b)->a+b).orElse(0);
        return sum + unImpCount - remImpCount;
    }
}
