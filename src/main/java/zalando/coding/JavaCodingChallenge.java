package zalando.coding;

public class JavaCodingChallenge {

    int solution(int[] a) {
        int largest, secondLargest;
        largest = secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            throw new RuntimeException("No second largest element found: " +
                    "Input List should have at least two different numbers " +
                    "which are greater than Integer.MIN_VALUE");
        }
        return secondLargest;
    }
}
