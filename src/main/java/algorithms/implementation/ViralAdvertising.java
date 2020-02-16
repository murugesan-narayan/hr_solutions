package algorithms.implementation;

public class ViralAdvertising {
    static int viralAdvertising(int n) {
        int shared = 5;
        int totalLike = 0;
        for (int i = 0; i < n; i++) {
            int liked = shared / 2;
            totalLike += liked;
            shared = liked * 3;
        }
        return totalLike;
    }
}
