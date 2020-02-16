package algorithms.strings;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    static int anagram(String s) {
        int len = s.length();
        if (len%2 != 0) return -1;
        int minChanges = 0;
        String str1 = s.substring(0, len/2);
        String str2 = s.substring(len/2, len);
        Map<Character, Integer> map1 = new HashMap<>();
        for(char c1 : str1.toCharArray())
            map1.put(c1, map1.getOrDefault(c1, 0) + 1);
        for (char c : map1.keySet()) {
            int count = map1.get(c);
            int fromIndex = 0;
            while (count > 0) {
                int index = str2.indexOf(c, fromIndex);
                if (index == -1) {
                    minChanges = minChanges + count;
                    break;
                }
                count--;
                fromIndex = index + 1;
            }
        }
        return minChanges;
    }
}
