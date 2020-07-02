package datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    static class Node {
        int data;
        Node left;
        Node right;
    }

/*    void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node currentNode = q.poll();
            System.out.print(currentNode.data + " ");
            if (currentNode.left != null)
                q.add(currentNode.left);
            if (currentNode.right != null)
                q.add(currentNode.right);
        }
    }*/
    //MyCode
    public static void mu_levelOrder(Node root) {
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            Node n = q.poll();
            if(n.left != null) q.add(n.left);
            if(n.right != null) q.add(n.right);
            System.out.print(n.data + " ");
        }
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.data = 1;
        mu_levelOrder(node);
    }
}
