package datastructures.arrays;

import java.util.*;

public class CountTriplets {

    public static void main(String[] args) {
        //int[] ar = new int[] {1, 2, 2, 4};
        //int[] ar = new int[] {1, 3, 9, 9, 27, 81};
        Long[] ar = new Long[] {1L, 3L, 9L, 9L, 27L, 81L};
        int n = 6;
        int r = 3;
        int tripletsCount = 0;
        Map<Long, Long> leftMap = new HashMap();
        Map<Long, Long> rightMap = new HashMap();
        for (Long v : ar) {
            if (v != 1 && v%r != 0) continue;
            rightMap.put(v, rightMap.getOrDefault(v, 0L) + 1L);
        }
        for (int i=0; i<n-1; i++) {
            Long cv = ar[i];
            rightMap.put(cv, rightMap.getOrDefault(cv, 0L) - 1);
            long lc = 0, rc = 0;
            if (leftMap.containsKey(cv/r) && cv % r == 0) lc = leftMap.get(cv/r);
            if (rightMap.containsKey(cv*r)) rc = rightMap.get(cv*r);
            tripletsCount += lc * rc;
            leftMap.put(cv, leftMap.getOrDefault(cv, 0L) + 1);
        }


        //Collections.sort(al);
        //System.out.println("al = " + al);
        /*for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int k1 = entry.getKey();
            List<Integer> v1 = entry.getValue();
            if (k1 !=1 && k1%r != 0) continue;
            List<Integer> v2 = map.get(k1 * r);
            if (v2 != null)
        }*/
        /*for (int i=0; i<n-2; i++) {
            for (int j=i+1; j<n-1; j++) {
                for (int k=j+1; k<n; k++) {
                    if (ar[i] != 1 && ar[i]%r != 0) {
                        System.out.println("[i,j,k] = (" + ar[i] + "," + ar[j] + "," + ar[k] + ")");
                        continue;
                    }
                    if ((ar[j] == ar[i]*r)
                        && (ar[k] == ar[j]*r)) {
                        tripletsCount++;
                        System.out.println("ar[i,j,k] = (" + ar[i] + "," + ar[j] + "," + ar[k] + ")");
                    }
                    //else System.out.println("ar[i,j,k] = (" + ar[i] + ", " + ar[j] + "," + ar[k] + ")");
                }
            }
        }*/
        System.out.println("tripletsCount = " + tripletsCount);
    }

}
