package zalando.coding;

public class JavaCodingChallenge {

    int solution(int[] a) {
        int first, second;
        first = second = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > first) {
                second = first;
                first = a[i];
            } else if (a[i] > second && a[i] != first) {
                second = a[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            throw new RuntimeException("No second largest element found: " +
                    "Input List should have at least two different numbers " +
                    "which are greater than Integer.MIN_VALUE");
        }
        return second;
    }
}
