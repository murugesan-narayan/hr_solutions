package algorithms.implementation;

import java.util.HashMap;
import java.util.Map;

public class EqualizeTheArray {
    static int equalizeArray(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int v : arr)
            countMap.put(v, countMap.getOrDefault(v, 0) + 1);
        int minDeletions = Integer.MAX_VALUE;
        for (int count : countMap.values())
            minDeletions = Math.min(minDeletions, arr.length - count);
        return minDeletions;
    }
}
