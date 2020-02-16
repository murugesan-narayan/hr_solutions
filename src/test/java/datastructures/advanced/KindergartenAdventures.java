package datastructures.advanced;

import java.util.ArrayList;
import java.util.List;

public class KindergartenAdventures {
    static int solve1(int[] t) {
        int maxDrawings = Integer.MIN_VALUE;
        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < t.length-1; i++) {
            int time = 0;
            int drawings = 0;
            int start = i;
            for (int j = i; j < t.length; j++) {
                int jv = t[j];
                if (jv <= time++) drawings++;
            }
            for (int k = 0; k < start; k++) {
                int kv = t[k];
                if (kv <= time++) drawings++;
            }
            if (drawings > maxDrawings) {
                maxDrawings = drawings;
                minIndex = start + 1;
            } else if (drawings == maxDrawings)
                minIndex = Math.min(minIndex, start + 1);
        }
        return minIndex;
    }

    static int solve(int[] t) {
        int n = t.length;
        int[] adjust = new int[n];
        int current = 0;
        for(int i = 0; i < n; i++){
            if(i >= t[i]){
                current++;
            }
            adjust[(i+1-t[i]+n)%n]--;
            adjust[(i+1)%n]++;
        }

        int result = 0;
        int bestVal = current;

        for(int i=1; i<n; i++){ // von 1!..n-1
            if((current +=adjust[i])> bestVal){
                bestVal =current;
                result = i;
            }
        }
        return result+1;
    }
}
