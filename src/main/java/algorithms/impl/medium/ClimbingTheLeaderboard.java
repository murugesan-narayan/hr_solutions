package algorithms.impl.medium;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ClimbingTheLeaderboard {
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] array = IntStream.of(scores).distinct().toArray();
        int i = array.length-1;
        for (int j = 0; j < alice.length; j++) {
            int score = alice[j];
            while (i >= 0) {
                if (score >= array[i]) i--;
                else {
                    alice[j] = i+2;
                    break;
                }
            }
            if(i < 0) alice[j] = 1;
        }
        return alice;
    }
}
