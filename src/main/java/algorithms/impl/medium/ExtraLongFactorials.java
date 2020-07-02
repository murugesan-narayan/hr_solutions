package algorithms.impl.medium;

import java.math.BigInteger;

public class ExtraLongFactorials {
    /*static void extraLongFactorials(int n) {
        System.out.println(factorial(n));
    }*/
    static BigInteger factorial(int n) {
        if (n == 0)
            return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorial(n-1));
    }
}
