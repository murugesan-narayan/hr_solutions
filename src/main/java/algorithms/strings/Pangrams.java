package algorithms.strings;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Pangrams {
    public static void main(String[] args) {
        String s = "123We promptly judged 123antique ivory buckles for the next prize";
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z]", "");
        System.out.println("s = " + s);
        char[] chars = s.toCharArray();
        Set<Character> charSet = new LinkedHashSet<>();
        for (char c : chars) {
            charSet.add(c);
        }
        System.out.println("l = " + charSet.size());
    }
}
