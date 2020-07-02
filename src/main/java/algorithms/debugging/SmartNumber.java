package algorithms.debugging;

public class SmartNumber {
    public static boolean isSmartNumber(int num) {
        int val = (int) Math.sqrt(num);
        return val * val == num;
    }
}
