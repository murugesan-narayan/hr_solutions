package algorithms.sorting;

public class RunningTimeOfAlgorithms {
    static int runningTime(int[] arr) {
        int shifts = 0;
        for(int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j = j - 1;
                shifts++;
            }
            arr[j + 1] = value;
        }
        return shifts;
    }
}
