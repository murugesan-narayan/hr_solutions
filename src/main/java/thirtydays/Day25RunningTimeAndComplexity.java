package thirtydays;

import java.util.Scanner;

public class Day25RunningTimeAndComplexity {
    static boolean isPrime_T(int n) {
        if (n<=1) return false;
        if (n<=3) return true;
        if (n%2 == 0 || n%3 == 0) return false;
        for (int i=5; i*i <= n; i=i+6) {
            if (n%i == 0 || n%(i+2) == 0)
                return false;
        }
        return true;
    }
    static boolean isPrime(int n) {
        /*if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;*/
        if(n<=1) return false;
        double sqrOfN = Math.sqrt(n);
        for (int i=2; i<=sqrOfN; i++) if(n%i==0) return false;
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String result = isPrime(sc.nextInt()) ? "Prime" : "Not prime";
            System.out.println(result);
        }
        sc.close();
    }
}
