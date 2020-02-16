package javapro;

import java.util.*;

public class JavaDequeue {
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();
        HashSet<Integer> s = new HashSet<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            dq.add(tmp);
            s.add(tmp);

            if (dq.size() == m) {
                max = Math.max(s.size(), max);
                int item = dq.remove();
                if (!dq.contains(item)) {
                    s.remove(item);
                }
            }
        }
        System.out.println(max);
        sc.close();
    }*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            if (deque.size() == m) {
                max = Math.max(max, set.size());
                int el = deque.remove();
                if(!deque.contains(el)) set.remove(el);
            }
        }
        System.out.println(max);
    }
}
