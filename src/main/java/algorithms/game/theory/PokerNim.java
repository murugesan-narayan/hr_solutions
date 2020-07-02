package algorithms.game.theory;

public class PokerNim {
    static String pokerNim(int k, int[] c) {
        System.out.println("k = " + k);
        int xor = c[0];
        for(int i = 1; i < c.length; ++i){
            xor ^= c[i];
        }
        return xor != 0 ? "First" : "Second";
    }

}
