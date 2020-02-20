package algorithms.impl.medium;

public class LarrysArray {
    static String larrysArray(int[] A) {
        int n = A.length;
        bubleSort(A, n);
        return A[n-2] < A[n-1]?"YES":"NO";
    }
    public static void bubleSort(int[] array, int n){
        for (int i=0; i<n-2; i++){
            for (int j=n-2-1; j>=i; j--){
                while (array[j]>array[j+1]||array[j]>array[j+2]) {
                    rotate(array,j);
                }
            }
        }
    }

    public static void rotate(int[] arr, int a){
        int temp = arr[a];
        arr[a] = arr[a+1];
        arr[a+1] = arr[a+2];
        arr[a+2] = temp;
    }

}
