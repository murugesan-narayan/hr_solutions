package datastructures.trees;

public class PostorderTraversal {
    static class Node {
        int data;
        Node left;
        Node right;
    }

/*    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");

        }
    }*/
    //MyCode
    public static void mu_postOrder(Node root) {
        if(root == null) return;
        if(root.left != null) mu_postOrder(root.left);
        if(root.right != null) mu_postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.data = 11;
        mu_postOrder(node);
    }
}
