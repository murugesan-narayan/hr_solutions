package datastructures.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {

    List<Integer> seq = new ArrayList<Integer>();
    List<List<Integer>> seqList = new ArrayList<List<Integer>>();
    int lastAns = 0;

    public DynamicArray(int N) {
        for (int i = 0; i < N; i++) {
            seq = new ArrayList<Integer>();
            seqList.add(seq);
        }
    }

    void appendValue(int x, int y, int N) {
        int rowIndex = (x ^ lastAns) % N;
        List<Integer> seq = seqList.get(rowIndex);
        seq.add(y);
    }

    private void printValue(int x, int y, int N) {
        int colIndex = 0;
        int rowIndex = (x ^ lastAns) % N;
        List<Integer> seq = seqList.get(rowIndex);
        colIndex = y % seq.size();
        lastAns = seq.get(colIndex);
        System.out.println(lastAns);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        DynamicArray da = new DynamicArray(N);
        for (int i = 0; i < Q; i++) {
            int queryType = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (queryType == 1) {
                da.appendValue(x, y, N);
            } else {
                da.printValue(x, y, N);
            }

        }
        sc.close();
    }

    //MyCode
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        List<Integer> response = new ArrayList<>();
        List<List<Integer>> seqList = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) seqList.add(new ArrayList<Integer>());
        int lastAns = 0;
        for(List<Integer> list: queries) {
            int type = list.get(0);
            int x = list.get(1);
            int y = list.get(2);
            int index = (x ^ lastAns) % n;

            if(type == 1) seqList.get(index).add(y);
            else if (type == 2) {
                List<Integer> seq = seqList.get(index);
                lastAns = seq.get(y % seq.size());
                response.add(lastAns);
            }
        }
        return response;
    }

}
