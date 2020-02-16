package algorithms.search;

import java.util.*;

public class MaximumSubarraySum {
    static long maximumSum(long[] a, long m) {
        long maxSum=0;
        TreeSet<Long> prefix = new TreeSet<>();
        long currentSum=0;
        for(int i=0; i<a.length; i++){
            currentSum = (currentSum + a[i] % m) % m;
            SortedSet<Long> set = prefix.tailSet(currentSum+1);
            Iterator<Long> itr = set.iterator();
            if (itr.hasNext()) {
                maxSum= Math.max(maxSum, (currentSum-itr.next()+m)%m);
            }
            maxSum = Math.max(maxSum, currentSum);
            prefix.add(currentSum);
        }
        return maxSum;
    }

    static long maximumSum1(long[] a, long m) {
        long maxSum = 0;
        OuterLoop:
        // Pick starting point
        for (int i=0; i <a.length; i++) {
            // Pick ending point
            for (int j=i; j<a.length; j++) {
                // Print subarray between current starting
                // and ending points
                long sum = 0;
                //List<Long> sub = new ArrayList<>();
                for (int k=i; k<=j; k++) {
                    sum += a[k];
                    //sub.add(a[k]);
                }
                //System.out.println("sub array " + sub + " sum = " + sum + " sum%" + m +" = "+sum%m);
                maxSum = Math.max(maxSum, sum % m);
                if(maxSum == m-1) break OuterLoop;
            }
        }
        return maxSum;
    }
}
