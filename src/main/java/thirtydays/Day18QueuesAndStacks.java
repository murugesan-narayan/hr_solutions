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
        return q.poll();
    }
}
