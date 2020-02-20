package algorithms.impl.medium;

public class QueensAttackII {
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        int[] res=new int[8];

        //Simplify the queens position
        int r1 = r_q;
        int c1 = c_q;

        //Define the 8 corners distance considering no obstacles
        res[0]=n-r1;
        res[1]=Math.min(n-r1,n-c1);
        res[2]=n-c1;
        res[3]=Math.min(r1-1,n-c1);
        res[4]=r1-1;
        res[5]=Math.min(r1-1,c1-1);
        res[6]=c1-1;
        res[7]=Math.min(n-r1,c1-1);

        //Check the obstacles in each of the 8 paths to redefine the distance if an obstacle is found
        int i=0;
        while(i<k){

            int r2=obstacles[i][0];
            int c2=obstacles[i][1];

            if((r2>r1)&&(c2==c1)) res[0]=Math.min(res[0],r2-r1-1);
            if(r2>r1&&c2>c1&&(c2-c1)==(r2-r1)) res[1]=Math.min(res[1],r2-r1-1);
            if(r1==r2&&c2>c1) res[2]=Math.min(res[2],c2-c1-1);
            if(r2<r1&&c2>c1&&(c2-c1)==(r1-r2)) res[3]=Math.min(res[3],c2-c1-1);
            if(r2<r1&&c2==c1) res[4]=Math.min(res[4],r1-r2-1);
            if(r2<r1&&c2<c1&&(c1-c2)==(r1-r2)) res[5]=Math.min(res[5],r1-r2-1);
            if(r1==r2&&c2<c1) res[6]=Math.min(res[6],c1-c2-1);
            if(r2>r1&&c2<c1&&(c1-c2)==(r2-r1)) res[7]=Math.min(res[7],c1-c2-1);
            i++;
        }

        int add=0;
        for(i=0;i<8;i++) add+=res[i];

        return add;
    }

}
