package algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutTheSticks {
    static int[] cutTheSticks(int[] arr) {
        Arrays.sort(arr);
        List<Integer> result = new ArrayList<>();
        while (arr.length > 0) {
            result.add(arr.length);
            int minVal = arr[0];
            arr = Arrays.stream(arr).map(v -> v-minVal).filter(v-> v > 0).toArray();
        }
        return result.stream().mapToInt(av->av).toArray();
    }

}
