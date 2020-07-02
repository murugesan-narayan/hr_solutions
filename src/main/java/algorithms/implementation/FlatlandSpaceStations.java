package algorithms.implementation;


public class FlatlandSpaceStations {
    static int flatlandSpaceStations(int n, int[] c) {
        if (c.length == n) return 0;
        int[] cities = new int[n];
        for (int ci : c) cities[ci] = 1;
        int max = 0;
        boolean lcFound = false;
        for (int i = 0; i < cities.length; i++) {
            int j = i;
            int lc = 0;
            if (i > 0)
                while(j >= 0) {
                    if (cities[j--] == 0) {
                        lc++;
                    } else {
                        lcFound = true;
                        break;
                    }
                }
            int k = i;
            int rc = 0;
            boolean rcFound = false;
            if (i < cities.length-1)
                while(k < cities.length) {
                    if (cities[k++] == 0) {
                        rc++;
                    }else {
                        rcFound = true;
                        break;
                    }
                }
            int minDistance = n;
            if (lcFound) minDistance = Math.min(minDistance, lc);
            if (rcFound) minDistance = Math.min(minDistance, rc);
            max = Math.max(max, minDistance);
        }
        return max;
    }
}
