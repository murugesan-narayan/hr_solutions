package datastructures.trees;

class PreorderTraversal {

    static class Node {
        int data;
        Node left;
        Node right;
    }

/*    void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }*/
    //MyCode
    public static void mu_preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.data + " ");
        mu_preOrder(root.left);
        mu_preOrder(root.right);
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.data = 1;
        mu_preOrder(node);
    }
}
