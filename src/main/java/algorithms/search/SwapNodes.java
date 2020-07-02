package algorithms.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapNodes {

    public static void main(String[] args) {
        int[][] indexes = new int[][]{ {2, 3}, {-1, -1}, {-1, -1} };
        int[] queries = new int[]{1, 1};
        int[][] result = swapNodes(indexes, queries);
        System.out.println("result = " + Arrays.toString(result));
    }

    static int[][] swapNodes(int[][] indexes, int[] queries) {
        int[][] result = null;
        int i = 0;
        for (int k : queries) {
            swap(indexes, k);
            int[] rs = printInOrder(indexes);
            if(result == null) result = new int[queries.length][rs.length];
            result[i++] = rs;
        }
        return result;
    }

    static int[] printInOrder(int[][] indices) {
        List<Integer> result = new ArrayList<>();
        print(indices, 1, result);
        //System.out.println("result = " + result);
        return result.stream().mapToInt(i->i).toArray();
    }

    static void print(int[][] indices, int current, List<Integer> result){
        if (current < 0) return;
        print(indices, indices[current-1][0], result);
        result.add(current);
        print(indices, indices[current-1][1], result);
    }

    static void swap(int[][] indices, int k) {
        swap(indices, k, 1, 1);
    }

    static void swap(int[][] indices, int k, int current, int depth){
        if (current < 0) return;
        if (depth % k == 0) {
            int[] temp = indices[current-1];
            indices[current-1] = new int[]{temp[1],temp[0]};
        }
        swap(indices, k, indices[current-1][0], depth + 1);
        swap(indices, k, indices[current-1][1], depth + 1);
    }

}
