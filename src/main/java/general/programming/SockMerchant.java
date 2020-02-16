package general.programming;

import java.util.*;

public class SockMerchant {
    public static void main(String[] args) {
        int[] ar = new int[]{10,20,20,10,10,30,50,10,20};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<ar.length; i++) {
            int sock = ar[i];
            Integer count = map.get(sock);
            if (count == null)
                map.put(sock, 1);
            else
                map.put(sock, count.intValue() + 1);
        }
        Collection<Integer> socks = map.values();
        Integer pairs = socks.stream().map(a -> {
            /*if (a % 2 == 0) return a;
            return a - 1;*/ return a/2;
        }).reduce(0, (a, b) -> a + b);
        System.out.println("pairs = " + pairs);
    }
}
