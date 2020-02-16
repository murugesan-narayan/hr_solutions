package algorithms.recursion;

import java.util.HashMap;
import java.util.Map;

public class StairCase {

    static int stepPerms(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        return stepPerms(n, map);
    }

    private static int stepPerms(int n, Map<Integer, Integer> map){
        if(n == 1) return 1; if(n == 2) return 2; if(n == 3) return 4;
        Integer val = map.get(n);
        if(val != null) return val;
        int res = 0;
        res += stepPerms(n - 1, map);
        res += stepPerms(n - 2, map);
        res += stepPerms(n - 3, map);
        map.put(n, res);
        return res;
    }

    /*static int stepPerms(int n) {
        if(n==1) {
            return 1;
        }
        int[] m = new int[n+1];
        m[0] = 1;
        return helper(n,m);
    }
    private static int helper(int n, int[] m) {
        if(n<0) {
            return 0;
        }
        if(m[n]!=0) {
            return m[n];
        }
        if(n==1) {
            return 1;
        }
        m[n] = helper(n-3,m) + helper(n-2,m) + helper(n-1,m);
        return m[n];
    }*/
}
