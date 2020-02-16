package algorithms.strings;

import java.util.*;

public class SherlockAndTheValidString {

    public static void main(String[] args) {
        //String s = "abcdefghhgfedecba";
        //String s = "aabbc";//"aaaabbcc";
        String s = "ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd";
        //String s = "aabbc";
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        char maxChar = '0';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = map.getOrDefault(c, 0) + 1;
            map.put(c, count);
            if (count > max) {
                max = count;
                maxChar = c;
            }
        }
        String response = "YES";
        int min = map.values().stream().min(Comparator.naturalOrder()).get();
        //if (min != max && (min != max-1 || max != min-1))
        //    response = "NO";
        char minChar = '0';
        int minCount = 0;
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int v = entry.getValue();
            if (v != min && v != max) {
                response = "NO";
                break;
            }
            if (v == min) {
                minChar = entry.getKey();
                minCount++;
            }
            if (v == max) maxCount++;
        }
        int maxLen = map.get(maxChar);
        int minLen = map.get(minChar);
        if (maxCount > minCount && minCount != 1)
            response = "NO";
        else if (maxCount > minCount && minCount == 1)
            if (minLen == 1 || minLen == maxLen - 1) /*OK*/;
            else response = "NO";
        else if (minCount > maxCount && maxCount != 1)
            response = "NO";
        else if (minCount > maxCount && maxCount == 1
                && maxLen - 1 != minLen) response = "NO";
        else if (minCount == maxCount)
            response = "NO";

        System.out.println(response);
    }

}
