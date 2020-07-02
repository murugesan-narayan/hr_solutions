package algorithms.strings;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class SpecialStringAgain {

    public static void main(String[] args) {
        LocalDateTime lts = LocalDateTime.now();
        System.out.println(lts);
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine();
        int count = str.length();
        int lookupSize = 2;
        for (int i=0; i < str.length(); i++) {
            while (i + lookupSize <= str.length()) {
                String sub = str.substring(i, i + lookupSize);
                if (isSpecialPalindrome(sub))
                    count++;
                else if (lookupSize >= 3) {
                    Map<Character, Integer> map = new HashMap<>();
                    for (char c: sub.toCharArray()) map.put(c, map.getOrDefault(c, 0)+1);
                    if(map.size() != 2) break;
                    //map.size();
                    int min = map.values().stream().min(Comparator.naturalOrder()).get();
                    if (min != 1)
                        break;//count = 1272919
                    //System.out.println(sub);
                }
                lookupSize++;
            }
            lookupSize = 2;
        }
        /*int lookupSize = 2;
         while (lookupSize <= str.length()) {
             int loopLen = str.length() - lookupSize + 1;
             for (int i=0; i < loopLen; i++) {
                 String sub = str.substring(i, i + lookupSize);
                 if (isSpecialPalindrome(sub))
                     count++;
             }
             lookupSize++;
         }*/
         System.out.println("count = " + count);
         LocalDateTime lte = LocalDateTime.now();
         System.out.println(lte);
         long minutes = ChronoUnit.MILLIS.between(lts, lte);
         System.out.println(minutes);
    }

    public static boolean isSpecialPalindrome(String str) {
        //System.out.println("str = " + str);
        int len = str.length();
        char c = str.charAt(0);
        boolean flag = true;
        for (int i = 0; i < len/2 ; i++)
            if (str.charAt(i) != c || str.charAt(len - i - 1) != c) {
                flag = false;
                break;
            }
        return flag;
    }

}
