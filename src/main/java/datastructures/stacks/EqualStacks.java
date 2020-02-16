package datastructures.stacks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {

    static int equalStacks(int[] h1, int[] h2, int[] h3) {

        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        Stack<Integer> st3 = new Stack<Integer>();

        int st1TotalHeight = 0, st2TotalHeight = 0, st3TotalHeight = 0;

        // pushing consolidated height into the stack instead of individual cylinder
        // height
        for (int i = h1.length - 1; i >= 0; i--) {
            st1TotalHeight += h1[i];
            st1.push(st1TotalHeight);
        }
        for (int i = h2.length - 1; i >= 0; i--) {
            st2TotalHeight += h2[i];
            st2.push(st2TotalHeight);
        }
        for (int i = h3.length - 1; i >= 0; i--) {
            st3TotalHeight += h3[i];
            st3.push(st3TotalHeight);
        }

        while (true) {

            // If any stack is empty
            if (st1.isEmpty() || st2.isEmpty() || st3.isEmpty())
                return 0;

            st1TotalHeight = st1.peek();
            st2TotalHeight = st2.peek();
            st3TotalHeight = st3.peek();

            // If sum of all three stack are equal.
            if (st1TotalHeight == st2TotalHeight && st2TotalHeight == st3TotalHeight)
                return st1TotalHeight;

            // Finding the stack with maximum sum and
            // removing its top element.
            if (st1TotalHeight >= st2TotalHeight && st1TotalHeight >= st3TotalHeight)
                st1.pop();
            else if (st2TotalHeight >= st1TotalHeight && st2TotalHeight >= st3TotalHeight)
                st2.pop();
            else if (st3TotalHeight >= st2TotalHeight && st3TotalHeight >= st1TotalHeight)
                st3.pop();
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for (int h1_i = 0; h1_i < n1; h1_i++) {
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for (int h2_i = 0; h2_i < n2; h2_i++) {
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for (int h3_i = 0; h3_i < n3; h3_i++) {
            h3[h3_i] = in.nextInt();
        }
        System.out.println(equalStacks(h1, h2, h3));
        in.close();
    }

    //MyCode
    static int mu_equalStacks(int[] h1, int[] h2, int[] h3) {
        /*
         * Write your code here.
         */
        Stack<Integer> stack1 = new Stack<>();
        int sum1 = 0;
        for (int i=h1.length-1; i>=0; i--) {
            stack1.push(h1[i]);
            sum1 = sum1 + h1[i];
        }
        Stack<Integer> stack2 = new Stack<>();
        int sum2 = 0;
        for (int i=h2.length-1; i>=0; i--) {
            stack2.push(h2[i]);
            sum2 = sum2 + h2[i];
        }
        Stack<Integer> stack3 = new Stack<>();
        int sum3 = 0;
        for (int i=h3.length-1; i>=0; i--) {
            stack3.push(h3[i]);
            sum3 = sum3 + h3[i];
        }
        while (true) {
            if (stack1.empty() || stack2.empty() || stack3.empty()) return 0;
            if (sum1 == sum2 && sum2 == sum3) return sum1;
            int[] sums = new int[] {sum1, sum2, sum3};
            int max = Arrays.stream(sums).max().getAsInt();
            //System.out.println("max: "+max);
            if (sum1 == max) {
                int val1 = stack1.pop();
                sum1 = sum1 - val1;
                //System.out.println("sum1: "+sum1);
            } else if (sum2 == max) {
                int val2 = stack2.pop();
                sum2 = sum2 - val2;
                //System.out.println("sum2: "+sum2);
            } else {
                int val3 = stack3.pop();
                sum3 = sum3 - val3;
                //System.out.println("sum3: "+sum3);
            }
        }

    }
}
