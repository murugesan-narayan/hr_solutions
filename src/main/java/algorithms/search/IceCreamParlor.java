package algorithms.search;

import java.util.HashMap;
import java.util.Map;

public class IceCreamParlor {
    // Complete the whatFlavors function below.
    static int[] whatFlavors(int[] cost, int money) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = null;
        for (int i = 0; i < cost.length; i++) {
            int ic = cost[i];
            Integer i1 = map.get(money - ic);
            if (i1 != null) {
                result = new int[]{i1, i+1};
                break;
            } else map.put(ic, i+1);
        }
        return result;
    }
/*    static int[] whatFlavors1(int[] cost, int money) {
        int result[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < cost.length; i++) {
            int x = cost[i];
            int y = money - x;
            Integer j = map.get(y);
            if (j != null) {
                result[0] = j + 1;
                result[1] = i + 1;
                break;
            }
            map.put(x, i);
        }
        return result;
    }*/
}
