package algorithms.implementation;

import java.util.*;
import java.util.stream.Collectors;

public class MinimumDistances {

    static int minimumDistances(int[] a) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            List<Integer> list = map.getOrDefault(a[i], new ArrayList<>());
            list.add(i);
            map.put(a[i], list);
        }
        List<List<Integer>> lists = map.values().stream().filter(l -> l.size() > 1).collect(Collectors.toList());
        int min = a.length;
        for (List<Integer> list : lists) {
            int last = list.size()-1;
            min = Math.min(min, list.get(last) - list.get(last-1));
        }
        return min == a.length ? -1 : min;
    }

}
