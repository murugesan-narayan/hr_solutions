package algorithms.sorting.medium;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

class FraudulentActivityNotificationsTest {

    @Test
    void activityNotifications() {
        int notifications = FraudulentActivityNotifications.activityNotifications(
                new int[]{10, 20, 30, 40, 50},
                4
        );
        assertEquals(1, notifications);
    }
    @Test
    void activityNotifications1() {
        int notifications = FraudulentActivityNotifications.activityNotifications(
                new int[]{2, 3 ,4 ,2, 3, 6, 8, 4, 5},
                5
        );
        assertEquals(2, notifications);
    }
    @Test
    void activityNotifications2() {
        int notifications = FraudulentActivityNotifications.activityNotifications(
                new int[]{1, 2, 3, 4, 4},
                4
        );
        assertEquals(0, notifications);
    }

    @Disabled("run only with file")
    @Test
    void activityNotifications_l() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input01.txt"));
        String[] fl = br.readLine().split(" ");
        int n = Integer.parseInt(fl[0]);
        int d = Integer.parseInt(fl[1]);
        String[] sl = br.readLine().split(" ");
        br.close();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(sl[i]);
        }
        int notifications = FraudulentActivityNotifications.activityNotifications(
                input,
                d
        );
        System.out.println("notifications = " + notifications);
    }
}