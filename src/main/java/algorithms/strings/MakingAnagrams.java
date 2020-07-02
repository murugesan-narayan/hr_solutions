package algorithms.strings;

import java.util.*;

public class MakingAnagrams {

 /*   public static void main(String[] args) {
        String a = "bugexikjevtubidpulaelsbcqlupwetzyzdvjphn";
        String b = "lajoipfecfinxjspxmevqxuqyalhrsxcvgsdxxkacspbchrbvvwnvsdtsrdk";
        makeAnagram(a, b);
    }*/
    static int makingAnagrams(String s1, String s2) {
        int minCharsDeletion = 0;
        Map<Character, Integer> map1 = new HashMap<>();
        for (char c : s1.toCharArray())
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : s2.toCharArray())
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        for (char c : map1.keySet()) {
            Integer count1 = map1.get(c);
            Integer count2 = map2.get(c);
            if (count2 == null)
                minCharsDeletion += count1;
            else if (count1.equals(count2))
                map2.remove(c);
            else if (count1 > count2) {
                minCharsDeletion += count1 - count2;
                map2.remove(c);
            } else
                map2.put(c, count2 - count1);
        }
        Integer countB = map2.values().stream().reduce(Integer::sum).orElse(0);
        minCharsDeletion += countB;
        return minCharsDeletion;
    }
 /*   // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int count = 0;
        List<Character> as = a.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> bs = b.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        System.out.println("as = " + as);
        System.out.println("bs = " + bs);
        as.retainAll(bs);
        bs.retainAll(as);
        Map<Character, Integer> aMap = new HashMap<>();
        for (Character c: as) aMap.put(c, aMap.getOrDefault(c, 0)+1);
        Map<Character, Integer> bMap = new HashMap<>();
        for (Character c: bs) bMap.put(c, bMap.getOrDefault(c, 0)+1);
        for (char c: aMap.keySet()) {
            int l1 = aMap.get(c);
            int l2 = bMap.get(c);
            if (l1 != l2)
                count += Math.abs(l1-l2);
        }
        System.out.println("as = " + as);
        System.out.println("bs = " + bs);
        count += a.length() + b.length() - as.size()- bs.size();
        System.out.println("Missing chars = " +count);
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main1(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }*/
}
