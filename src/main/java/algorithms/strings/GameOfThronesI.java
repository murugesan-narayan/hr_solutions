package algorithms.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GameOfThronesI {
    static String gameOfThrones(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        boolean oddLenCharFound = false;
        for (int count: map.values()) {
            if (count%2 == 1) {
                if (!oddLenCharFound) oddLenCharFound = true;
                else return "NO";
            }
        }
        return "YES";
    }
}