package algorithms.strings;

import java.util.HashMap;
import java.util.Map;

public class WeightedUniformStrings {

    static String[] weightedUniformStrings(String s, int[] queries) {
        Map<Character, Integer> weightMap = new HashMap<>();
        int i = 1;
        weightMap.put('a', i++);weightMap.put('b', i++);weightMap.put('c', i++);weightMap.put('d', i++);
        weightMap.put('e', i++);weightMap.put('f', i++);weightMap.put('g', i++);weightMap.put('h', i++);
        weightMap.put('i', i++);weightMap.put('j', i++);weightMap.put('k', i++);weightMap.put('l', i++);
        weightMap.put('m', i++);weightMap.put('n', i++);weightMap.put('o', i++);weightMap.put('p', i++);
        weightMap.put('q', i++);weightMap.put('r', i++);weightMap.put('s', i++);weightMap.put('t', i++);
        weightMap.put('u', i++);weightMap.put('v', i++);weightMap.put('w', i++);weightMap.put('x', i++);
        weightMap.put('y', i++);weightMap.put('z', i);
        Map<Integer, String> totalWeightMap = new HashMap<>();
        char prevChar = '-';
        int len = 0;
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (c != prevChar) {
                prevChar = c;
                len = 1;
            } else len++;
            int w = weightMap.get(c);
            int nw = w * len;
            totalWeightMap.put(nw, len+String.valueOf(c));
        }
        String[] result = new String[queries.length];
        int r = 0;
        for (int v: queries) {
            if (totalWeightMap.get(v) != null) result[r++] = "Yes";
            else result[r++] = "No";
        }
        return result;
    }
}
