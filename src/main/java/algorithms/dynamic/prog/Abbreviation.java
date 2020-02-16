package algorithms.dynamic.prog;

import java.util.*;

public class Abbreviation {
    /*
    a: the string to modify
    b: the string to match

    Capitalize zero or more of a's lowercase letters.
    Delete all of the remaining lowercase letters in a.
    */
    static String abbreviation1(String a, String b) {
        int al = a.length();
        int bl = b.length();
        if (bl > al)
            return "NO";
        //check in all chars are there
        Map<Character, Integer> map = new HashMap<>();
        for (char bc : b.toCharArray()) {
            int ibc = a.indexOf(bc);
            if (ibc == -1)
                ibc = a.indexOf(Character.toLowerCase(bc));
            if (ibc == -1)
                return "NO";
            map.put(bc, map.getOrDefault(bc,0) + 1);
        }
        //remove all other lower case letters and check if any uppercase which is not found in "a"
        String str = a;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (Character.isLowerCase(c) && map.get(Character.toUpperCase(c)) == null )
                str = str.replaceAll(Character.toString(c), "");
            /*else if (Character.isUpperCase(c) && map.get(c) == null)
                return "NO";*/
        }
        str = str.toUpperCase();

        if (!str.equals(b)) return "NO";
        /*for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            int fromIndex = 0;
            for (int i = 0; i < count; i++) {
                int index = str.indexOf(c, fromIndex);
                if (index == -1) return "NO";
                fromIndex = index + 1;
            }
        }*/

        return "YES";
    }

    static String abbreviation(String a, String b) {
        int al = a.length();
        int bl = b.length();
        if (bl > al) return "NO";
        //check in all chars are there
        Set<Character> lcSet = new HashSet<>();
        Set<Character> ucSet = new HashSet<>();
        for (char bc : b.toCharArray()) {
            int ibc = a.indexOf(bc);
            if (ibc == -1) {
                ibc = a.indexOf(Character.toLowerCase(bc));
                if (ibc != -1) lcSet.add(a.charAt(ibc));
            }
            if (ibc == -1) return "NO";
            ucSet.add(bc);
        }
        //remove all other lower case letters
        String str = a;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(Character.isLowerCase(c) && //b.indexOf(Character.toUpperCase(c)) == -1)
                    !lcSet.contains(c))
                str = str.replaceAll(
                        Character.toString(c), "");
            else if (Character.isUpperCase(c) &&
                    b.indexOf(c) == -1)
                return "NO";
        }

        if (!str.toUpperCase().equals(b)) {
            String ucSetStr = ucSet.stream().map((a1)-> "" + a1).reduce((a2,b2)->a2+b2).get();
            if(str.equals(ucSetStr)) return "YES";
            return "NO";
        }
        return "YES";
    }

}
