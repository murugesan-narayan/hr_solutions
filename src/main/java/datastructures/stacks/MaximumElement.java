package datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {

    /*public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        maxStack.push(Integer.MIN_VALUE);

        for (int i = 0; i < N; i++) {
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    int item = sc.nextInt();
                    mainStack.push(item);
                    int maxSoFar = maxStack.peek();
                    if (item > maxSoFar) {
                        maxStack.push(item);
                    } else {
                        maxStack.push(maxSoFar);
                    }
                    break;
                case 2:
                    mainStack.pop();
                    maxStack.pop();
                    break;

                case 3:

                    System.out.println(maxStack.peek());
                    break;
            }
        }
        sc.close();
    }*/
    //MyCode
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int queries = scan.nextInt();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        maxStack.push(Integer.MIN_VALUE);
        for (int i=0; i<queries; i++) {
            int test = scan.nextInt();
            switch(test) {
                case 1: int data = scan.nextInt();
                    stack.push(data);
                    int maxSoFar = maxStack.peek();
                    maxStack.push(Math.max(data, maxSoFar));
                    break;
                case 2: int v = stack.pop();
                    System.out.println("v = " + v);
                    maxStack.pop();
                    break;
                case 3: System.out.println(maxStack.peek());
                    break;
                default: break;
            }
        }
        scan.close();
    }
}
