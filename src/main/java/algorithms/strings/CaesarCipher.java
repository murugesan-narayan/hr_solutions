package algorithms.strings;

import java.util.HashMap;
import java.util.Map;

public class CaesarCipher {
    static String caesarCipher(String s, int k) {
        StringBuilder encryptedStr = new StringBuilder();
        Map<Character, Character> encryptMap = new HashMap<>();
        for (char c: s.toCharArray()) {
            char encrypted = c;
            if (Character.isAlphabetic(c))
                encrypted = encryptMap.computeIfAbsent(c, c1 -> encryptChar(c1, k));
            encryptedStr.append(encrypted);
        }
        return encryptedStr.toString();
    }

    private static char encryptChar(char c, int k) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int i = alpha.indexOf(Character.toLowerCase(c));
        i = i + k;
        while (i >= alpha.length()) i = i - alpha.length();
        char rc = alpha.charAt(i);
        if (Character.isUpperCase(c)) rc = Character.toUpperCase(rc);
        return rc;
    }
}
