package algorithms.impl.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AbsolutePermutation {
    static int[] absolutePermutation(int n, int k) {
        int[] per = new int[n];
        int d = 1;
        for (int i = 0, j = 0; i < n; i++, j++) {
            if (j == k) {
                d *= -1;
                j = 0;
            }

            int value = i + 1 + k * d;
            if (value < 1 || value > n)
                return new int[]{-1};
            per[i] = value;
        }
        return per;
    }
    static int[] absolutePermutation1(int n, int k) {
        int[] result = IntStream.rangeClosed(1, n).toArray();
        Map<Integer, Integer> nums = Arrays.stream(result)
                .boxed().collect(Collectors.toMap(key->key, val->0));
        if (k == 0) return result;
        for (int i = 1; i <= n; i++) {
            int v = -1;
            for(int key : nums.keySet()) {
                if (Math.abs(key-i) == k) {
                    result[i - 1] = key;
                    v = key;
                    break;
                }
            }
            if (v == -1)
                return new int[]{-1};
            else
                nums.remove(v);
        }
        return result;
    }
}
