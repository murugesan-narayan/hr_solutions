package datastructures.trees;
import java.util.*;
import java.io.*;

class Insertion {
    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void preOrder( Node root ) {

        if( root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;    
    */
    //MyCode
    public static Node insert(Node root, int data) {
        Node newNode = new Node(data);
        if (root == null) return newNode;
        Node currNode = root;
        while(true) {
            if(newNode.data > currNode.data) {
                if (currNode.right == null) {
                    currNode.right = newNode;
                    break;
                }
                currNode = currNode.right;
            } else {
                if (currNode.left == null) {
                    currNode.left = newNode;
                    break;
                }
                currNode = currNode.left;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        preOrder(root);
    }
}