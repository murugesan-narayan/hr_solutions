package javapro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

// Write your Checker class here
/*class Checker implements Comparator<Player> {
    public int compare(Player o1, Player o2) {
        if (o1.score == o2.score) {
            return ((o1.name).compareTo(o2.name));
        } else {
            return ((o2.score - o1.score));
        }
    }

}*/
class Checker implements Comparator<Player> {
    public int compare(Player p1, Player p2) {
        if(p1.score == p2.score) {
            return (p1.name).compareTo(p2.name);
        } else return p2.score-p1.score;

    }
}

public class JavaComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (Player value : player) {
            System.out.printf("%s %s\n", value.name, value.score);
        }
    }
}
