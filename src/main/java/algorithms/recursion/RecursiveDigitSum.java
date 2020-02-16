package algorithms.recursion;

public class RecursiveDigitSum {
    // Complete the superDigit function below.
    static int superDigit(String n, int k) {
        n = n.chars().mapToLong(a -> Character.getNumericValue(a)).sum() * k + "";
        return n.length()==1 ? Integer.parseInt(n) : superDigit(n, 1);
    }

}
