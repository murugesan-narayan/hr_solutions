package algorithms.strings;

public class PalindromeIndex {

    public static void main(String[] args) {
        String s = "aaab";
        int i = palindromeIndex(s);
        System.out.println("i = " + i);
    }

    static int palindromeIndex(String s) {
        int palindromeIndex = -1;
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                if (i + 1 < len) {
                    boolean isRightStringValidPalindrome = isValidPalindrome(s.substring(i + 1, len - i));
                    if (isRightStringValidPalindrome)
                        return i;
                    return len - i - 1;
                }
            }
        }
        return palindromeIndex;
    }

    public static boolean isValidPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++)
            if (str.charAt(i) != str.charAt(len - i - 1)) return false;
        return true;
    }
}
