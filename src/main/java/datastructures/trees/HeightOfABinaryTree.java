package datastructures.trees;

public class HeightOfABinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;
    }

    /*int height(Node root) {
        if (root == null)
            return 0;
        return (Math.max(height(root.left), height(root.right)) + 1);

    }*/

    //MyCode
    public static int mu_height(Node root) {
        // Write your code here.
        if (root  == null) return -1;
        return Math.max(mu_height(root.left), mu_height(root.right)) + 1;
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.data = 1;
        int height = mu_height(node);
        System.out.println("height = " + height);
    }

}
