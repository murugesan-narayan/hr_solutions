package javapro;

import java.text.DecimalFormat;

public class DecimalFormatTest {
    public static void main(String[] args) {
        int[] arr = new int[]{-4,3,-9,0,4,1};
        double pc = 0, nc = 0, zc = 0;
        for (int value : arr) {
            if (value < 0) nc++;
            else if (value > 0) pc++;
            else zc++;
        }
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(pc/arr.length));
        System.out.println(df.format(nc/arr.length));
        System.out.println(df.format(nc/arr.length));
        System.out.println(df.format(75.23/zc));
    }
}
