package algorithms.strings;

public class FunnyString {
    public static void main(String[] args) {
        String s = "lmnop";
        String r = new StringBuilder(s).reverse().toString();
        for (int i=0; i<s.length()-1; i++) {
            int sc1 = s.charAt(i);
            int sc2 = s.charAt(i+1);
            int rc1 = r.charAt(i);
            int rc2 = r.charAt(i+1);
            if (Math.abs(sc1-sc2) != Math.abs(rc1-rc2)){
                System.out.println("Not Funny");return;}

        }
        System.out.println("Funny");
    }
}
