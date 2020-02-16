package general.programming;

public class CountingValleys {
    public static void main(String[] args) {
        String s = "UDDDUDUU";
        int l = s.length();
        int level = 0;
        int prev_level = 0;
        int vc = 0;
        for (int i=0; i<l; i++) {
            char c = s.charAt(i);
            prev_level = level;
            if (c == 'U') level++;
            if (c == 'D') level--;
            if (level == 0 && prev_level <0) vc++;
        }
        System.out.println("vc = " + vc);
    }
}
