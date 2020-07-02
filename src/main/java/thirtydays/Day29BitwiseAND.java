package thirtydays;

import java.util.Scanner;

public class Day29BitwiseAND {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //int t = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int tItr = 0; tItr < 1; tItr++) {
            //String[] nk = scanner.nextLine().split(" ");
            //int n = 955;//Integer.parseInt(nk[0]);
            //int k = 236;//Integer.parseInt(nk[1]);
            int mv = 0;
            /*for (int i=1; i<n; i++) {
                for (int j=i+1; j<=n;i++) {
                    int av = (i & j);
                    if (av < k)
                        mv = Math.max(mv, av);
                }
            }*/
            System.out.println("mv = " + mv);
        }

        scanner.close();
    }

/*    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int k = in.nextInt();
            in.close();
            if (((k - 1) | k) <= n) {
                System.out.println(k - 1);
            } else {
                System.out.println(k - 2);
            }

        }
    }*/
}
