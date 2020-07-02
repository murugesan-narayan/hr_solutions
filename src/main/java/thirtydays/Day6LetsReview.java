package thirtydays;

import java.util.Scanner;

public class Day6LetsReview {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();
        sc.nextLine();
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < noOfTest; i++) {
            String input = sc.next();
            char[] char1 = input.toCharArray();
            for (int j = 0; j < char1.length; j++) {
                if (j % 2 == 0) {
                    str1.append(char1[j]);
                    System.out.println("str1 = " + str1 + " j % 2: "+ j % 2);
                } else {
                    str2.append(char1[j]);
                    System.out.println("str2 = " + str2 + " j % 2: "+ j % 2);
                }
            }
            System.out.println(str1 + " " + str2);
            str1 = new StringBuilder(str2 = new StringBuilder());
        }
        sc.close();
    }
}
