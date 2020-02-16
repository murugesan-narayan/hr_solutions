package datastructures.disjointset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ComponentsInGraph {
    static int[] componentsInGraph(int[][] gb) {
        Map<Integer, Set<Integer>> unionMap = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int[] joint : gb) {
            int v1 = joint[0]; int v2 = joint[1];
            Set<Integer> group1 = unionMap.get(v1);
            Set<Integer> group2 = unionMap.get(v2);
            if (group1 == null && group2 == null) {
                group1 = new HashSet<>();
                group1.add(v1); group1.add(v2);
                unionMap.put(v1, group1);
                unionMap.put(v2, group1);
            } else if (group1 == null & group2 != null) {
                group2.add(v1);
                unionMap.put(v1 , group2);
            } else if (group1 != null & group2 == null) {
                group1.add(v2);
                unionMap.put(v2, group1);
            } else {
                if (group1 == group2) /* NO OPS */;
                else if (group1.size() < group2.size()) {
                    group2.addAll(group1);
                    for (int iv : group1) unionMap.put(iv, group2);
                    group1 = null;
                } else {
                    group1.addAll(group2);
                    unionMap.put(v2, group1);
                    for (int iv : group2) unionMap.put(iv, group1);
                    group2 = null;
                }
            }
            int size = group1 != null ? group1.size() : group2.size();
            max = Math.max(max, size);
        }
        for (Set<Integer> set :unionMap.values()) min = Math.min(min, set.size());
        return new int[]{min, max};
    }
}
