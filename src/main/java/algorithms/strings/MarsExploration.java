package algorithms.strings;

public class MarsExploration {
    public static void main(String[] args) {
        String s = "SOS";
        char[] chars = s.toCharArray();
        int a = 0;
        int l = 1;
        for (char c : chars) {
            if (l == 1 || l == 3) if (c != 'S') a++;
            if (l == 2) if (c != 'O') a++;
            if (l == 3) l = 1;
            else l++;
        }
        System.out.println("a = " + a);
    }
}
