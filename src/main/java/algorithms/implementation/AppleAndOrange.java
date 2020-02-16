package algorithms.implementation;

public class AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int count = 0;
        for (int av : apples) {
            int v = a + av;
            if (v >= s && v <= t)
                count++;
        }
        System.out.println(count);
        count = 0;
        for (int ov : oranges) {
            int v = b + ov;
            if (v >= s && v <= t) count++;
        }
        System.out.println(count);
    }

}
