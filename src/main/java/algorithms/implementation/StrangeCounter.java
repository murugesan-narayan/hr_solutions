package algorithms.implementation;

public class StrangeCounter {
    static long strangeCounter(long t) {
        long rem = 3;
        while (t > rem) {
            t -= rem;
            rem *= 2;
        }
        return rem - t + 1;
    }
}
