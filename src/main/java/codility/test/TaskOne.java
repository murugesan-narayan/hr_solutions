package codility.test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.TreeMap;

public class TaskOne {
    public static String solution(String[] A, String[] B, String P) {
        // write your code in Java SE 8
        Map<String, String> map = new TreeMap<>();
        for (int i = 0; i < B.length; i++) {
            if (B[i].contains(P)) map.put(A[i], B[i]);
        }
        if (map.isEmpty())
            return "NO CONTACT";
        else return map.keySet().stream().findFirst().get();
    }

    public static void main(String[] args) {
        String re = solution(new String[]{"pim", "pom"},new String[]{"123", "567"},"56");
        System.out.println(re);
    }
}
