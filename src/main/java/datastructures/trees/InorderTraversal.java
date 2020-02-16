package datastructures.trees;

import java.util.Stack;

public class InorderTraversal {

    class Node {
        int data;
        Node left;
        Node right;
    }

    void inOrder(Node root) {
        Stack<Node> st = new Stack<Node>();
        while (true) {
            while (root != null) {
                st.push(root);
                root = root.left;
            }
            if (st.empty())
                return;
            root = st.pop();
            System.out.print(root.data + " ");
            root = root.right;
        }
    }
    //MyCode
    public static void mu_inOrder(Node root) {
        if (root == null) return;
        if(root.left != null) mu_inOrder(root.left);
        System.out.print(root.data + " ");
        if(root.right != null) mu_inOrder(root.right);
    }
}
