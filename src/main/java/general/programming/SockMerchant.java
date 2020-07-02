package general.programming;

import java.util.*;

public class SockMerchant {
    public static void main(String[] args) {
        int[] ar = new int[]{10,20,20,10,10,30,50,10,20};
        Map<Integer, Integer> map = new HashMap<>();
        for (int sock : ar) {
            map.merge(sock, 1, Integer::sum);
        }
        Collection<Integer> socks = map.values();
        Integer pairs = socks.stream().map(a -> {
            /*if (a % 2 == 0) return a;
            return a - 1;*/ return a/2;
        }).reduce(0, Integer::sum);
        System.out.println("pairs = " + pairs);
    }
}
