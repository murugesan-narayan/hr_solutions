package codility.test;

import java.util.Map;
import java.util.TreeMap;
import java.util.regex.*;

public class TaskTwo {
    public static String solution(String s) {
        // write your code in Java SE 8
        String reg = "[ -]";
        s = s.replaceAll(reg, "");
        Pattern p = Pattern.compile("\\d{3}");
        Matcher mat = p.matcher(s);
        StringBuilder val = new StringBuilder();
        int l = 0;
        while(mat.find()) {
            val.append(mat.group()).append("-");
            l++;
        }
        String valS = val.toString();
        String rem = s.substring((l*3));
        System.out.println(rem);
        if(rem.isEmpty()) valS = val.deleteCharAt(val.length()-1).toString();
        if (rem.length()==1) valS = val.deleteCharAt(val.length()-1)
                .insert(val.length()-1, '-').toString();
        return valS + rem;
    }

    public static void main(String[] args) {
        //String re = solution("00-44  48 5555 83612");
        //System.out.println(re);
        String re1 = solution("0 - 22 1985--324");
        System.out.println(re1);

    }
}
