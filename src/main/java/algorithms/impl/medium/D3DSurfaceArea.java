package algorithms.impl.medium;

public class D3DSurfaceArea {
    static int surfaceArea(int[][] A) {
        int tvolume=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                tvolume += (A[i][j]*4)+2;
                if(j>=1)tvolume -= Math.min(A[i][j-1],A[i][j])*2;
                if(i>=1)tvolume -= Math.min(A[i-1][j],A[i][j])*2;
            }
        }
        return(tvolume);
    }
}
