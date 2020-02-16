package algorithms.implementation;

public class BeautifulTriplets {
    static int beautifulTriplets(int d, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i+1; j < arr.length - 1; j++) {
                if (arr[j] - arr[i] != d) continue;
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[k] - arr[j] == d) count++;
                }
            }
        }
        return count;
    }
}
