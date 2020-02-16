package datastructures.stacks;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;

class GameOfTwoStacksTest {

    @Test
    void twoStacks() {
        int x = 10;
        int[] a = new int[] {4, 2, 4, 6, 1};
        int[] b = new int[] {2, 1, 8, 5};
        int score = GameOfTwoStacks.twoStacks(x, a, b);
        assertEquals(4, score);
    }

    @Test
    void twoStacks1() {
        int x = 67;
        int[] a = new int[] {19, 9, 8, 13, 1, 7, 18, 0, 19, 19, 10, 5, 15, 19, 0, 0, 16, 12, 5, 10};
        int[] b = new int[] {11, 17, 1, 18, 14, 12, 9, 18, 14, 3, 4, 13, 4, 12, 6, 5, 12, 16, 5, 11, 16, 8, 16, 3, 7,
                8, 3, 3, 0, 1, 13, 4, 10, 7, 14};
        int score = GameOfTwoStacks.twoStacks(x, a, b);
        assertEquals(6, score);
    }

    @Test
    void twoStacks2() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                new FileInputStream("src/test/java/datastructures/stacks/input01.txt")));
        int g = Integer.parseInt(bufferedReader.readLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = bufferedReader.readLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());

            int m = Integer.parseInt(nmx[1].trim());

            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];

            String[] aItems = bufferedReader.readLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            int[] b = new int[m];

            String[] bItems = bufferedReader.readLine().split(" ");

            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int result = GameOfTwoStacks.twoStacks(x, a, b);
            System.out.println("result = " + result);
        }

    }
}
