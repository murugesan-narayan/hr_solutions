package javapro;

public class FlippingBits {
    public static void main(String[] args) {
        long n = 2147483647;
        long result = flippingBits(n);
        System.out.println("result = " + result);
    }
    static long flippingBits(long n) {
        return ~n & 0xFFFFFFFFL;
    }
}
