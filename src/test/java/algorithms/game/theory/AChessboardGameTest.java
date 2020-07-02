package algorithms.game.theory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AChessboardGameTest {

    @Test
    void chessboardGame() {
        assertEquals("First", AChessboardGame.chessboardGame(1, 3));
    }

    @Test
    void chessboardGame2() {
        assertEquals("First", AChessboardGame.chessboardGame(3, 1));
    }
}
