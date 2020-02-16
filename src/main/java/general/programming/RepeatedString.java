package general.programming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatedString {
    public static void main(String[] args) {
        String s = "aab";
        Pattern ap = Pattern.compile("a");
        Matcher m = ap.matcher(s);
        long ac = 0;
        while (m.find()) ac++;
        long l = s.length();
        long rl = 882787;
        long r = rl/l;
        long trl = r*l;
        int el = (int) (rl - trl);
        long eac = 0;
        if(el != 0) {
            String es = s.substring(0, el);
            m = ap.matcher(es);
            while (m.find()) eac++;
        }
        long end = (ac * r) + eac;

        /*StringBuilder sb = new StringBuilder(s);
        while (sb.length() <= l) sb.append(s);
        long n = sb.length();
        long r = n % s.length();
        if(sb.length() > l) sb.delete(sb.length()-r, sb.length());
        //sb.setLength(l);
        String rs = sb.toString().replaceAll("[^a]", "");*/
        System.out.println("l = " + l);
        System.out.println("rl = " + rl);
        System.out.println("trl = " + trl);
        System.out.println("el = " + el);
        System.out.println("r = " + r);
        System.out.println("ac = " + ac);
        System.out.println("eac = " + eac);
        System.out.println("end = " + end);
    }
}
