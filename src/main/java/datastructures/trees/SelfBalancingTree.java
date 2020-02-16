package datastructures.trees;

//AVL Tree
public class SelfBalancingTree {
    static class Node {
        int val;	//Value
        int ht;		//Height
        Node left;	//Left child
        Node right;	//Right child
    }
    //get the height of the tree node
    static int height(Node node) {
        if (node == null) return -1;
        return node.ht;
    }
    // Get Balance factor of node N
    static int getBalance(Node N) {
        if (N == null) return 0;
        return height(N.left) - height(N.right);
    }
    // A utility function to right rotate subtree rooted with y
    static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.ht = Math.max(height(y.left), height(y.right)) + 1;
        x.ht = Math.max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    // A utility function to left rotate subtree rooted with x
    static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        //  Update heights
        x.ht = Math.max(height(x.left), height(x.right)) + 1;
        y.ht = Math.max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

    static Node insert(Node root, int val) {
        if (root == null) {
            Node newNode =  new Node();
            newNode.val = val;
            return newNode;
        }
        if(val > root.val) root.right = insert(root.right, val);
        else root.left = insert(root.left, val);
        root.ht = 1 + Math.max(height(root.left), height(root.right));
        int balance = getBalance(root);
        // If this node becomes unbalanced, then there
        // are 4 cases Left Left Case
        if (balance > 1 && val < root.left.val)
            return rightRotate(root);

        // Right Right Case
        if (balance < -1 && val > root.right.val)
            return leftRotate(root);

        // Left Right Case
        if (balance > 1 && val > root.left.val) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Left Case
        if (balance < -1 && val < root.right.val) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        /* return the (unchanged) node pointer */
        return root;
    }
}
