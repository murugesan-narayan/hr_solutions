package algorithms.search;

import java.util.List;

public class SherlockAndArray {
    static String balancedSums(List<Integer> arr) {
        long leftSum = 0;
        long rightSum = arr.stream().reduce(Integer::sum).orElse(0);
        for (int i = 0; i < arr.size(); i++) {
            if (i > 0) leftSum += arr.get(i-1);
            rightSum -= arr.get(i);
            if (leftSum == rightSum) return "YES";
        }
        return "NO";
    }
}
