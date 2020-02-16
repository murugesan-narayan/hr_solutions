package algorithms.implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBird {

    static int migratoryBirds(List<Integer> arr) {
        int max = 0;
        int maxType = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int type : arr) {
            int count = map.getOrDefault(type, 0)+1;
            if (count > max) {
                max = count;
                maxType = type;
            } else if (count == max)
                maxType = Math.min(maxType, type);
            map.put(type, count + 1);
        }
        return maxType;
    }

}
