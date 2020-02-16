package algorithms.strings;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
//TODO NOT completed
public class CommonChild {
    public static void main(String[] args) {
        String s1 = "SHINCHAN";
        String s2 = "NOHARAAA";
        int i1 = commonChild(s1, s2);
        List<Character> list1 = s1.chars().mapToObj(i -> (char)i).collect(Collectors.toList());
        List<Character> list2 = s2.chars().mapToObj(i -> (char)i).collect(Collectors.toList());
        list1.retainAll(list2);
        list2.retainAll(list1);
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        int foundLongLength = 0;
        int size1 = list1.size();
        int size2 = list2.size();
        if (size1 == size2) {
            while(!list1.isEmpty()) {
                if (isSubStrFound(s1, list2) && isSubStrFound(s2, list1)) {
                    foundLongLength = list1.size();
                    break;
                } else {
                    list1.remove(list1.size() - 1);
                    list2.remove(list2.size() - 1);
                }
            }
        } else if (size1 < size2) {
            while(list1.size() != list2.size()) list2.remove(list2.size()-1);
            while(!list1.isEmpty()) {
                if (isSubStrFound(s1, list2) && isSubStrFound(s2, list1)) {
                    foundLongLength = list1.size();
                    break;
                } else {
                    list1.remove(0); //list1.size() - 1);
                    list2.remove(0); //list2.size() - 1);
                }
            }
        }
        System.out.println(foundLongLength);
    }
    static boolean isSubStrFound(String str, List<Character> sub) {
        int ci = 0;
        for(int i = 0; i < sub.size(); i++) {
            char c = sub.get(i);
            ci = str.indexOf(c, ci);
            if (ci == -1) return false;
        }
        return true;
    }

    static int commonChild(String s1, String s2) {
        int len = s1.length();
        int[][] mat = new int[len + 1][len + 1];
        for (int i = 0; i <= len; i++) {
            mat[i][0] = 0;
            mat[0][i] = 0;
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    mat[i + 1][j + 1] = mat[i][j] + 1;
                } else {
                    mat[i + 1][j + 1] =
                            mat[i + 1][j] > mat[i][j + 1] ?
                                    mat[i + 1][j] : mat[i][j + 1];
                }
            }
        }
        return mat[len][len];
    }

}
