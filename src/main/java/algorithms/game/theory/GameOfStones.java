package algorithms.game.theory;

public class GameOfStones {
    static String gameOfStones(int n) {
        if( n%7 < 2 ) return "Second";
        else return "First";
    }
}
