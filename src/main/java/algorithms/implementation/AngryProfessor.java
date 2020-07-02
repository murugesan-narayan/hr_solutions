package algorithms.implementation;

public class AngryProfessor {

    static String angryProfessor(int k, int[] a) {
        int onTime = 0;
        for (int t : a)
            if (t <= 0) onTime++;
        return onTime < k ? "YES" : "NO";
    }

}
