package datastructures.heap;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class QHEAP1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int queries = scan.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i=0; i<queries; i++) {
            int type = scan.nextInt();
            if (type == 1) {
                int anum = scan.nextInt();
                set.add(anum);
            } else if (type == 2) {
                int dnum = scan.nextInt();
                set.remove(dnum);
            }
            else System.out.println(set.iterator().next());
        }
    }
}
