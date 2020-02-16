package algorithms.implementation;

public class AppendAndDelete {
    static String appendAndDelete(String s, String t, int k) {
        int sLen = s.length();
        int tLen = t.length();
        int maxOps = sLen + tLen;
        if (maxOps <= k) {
            return "Yes";
        }
        int matchCount = 0;
        for (int i = 0; i < Math.min(tLen, sLen); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                matchCount++;
            } else {
                break;
            }
        }
        int minOps = maxOps - (2 * matchCount);
        if ( k >= minOps && (k - minOps) % 2 == 0)
            return "Yes";
        return "No";
    }
}
