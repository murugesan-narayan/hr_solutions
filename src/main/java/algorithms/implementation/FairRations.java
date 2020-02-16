package algorithms.implementation;

public class FairRations {
    static String fairRations(int[] B) {
        int sum = 0;
        for(int i=0; i < B.length; i++){
            sum += B[i];
        }
        int count = 0;
        if (sum % 2 == 1){
            return "NO";
        } else {
            for (int i = 0; i < B.length; i++) {
                if (B[i] % 2 != 0) {
                    B[i] = B[i] + 1;
                    B[i + 1] = B[i + 1] + 1;
                    count += 2;
                }
            }
        }
        return "" + count;
    }
}
