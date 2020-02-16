package algorithms.strings;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoStrings {

    public static void main(String[] args) {
        String s1 = "A12";
        String s2 = "B2";
        Set<Character> charSet = new HashSet();
        s1.chars().mapToObj(i -> (char)i).forEach(letter->charSet.add(letter));
        for(int i = 0; i < s2.length(); i++)
            if( charSet.contains(s2.charAt(i)))
                System.out.println("YES");
        System.out.println("NO");
    }
}
