package algorithms.implementation;

public class AngryProfessor {

    static String angryProfessor(int k, int[] a) {
        int onTime = 0;
        for (int t : a)
            if (t <= 0) onTime++;
        String cancel = onTime < k ? "YES" : "NO";
        return cancel;
    }

}
