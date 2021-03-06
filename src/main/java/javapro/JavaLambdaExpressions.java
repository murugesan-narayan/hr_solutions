package javapro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Kanahaiya Gupta
 *
 */
interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    //My Code
    /*PerformOperation isOdd() {
        return n -> n%2==1;
    }
    PerformOperation isPrime() {
        return n -> {
            if(n<=1) return false;
            double sqrOfN = Math.sqrt(n);
            for (int i=2; i<=sqrOfN; i++) if(n%i==0) return false;
            return true;
        };
    }
    PerformOperation isPalindrome() {
        return n -> {
            String original = ""+n;
            String reversed = new StringBuilder(original).reverse().toString();
            if(original.equals(reversed)) return true;
            else return false;
        };
    }*/

    // Write your code here
    public static PerformOperation isOdd() {
        return n -> ((n & 1) == 1);
    }

    public static PerformOperation isPrime() {
        return n -> {
            if (n < 2) {
                return false;
            } else {
                int k = (int) Math.sqrt(n);
                for (int i = 2; i <= k; i++) {
                    if (n % i == 0)
                        return false;
                }
                return true;
            }
        };
    }

    public static PerformOperation isPalindrome() {
        return n -> {
            String org = n + "";
            String newString = new StringBuffer(org).reverse().toString();
            return org.equals(newString);
        };
    }
}

public class JavaLambdaExpressions {
    public static void main(String[] args) throws IOException {
        //MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = MyMath.isOdd();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = MyMath.isPrime();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = MyMath.isPalindrome();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
