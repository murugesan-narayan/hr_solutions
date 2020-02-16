package algorithms.greedy;

import java.util.TreeMap;

public class LargestPermutation {
    static int[] largestPermutation(int k, int[] arr) {
        int l = arr.length;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < l; i++) {
            map.put(arr[i], i);
        }
        for(int i = 0; i < arr.length &&  k>0; i++) {
            int val = arr.length - i;
            if(val > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[map.get(val)];
                arr[map.get(val)] = temp;
                map.put(temp, map.get(val));
                k--;
            }
        }
        return arr;
    }
}
