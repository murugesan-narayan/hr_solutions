package algorithms.implementation;

public class CircularArrayRotation {
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        k = k % a.length;
        for (int i = 0; i < queries.length; i++) {
            if (queries[i] < k) {
                queries[i] = a[a.length - k + queries[i]];
            } else {
                queries[i] = a[queries[i] - k];
            }
        }
        return queries;
    }
}
