package algorithms.debugging;

public class XORStrings {
    public static String stringsXOR(String s, String t) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i))
                res.append("0");
            else
                res.append("1");
        }

        return res.toString();
    }
}
