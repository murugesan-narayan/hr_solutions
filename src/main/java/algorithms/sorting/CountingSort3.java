package algorithms.sorting;

import java.util.Scanner;

public class CountingSort3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N= in.nextInt();
        int sum=0;
        int[] arr = new int[N];
        int[] a = new int[100];
        for(int i=0;i<N;i++){
            arr[i]=in.nextInt();
            in.next();
            a[arr[i]]++;
        }
        for(int j=0;j<100;j++){
            sum = sum + a[j];
            System.out.print(sum +" ");
        }
    }
}
