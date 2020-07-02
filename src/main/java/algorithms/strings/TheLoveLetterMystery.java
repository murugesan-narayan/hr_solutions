package algorithms.strings;

public class TheLoveLetterMystery {
    static int theLoveLetterMystery(String s) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int len = s.length();
        StringBuilder sb = new StringBuilder(s);
        int operations = 0;
        boolean isNotPalindrome = true;
        wl:
        while (isNotPalindrome) {
            for (int i = 0; i < len / 2; i++) {
                int endIndex = len - i - 1;
                char startChar = sb.charAt(i);
                char endChar = sb.charAt(endIndex);
                if (startChar != endChar) {
                    if (startChar > endChar) {
                        char r = alpha.charAt(alpha.indexOf(startChar) - 1);
                        sb.setCharAt(i, r);
                    } else {
                        char r = alpha.charAt(alpha.indexOf(endChar) - 1);
                        sb.setCharAt(endIndex, r);
                    }
                    operations++;
                    continue wl;
                }
            }
            isNotPalindrome = false;
        }
        return operations;
    }
}
