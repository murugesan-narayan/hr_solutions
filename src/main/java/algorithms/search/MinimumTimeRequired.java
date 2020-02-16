package algorithms.search;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class MinimumTimeRequired {

    private static final Scanner scanner = new Scanner(System.in);

    static long minTime(long[] machines, long goal) {
        Arrays.sort(machines);
        long minDays = machines[0];
        long maxDays = machines[0] * goal;
        long result = -1;
        while (minDays < maxDays) {
            long mid = (minDays + maxDays) / 2;
            long unit = 0;
            for (long machine : machines) {
                unit += mid / machine;
            }
            if (unit < goal) {
                minDays = mid+1;
            } else {
                result = mid;
                maxDays = mid;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nGoal = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nGoal[0]);

        long goal = Long.parseLong(nGoal[1]);

        long[] machines = new long[n];

        String[] machinesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            long machinesItem = Long.parseLong(machinesItems[i]);
            machines[i] = machinesItem;
        }

        long ans = minTime(machines, goal);
        System.out.println("ans = " + ans);
        //bufferedWriter.write(String.valueOf(ans));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }

}
