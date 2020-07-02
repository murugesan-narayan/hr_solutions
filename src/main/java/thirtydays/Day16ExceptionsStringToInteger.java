package thirtydays;

import java.util.Scanner;

public class Day16ExceptionsStringToInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        in.close();
        int i;
        try {
            i = Integer.parseInt(S);
            System.out.println(i);

        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
