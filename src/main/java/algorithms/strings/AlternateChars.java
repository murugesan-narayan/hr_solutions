package algorithms.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlternateChars {
    public static void main(String[] args) {
        String s = "AAAA";
        int count = 0;
        for (int i=0; i<s.length()-1; i++) {
            char c = s.charAt(i);
            char nc = s.charAt(i+1);
            if (c == nc) count++;
        }
        System.out.println("count = " + count);
    }
}
