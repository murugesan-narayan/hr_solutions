package datastructures.stacks;

import java.util.*;

public class LargestRectangle {
    public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<Integer>();
//        int n = sc.nextInt();
        int maxArea = 0;
        int a[] = new int[]{11, 11, 10, 10, 10};//{1, 2, 3, 4, 5};
/*        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }*/
        //largestRectangle(a);
        /*for (int i = 0; i <= a.length; i++) {
            int h = (i == a.length) ? 0 : a[i];
            if (st.isEmpty() || a[st.peek()] <= h) {
                st.push(i);
            } else {
                int tp = st.pop();
                maxArea = Math.max(maxArea, a[tp] * (st.isEmpty() ? i : i - st.peek() - 1));
                i--;
            }

        }*/


        for (int i=0; i<=a.length; i++) {
            int height = (i == a.length) ? 0 : a[i];
            if (st.isEmpty() || a[st.peek()] <= height) st.push(i);
            else {
                int top = st.pop();
                maxArea = Math.max(maxArea, a[top] * (st.isEmpty() ? i : i - st.peek() - 1) );
                i--;
            }
        }
        System.out.println(maxArea);
        //sc.close();
    }

    static long largestRectangle(int[] h) {
        long maxArea = 0;
        Stack<Integer> stack = new Stack<>(); //height
        Map<Integer, Integer> heightLenMap = new HashMap<>();
        for (int i=0; i<h.length; i++) {
            int height = h[i];
            if(stack.isEmpty() || stack.peek() <= height) {
                stack.push(height);
                Integer len = heightLenMap.get(height);
                if(len == null) heightLenMap.put(height, 0);//initialize it, gets updated in next step
                heightLenMap.replaceAll((key, val) -> val + 1); //increment the length
            } else {
                while (!stack.isEmpty()) stack.pop(); //clear it
                stack.push(height); //add new length
            }
        }
        for (Map.Entry<Integer, Integer> entry: heightLenMap.entrySet()) {
            long area = entry.getKey() * entry.getValue();
            if (maxArea < area) maxArea = area;
        }
        System.out.println(maxArea);
        return maxArea;
    }
//5
// 1 2 3 4 5


}
