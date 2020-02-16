package algorithms.game.theory;

public class TowerBreakers {
    static int towerBreakers(int n, int m) {
        return (m == 1 || n % 2 == 0 ? 2 : 1);
    }
}
