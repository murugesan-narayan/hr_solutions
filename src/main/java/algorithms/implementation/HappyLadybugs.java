package algorithms.implementation;

import java.util.HashMap;
import java.util.Map;

public class HappyLadybugs {
    static String happyLadybugs(String b) {
        Map<Character, Integer> map = new HashMap<>();
        char[] bc = b.toCharArray();
        for (char c : bc) {
            map.put(c, map.getOrDefault(c, 0) +1);
        }
        int emptyCount = map.getOrDefault('_', 0);
        map.remove('_');
        boolean singleCount = false;
        for (int count : map.values()) {
            if (count == 1) {
                singleCount = true;
                break;
            }
        }
        if (emptyCount >= 1 && !singleCount) {
            return "YES";
        }
        boolean adjacentColor = true;
        if (emptyCount == 0 && !singleCount) {
            for (int i = 1; i < bc.length - 1; i++) {
                if (bc[i-1] != bc[i] &&
                    bc[i] != bc[i+1]) {
                    adjacentColor = false;
                    break;
                }
            }
            if (adjacentColor)
                return "YES";
        }
        return "NO";
    }
}
