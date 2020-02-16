package algorithms.implementation;

public class FindDigits {
    static int findDigits(int n) {
        String val = String.valueOf(n);
        int count = 0;
        for (char c : val.toCharArray()) {
            int num = Character.getNumericValue(c);
            if (num != 0 && n%num == 0)  count++;
        }
        return count;
    }
}
