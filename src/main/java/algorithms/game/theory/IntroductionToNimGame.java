package algorithms.game.theory;

public class IntroductionToNimGame {
    static String nimGame(int[] pile) {
        int xor = pile[0];
        for(var i = 1; i < pile.length; ++i){
            xor ^= pile[i];
        }
        return xor != 0 ? "First" : "Second";
    }
}
