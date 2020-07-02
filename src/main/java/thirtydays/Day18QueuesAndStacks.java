package thirtydays;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day18QueuesAndStacks {
    Stack<Character> st = new Stack<>();
    Queue<Character> q = new LinkedList<>();

    void pushCharacter(char ch) {
        st.push(ch);
    }

    void enqueueCharacter(char ch) {
        q.add(ch);
    }

    char popCharacter() {
        return st.pop();
    }

    char dequeueCharacter() {   //remove
        Character c = q.poll();
        if(c == null) return '1';
        return c;
    }

    public static void main(String[] args) {
        Day18QueuesAndStacks d = new Day18QueuesAndStacks();
        char c = d.popCharacter();
        System.out.println("c = " + c);
        char c1 = d.dequeueCharacter();
        System.out.println("c1 = " + c1);
        d.enqueueCharacter('h');
        d.enqueueCharacter('l');
        d.pushCharacter('k');
        d.pushCharacter('m');
    }
}
