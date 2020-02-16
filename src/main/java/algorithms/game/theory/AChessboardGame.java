package algorithms.game.theory;

public class AChessboardGame {
    static String chessboardGame(int x, int y) {
        return (x-1)%4<2 && (y-1)%4<2? "Second" : "First";
    }
}
