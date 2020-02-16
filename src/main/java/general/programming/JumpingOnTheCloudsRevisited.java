package general.programming;

public class JumpingOnTheCloudsRevisited {
    public static void main(String[] args) {
        int[] ar = new int[]{0, 0, 0, 1, 0, 0};
        int minJumps = 0;
        int l = ar.length;
        for (int i=0; i<l-1; i++) {
            //int i1=ar[i];
            int i2 = ar[i+1];
            if (i2 == 0) {
                if (i + 2 < l) {
                    if (ar[i+2] == 0) i++;
                }
            }
            else i++;
            minJumps++;
        }
        System.out.println("minJumps = " + minJumps);
    }
}
