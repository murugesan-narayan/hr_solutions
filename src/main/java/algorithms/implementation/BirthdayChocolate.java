package algorithms.implementation;

import java.util.List;

public class BirthdayChocolate {
    static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for (int i = 0; i+m <= s.size() ; i++) {
            int sum = s.subList(i, i+m).stream().reduce((a,b)->a+b).get();
            if (d == sum) count++;
        }
        return count;
    }
}
