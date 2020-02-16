package algorithms.implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        int max = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int v : a) {
            countMap.put(v, countMap.getOrDefault(v,0) + 1);
        }
        for (int cv : countMap.keySet()) {
            int count = countMap.get(cv);
            int upperCount = count + countMap.getOrDefault(cv+1, 0);
            int lowerCount = count + countMap.getOrDefault(cv-1, 0);
            count = Math.max(upperCount, lowerCount);
            max = Math.max(max, count);
        }
        return max;
    }
}
