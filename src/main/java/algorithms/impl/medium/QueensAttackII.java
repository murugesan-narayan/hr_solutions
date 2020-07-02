package algorithms.impl.medium;

public class QueensAttackII {
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        int[] res=new int[8];

        //Simplify the queens position

        //Define the 8 corners distance considering no obstacles
        res[0]=n- r_q;
        res[1]=Math.min(n- r_q,n- c_q);
        res[2]=n- c_q;
        res[3]=Math.min(r_q -1,n- c_q);
        res[4]= r_q -1;
        res[5]=Math.min(r_q -1, c_q -1);
        res[6]= c_q -1;
        res[7]=Math.min(n- r_q, c_q -1);

        //Check the obstacles in each of the 8 paths to redefine the distance if an obstacle is found
        int i=0;
        while(i<k){

            int r2=obstacles[i][0];
            int c2=obstacles[i][1];

            if((r2> r_q)&&(c2== c_q)) res[0]=Math.min(res[0],r2- r_q -1);
            if(r2> r_q &&c2> c_q &&(c2- c_q)==(r2- r_q)) res[1]=Math.min(res[1],r2- r_q -1);
            if(r_q ==r2&&c2> c_q) res[2]=Math.min(res[2],c2- c_q -1);
            if(r2< r_q &&c2> c_q &&(c2- c_q)==(r_q -r2)) res[3]=Math.min(res[3],c2- c_q -1);
            if(r2< r_q &&c2== c_q) res[4]=Math.min(res[4], r_q -r2-1);
            if(r2< r_q &&c2< c_q &&(c_q -c2)==(r_q -r2)) res[5]=Math.min(res[5], r_q -r2-1);
            if(r_q ==r2&&c2< c_q) res[6]=Math.min(res[6], c_q -c2-1);
            if(r2> r_q &&c2< c_q &&(c_q -c2)==(r2- r_q)) res[7]=Math.min(res[7], c_q -c2-1);
            i++;
        }

        int add=0;
        for(i=0;i<8;i++) add+=res[i];

        return add;
    }

}
