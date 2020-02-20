package algorithms.impl.medium;

import java.util.List;

public class NonDivisibleSubset {
    public static int nonDivisibleSubset(int k, List<Integer> s) {
        int[] arr=new int[k];
        int count=0;
        for (Integer integer : s) arr[integer % k]++;
        for(int i=0;i<k;i++)
            if((i==0 || i==k-i) && arr[i] != 0)
                count++;
            else if(i != 0 && i != k-i && arr[i] >= arr[k-i]) {
                count+=arr[i];
                arr[k-i]=0;
            }
        return count;
    }
}
