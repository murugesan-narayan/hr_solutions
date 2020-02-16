package datastructures.stacks;

import java.util.*;

public class MinMaxRiddle {
    static long[] riddle(long[] arr) {
        long[] res = printMaxOfMin(arr);
        return Arrays.copyOfRange(res, 1,res.length);
    }

    private static void getAllPossibleSubArrays(long[] arr, Map<Integer, Long> map) {
        long arrSize = arr.length;
        //start point
        for (int startPoint = 0; startPoint < arrSize; startPoint++) {
            //group sizes
            for (int groupSize = startPoint+1; groupSize <= arrSize; groupSize++) {
                //if start point = 1 then
                //grp size = 1 , print 1
                //grp size = 2, print 1 2
                //grp size = 3, print 1 2 3 ans so on
                long min = Long.MAX_VALUE;
                List<Long> list = new ArrayList<>();
                int count = 0;
                for (int j = startPoint ; j < groupSize ; j++) {
                    min = Math.min(min, arr[j]);
                    count++;
                    list.add(arr[j]);
                }
                //if (groupSize == startPoint) continue;
                System.out.println("list = " + list + " min = " + min + " groupSize = " + list.size());
                Long val = map.get(count);
                if (val == null) val = min;
                else val = Math.max(val, min);
                map.put(count, val);
            }
        }
    }

    static long[] printMaxOfMin(long[] arr)
    {
        int n = arr.length;
        long[] res = new long[n];
        // Used to find previous and next smaller
        Stack<Integer> s = new Stack<>();

        // Arrays to store previous and next smaller
        int left[] = new int[n+1];
        int right[]  = new int[n+1];

        // Initialize elements of left[] and right[]
        for (int i=0; i<n; i++)
        {
            left[i] = -1;
            right[i] = n;
        }

        // Fill elements of left[] using logic discussed on
        // https://www.geeksforgeeks.org/next-greater-element/
        for (int i=0; i<n; i++)
        {
            while (!s.empty () && arr[s.peek()] >= arr[i])
                s.pop();

            if (!s.empty())
                left[i] = s.peek();

            s.push(i);
        }

        // Empty the stack as stack is going to be used for right[]
        while (!s.empty())
            s.pop();

        // Fill elements of right[] using same logic
        for (int i = n-1 ; i>=0 ; i-- )
        {
            while (!s.empty() && arr[s.peek()] >= arr[i])
                s.pop();

            if(!s.empty())
                right[i] = s.peek();

            s.push(i);
        }

        // Create and initialize answer array
        long ans[] = new long[n+1];
        for (int i=0; i<=n; i++)
            ans[i] = 0;

        // Fill answer array by comparing minimums of all
        // lengths computed using left[] and right[]
        for (int i=0; i<n; i++)
        {
            // length of the interval
            int len = right[i] - left[i] - 1;

            // arr[i] is a possible answer for this length
            // 'len' interval, check if arr[i] is more than
            // max for 'len'
            ans[len] = Math.max(ans[len], arr[i]);
        }

        // Some entries in ans[] may not be filled yet. Fill
        // them by taking values from right side of ans[]
        for (int i=n-1; i>=1; i--)
            ans[i] = Math.max(ans[i], ans[i+1]);

        // Print the result
        //for (int i=1; i<=n; i++)
        //   System.out.print(ans[i] + " ");
        return ans;
    }
}
