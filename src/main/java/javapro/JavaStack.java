package javapro;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    /*private static boolean matchParenthisis(String str) {
        Stack<Character> st = new Stack<Character>();
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (c == '{' || c == '[' || c == '(') {
                st.push(c);
            } else {
                if (c == ']' && !st.isEmpty() && st.pop() == '[') {
                    continue;
                } else if (c == '}' && !st.isEmpty() && st.pop() == '{') {
                    continue;
                } else if (c == ')' && !st.isEmpty() && st.pop() == '(') {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.next();
            System.out.println(matchParenthisis(s));
        }
        in.close();
    }*/

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            //Comfplete the code
            char[] chars = input.toCharArray();
            boolean failed = false;
            Stack<Character> stack = new Stack<>();
            for (char c: chars) {
                if(c == '{' || c == '[' || c == '(') stack.push(c);
                else if (c == '}' || c == ']' || c == ')') {
                    if (stack.isEmpty()) {
                        failed = true;
                        break;
                    }
                    char pc = stack.pop();
                    if (c == '}' && pc == '{') System.out.println("cont");
                    else if (c == ']' && pc == '[') System.out.println("cont");
                    else if (c == ')' && pc == '(') System.out.println("cont");
                    else {
                        failed = true;
                        break;
                    }
                }
            }
            if (failed) System.out.println(false);
            else System.out.println(stack.isEmpty());
        }

    }

}
