package algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

public class QuickSort1Partition {

    static int[] quickSort(int[] arr) {
        int p = arr[0];
        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int v : arr) {
            if (v < p) left.add(v);
            else if (v > p) right.add(v);
            else equal.add(v);
        }
        left.addAll(equal);
        left.addAll(right);
        return left.stream().mapToInt(i->i).toArray();
    }
}
