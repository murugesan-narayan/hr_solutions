package datastructures.trees;

/*import java.util.HashMap;
import java.util.Map;*/

public class TreesIsThisABinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean checkBST(Node root) {
        return checkBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }


    private static boolean checkBSTUtil(Node root, int minValue, int maxValue) {
        if (root == null)
            return true;
        return (root.data > minValue && root.data < maxValue && checkBSTUtil(root.left, minValue, root.data)&& checkBSTUtil(root.right, root.data, maxValue));
    }
/*
    boolean checkBST_T(Node root) {
        if (root == null) return true;
        Node left = root.left;
        Node right = root.right;
        if (left != null && left.data >= root.data) return false;
        if (right != null && right.data <= root.data) return false;
        return checkBST_T(left) && checkBST_T(right);
    }*/


    /*boolean checkBST(Node root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    boolean checkBST(Node root, int min, int max) {
        if (root == null) return true;
        return root.data > min && root.data < max && checkBST(root.left, min, root.data-1) &&
                checkBST(root.right, root.data+1, max);
    }*/

    public static void main(String[] args) {
        Node node = new Node(1);
        boolean bst = checkBST(node);
        System.out.println("bst = " + bst);
    }
}
