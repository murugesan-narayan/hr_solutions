package thirtydays;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day23BSTLevelOrderTraversal {
    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static void levelOrder(Node root) {
        /*if (root == null)
            System.out.println("nothing to display");
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (!q.isEmpty()) {
            Node node = (Node) q.poll();
            System.out.print(node.data + " ");
            if (node.left != null)
                q.add(node.left);
            if (node.right != null)
                q.add(node.right);

        }*/
        if(root == null) {
            System.out.println("The tree is empty.");
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        sc.close();
        levelOrder(root);
    }
}
