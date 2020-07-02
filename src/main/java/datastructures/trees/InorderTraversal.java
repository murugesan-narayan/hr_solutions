package datastructures.trees;

//import java.util.Stack;

public class InorderTraversal {

    static class Node {
        int data;
        Node left;
        Node right;
    }

/*    void inOrder(Node root) {
        Stack<Node> st = new Stack<>();
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
    }*/
    //MyCode
    public static void mu_inOrder(Node root) {
        if (root == null) return;
        if(root.left != null) mu_inOrder(root.left);
        System.out.print(root.data + " ");
        if(root.right != null) mu_inOrder(root.right);
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.data = 1;
        mu_inOrder(node);
    }
}
