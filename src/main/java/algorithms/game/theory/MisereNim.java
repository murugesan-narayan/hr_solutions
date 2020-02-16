package algorithms.game.theory;

import java.util.stream.IntStream;

public class MisereNim {
    static String misereNim(int[] s) {
        final int xor = IntStream.of(s).reduce(0, (a, b) -> a ^ b);
        if (IntStream.of(s).allMatch(i -> i == 1)) {
            return xor % 2 == 0 ? "First" : "Second";
        } else {
            return xor > 0 ? "First" : "Second";
        }
    }
}
