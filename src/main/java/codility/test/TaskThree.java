package codility.test;

import java.util.regex.Matcher;
import java.time.*;

public class TaskThree {
    public static String solution(int Y, String A, String B, String W) {
        // write your code in Java SE 8
        LocalDate date = LocalDate.of(Y, Month.valueOf(B), 1);
        return "";
    }

    public static void main(String[] args) {
        String re1 = solution(2014, "April", "May", "Wednesday");
        System.out.println(re1);

    }
}
