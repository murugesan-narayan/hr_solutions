package algorithms.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TwoCharacters {

    static int alternate(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        Character[] chars = set.toArray(new Character[set.size()]);
        int maxLen = 0;
        for (int i = 0; i < chars.length-1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                String pattern = "[^"+chars[i]+chars[j]+"]";
                String rem = s.replaceAll(pattern, "");
                if (rem.length() < maxLen) continue;
                if (isTwoCharacter(rem)) maxLen = rem.length();
            }
        }
        return maxLen;
    }
    static boolean isTwoCharacter(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) return false;
        }
        return true;
    }

    static int alternate1(String s) {
        Set<Character> char_set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char_set.add(s.charAt(i));
        }

        Character[] char_arr = char_set.toArray(new Character[char_set.size()]);
        int max = 0;

        for (int j = 0; j < char_arr.length - 1; j++) {
            for (int k = j + 1; k < char_arr.length; k++) {
                String pattern = "([^" + char_arr[j] + char_arr[k] + "])";
                String trimmedStr = s.replaceAll(pattern, "");
                if (isTwoCharacter(trimmedStr) && trimmedStr.length() > max) {
                    max = trimmedStr.length();
                }
            }
        }
        return max;
    }

    static boolean isTwoCharacter1(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }
}
