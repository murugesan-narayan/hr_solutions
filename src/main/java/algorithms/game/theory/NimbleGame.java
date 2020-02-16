package algorithms.game.theory;

public class NimbleGame {
    static String nimbleGame(int[] s) {
        int xor = 0;
        for (int i = 0; i < s.length; ++i) {
            if (s[i] > 0) {
                xor ^= s[i] % 2 == 0 ? 0 : i;
            }
        }
        return xor != 0 ? "First" : "Second";
    }
}
