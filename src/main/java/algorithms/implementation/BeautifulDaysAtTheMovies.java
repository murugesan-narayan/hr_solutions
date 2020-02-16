package algorithms.implementation;

import java.util.stream.IntStream;

public class BeautifulDaysAtTheMovies {
    static int beautifulDays(int i, int j, int k) {
        int beautifulDays = 0;
        int[] days = IntStream.rangeClosed(i, j).toArray();
        for (int day : days) {
            StringBuilder sb = new StringBuilder();
            sb.append(day);
            String rv = sb.reverse().toString();
            int diff = day - Integer.parseInt(rv);
            if (diff%k == 0) beautifulDays++;
        }
        return beautifulDays;
    }
}
