package algorithms.implementation;

import java.util.Set;
import java.util.TreeSet;

public class ManasaAndStones {
    static int[] stones(int n, int a, int b) {
        Set<Integer> finalStones = new TreeSet<>();
        for(int i = 0; i < n; i++){
            int sum = (i * a) + ((n-1-i)*b);
            finalStones.add(sum);
        }
        return finalStones.stream().mapToInt(av-> av).toArray();
    }
}
