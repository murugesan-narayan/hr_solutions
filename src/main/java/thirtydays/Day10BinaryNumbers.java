package thirtydays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day10BinaryNumbers {
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int r = n, counter = 0, maxOne = 0;
        String s = "";
        while (n > 0) {
            System.out.println("n = " + n);
            r = n % 2;
            if (r == 1) {
                counter++;
                if (counter > maxOne) {
                    maxOne = counter;
                    System.out.println("maxOne = " + maxOne);
                }
            } else {
                counter = 0;
            }
            s = r + s;
            n = n / 2;

        }
        System.out.println(maxOne);

    }

    public static void main(String[] args) {
        String bStr = Integer.toBinaryString(439);
        System.out.println(bStr);
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<bStr.length(); i++) {
            char c = bStr.charAt(i);
            if (c == '1') {
                count++;
                if (i == bStr.length()-1) list.add(count);
            } else if (count > 0) {
                list.add(count);
                count = 0;
            }
        }
        if(list.isEmpty()) list.add(count);
        //System.out.println(list);
        System.out.println(Collections.max(list));
    }

}
