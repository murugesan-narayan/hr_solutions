package datastructures.stacks;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class GameOfTwoStacks {
    static int twoStacks1(int x, int[] a, int[] b) {
        long sum = 0;
        int score = 0;
        Stack<Integer> stackA = new Stack<>();
        int ai = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum <= x) {
                stackA.push(a[i]);
                ai++;
            }
            else break;
        }

        for (int j = 0; j < b.length; j++) {
            int bv = b[j];
            for (int k = 0; k < ai; k++) {
                int av = a[k];
                if( av < bv) {
                    sum -= av;
                    sum += bv;
                    ai++;
                    break;
                }
            }
            if (sum > x) {
                break;
            }

        }

        return score;
    }

    static int twoStacks(int x, int[] a, int[] b) {
        int ai = 0;
        int bi = 0;
        int count = 0;
        int sum = 0;
        // move bi to the position where if only take elements from B, last element it can take
        while (bi < b.length && sum + b[bi] <= x) {
            sum += b[bi];
            bi++;
        }
        bi--; // loop exits only when bi reaches end or sum > x; in both case bi should decrease
        count = bi + 1;
        while (ai < a.length && bi < b.length) {
            sum += a[ai];
            if (sum > x) {
                while (bi >= 0) {
                    sum -= b[bi];
                    bi--;
                    if (sum <= x) break;
                }
                // if even no elements taken from B, but still sum greater than x, then a[ai] should not be chosen
                // and loop terminates
                if (sum > x && bi < 0) {
                    ai--;
                    break;
                }
            }
            count = Math.max(ai + bi + 2, count);
            ai++;
        }

        return count;
    }
}
