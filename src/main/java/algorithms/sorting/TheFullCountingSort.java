package algorithms.sorting;

import java.util.Arrays;
import java.util.List;

public class TheFullCountingSort {

    static void countSort(List<List<String>> arr) {

        StringBuilder[] sb=new StringBuilder[100];
        int halfSize = arr.size()/2;
        for(int i=0;i<arr.size();i++) {
            String str = i < halfSize ? "-" : arr.get(i).get(1);
            int v = Integer.parseInt(arr.get(i).get(0));
            if (sb[v] == null) sb[v] = new StringBuilder();
            sb[v].append(str).append(" ");
        }
        //StringBuilder result = new StringBuilder();
        for(int i=0;i<100;i++){
            if (sb[i] == null) continue;
            System.out.print(sb[i]);
//            result.append(sb[i]);
        }


/*        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StringBuffer out = new StringBuffer();
        Map<Integer, StringBuffer> subarr = new HashMap<>();
        int x, halfN = n / 2;
        for (int i = 0; i < 100; i++)
            subarr.put(i, new StringBuffer());
        String str;
        for (int i = 0; i < halfN; i++) {
            x = input.nextInt();
            input.next("[a-z]+");
            subarr.get(x).append("- ");
        }
        for (int i = halfN; i < n; i++) {
            x = input.nextInt();
            str = input.next();
            subarr.get(x).append(str).append(" ");
        }

        for (int k : subarr.keySet()) {
            out.append(subarr.get(k).toString());
        }
        System.out.print(out.toString());
        input.close();*/
    }
}
