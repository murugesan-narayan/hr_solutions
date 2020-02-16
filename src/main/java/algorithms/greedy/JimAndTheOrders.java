package algorithms.greedy;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class JimAndTheOrders {
    static class Order implements Comparable<Order> {
        Integer id =0;
        Integer t =0;
        Order(int id, int t) {
            this.id = id;
            this.t = t;
        }
        @Override
        public int compareTo(Order other) {
            int v = this.t.compareTo(other.t);
            if (v == 0)
                v = this.id.compareTo(other.id);
            return v;
        }
    }
    static int[] jimOrders(int[][] orders) {
        Map<Order, Integer> map = new TreeMap<>();
        int i = 1;
        for (int[] order: orders) {
            map.put(new Order(i, order[0]+order[1]), i++);
        }
        int [] result = map.values().stream().mapToInt(a->a).toArray();
        return result;
    }
}
