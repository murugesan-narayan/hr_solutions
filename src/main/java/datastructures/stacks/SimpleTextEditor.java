package datastructures.stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
    static class Command {
        int type;
        String value;
        int length;
        Command(int t, String val, int len) {
            this.type = t;
            this.value = val;
            this.length = len;
        }
    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("123");
        str.delete(3-3, 3);
        System.out.println("str = " + str);
        Command pc = new Command(1, "",1);
        
    }
    public static void main1(String[] args) {
        Stack<String> st = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        st.push("");
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    str = st.peek() + sc.next();
                    st.push(str);
                    break;
                case 2:
                    if (!st.isEmpty()) {
                        str = st.peek().substring(0, st.peek().length() - sc.nextInt());
                        st.push(str);
                    }
                    break;
                case 3:
                    if (!st.isEmpty()) {
                        str = st.peek();
                        char c = str.charAt(sc.nextInt() - 1);
                        System.out.println(c);
                    }
                    break;
                case 4:
                    if (!st.isEmpty()) {
                        st.pop();
                    }
                    break;
            }
        }
        sc.close();
    }

    public static void main12(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String outputString = "";
        Stack<String> stack = new Stack<>();
        stack.push(outputString);
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String arr[] = br.readLine().split(" ");
            int opt = Integer.parseInt(arr[0]);
            switch (opt) {
                case 1:
                    outputString += arr[1];
                    stack.push(outputString);
                    break;
                case 2:
                    int del = Integer.parseInt(arr[1]);
                    outputString = outputString.substring(0,
                            outputString.length() - del);
                    stack.push(outputString);
                    break;
                case 3:
                    int show = Integer.parseInt(arr[1]);
                    result.add(outputString.charAt(show - 1));
                    break;
                case 4:
                    stack.pop();
                    outputString = stack.peek();
            }
        }
        for (Character j : result) System.out.println(j);
    }

}
