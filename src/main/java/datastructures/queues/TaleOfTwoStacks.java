package datastructures.queues;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class MyQueue<T> {
    Stack<T> stack1 = new Stack<>();
    Stack<T> stack2 = new Stack<>();
    void enqueue(T t) {
        stack1.push(t);
    }

    void dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) return;
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }
        stack2.pop();
    }

    public T peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }
        return stack2.peek();
    }
}
public class TaleOfTwoStacks {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

