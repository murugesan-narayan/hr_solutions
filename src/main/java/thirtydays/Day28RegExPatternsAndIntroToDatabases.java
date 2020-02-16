package thirtydays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28RegExPatternsAndIntroToDatabases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> list = new ArrayList<>();
        for (int a0 = 0; a0 < N; a0++) {
            String firstName = in.next();
            String emailID = in.next();
            String regExPattern = "[a-z].@gmail.com";

            Pattern p = Pattern.compile(regExPattern);
            Matcher m = p.matcher(emailID);
            if (m.find()) {
                list.add(firstName);
            }

        }
        Collections.sort(list);
        for (String string : list) {
            System.out.println(string);
        }

/*        List<String> list = new ArrayList<>();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            if(emailID.endsWith("@gmail.com")) list.add(firstName);
        }
        Collections.sort(list);
        for(String s: list) System.out.println(s);*/

        in.close();
    }
}
