package datastructures.trees;

public class HuffmanDecoding {
    static class Node {
        public int frequency; // the frequency of this tree
        public char data;
        public Node left, right;
    }

    /*void decode(String S, Node root) {
        Node currentRoot = root;
        if (root == null)
            return;
        char[] a = S.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '0')
                currentRoot = currentRoot.left;
            else
                currentRoot = currentRoot.right;
            if (currentRoot.left == null || currentRoot.right == null) {
                System.out.print(currentRoot.data);
                currentRoot = root;
            }

        }
    }*/

    //MyCode
    void decode(String s, Node root) {
        if (root == null || s == null) return;
        char[] arr = s.toCharArray();
        Node currNode = root;
        for (char c : arr) {
            if (c == '0') currNode = currNode.left;
            else if (c == '1') currNode = currNode.right;
            if (currNode == null) break;
            if (currNode.left == null && currNode.right == null) {
                System.out.print(currNode.data);
                currNode = root;
            }
        }
    }

    public static void main(String[] args) {
        HuffmanDecoding decoding = new HuffmanDecoding();
        Node node = new Node();
        node.data = 1;
        node.frequency = 1;
        decoding.decode("test", node);
        decoding.decode("tes1t", node);
    }
}
