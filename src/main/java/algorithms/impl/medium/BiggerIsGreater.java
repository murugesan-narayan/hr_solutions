package algorithms.impl.medium;

import java.util.Arrays;

public class BiggerIsGreater {
    static String biggerIsGreater(String w) {
        char[] chars = w.toCharArray();
        int n = w.length();
        int hi = -1;
        for (int i = 0; i < n-1; i++) {
            if (chars[i] < chars[i+1]) hi = i;
        }
        if (hi == -1) return "no answer";
        int k = n;
        for(int i = hi+1; i < n; i++) {
            if(chars[hi] < chars[i])
                k = i;
        }
        char temp = chars[hi];
        chars[hi] = chars[k];
        chars[k] = temp;
        Arrays.sort(chars, hi+1, n);
        return new String(chars);
    }
}
