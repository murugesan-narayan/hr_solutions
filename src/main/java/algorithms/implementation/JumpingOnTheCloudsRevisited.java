package algorithms.implementation;

public class JumpingOnTheCloudsRevisited {
    static int jumpingOnClouds(int[] c, int k) {
        int energies = 100;
        int i = 0;
        while (true) {
            i = i + k;
            int j = i % c.length;
            int v = c[j];
            if (v == 1) energies = energies-2;
            energies--;
            if (j == 0) break;
        }
        return energies;
    }
}
