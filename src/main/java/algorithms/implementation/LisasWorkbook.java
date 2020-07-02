package algorithms.implementation;

public class LisasWorkbook {
    static int workbook(int k, int[] arr) {
        int special = 0;
        int page = 1;
        for (int p : arr) {
            for (int i = 1; i <= p; i++) {
                if (page == i) special++;
                if (i == p || i%k == 0) page++;
            }
        }
        return special;
    }
}
