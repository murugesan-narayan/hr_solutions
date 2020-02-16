package datastructures.trees;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopView {
    class Node {
        int data;
        Node left;
        Node right;
    }

    void topView(Node root) {
        Node rootNode = root;

        if (rootNode == null)
            return;
        printLeft(rootNode.left);
        System.out.print(rootNode.data + " ");
        printright(rootNode.right);

    }

    void printLeft(Node rootNode) {
        if (rootNode == null)
            return;
        printLeft(rootNode.left);
        System.out.print(rootNode.data + " ");
    }

    void printright(Node rootNode) {
        if (rootNode == null)
            return;
        System.out.print(rootNode.data + " ");
        printright(rootNode.right);

    }

    //MyCode
    public static void mu_topView(Node root) {
        class QueueObj {
            Node node;
            int hd;
            QueueObj(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }
        Queue<QueueObj> q = new LinkedList<>();
        Map<Integer, Node> topViewMap = new TreeMap<Integer, Node>();
        q.add(new QueueObj(root, 0));
        while (!q.isEmpty()) {
            QueueObj queObj = q.poll();
            if (!topViewMap.containsKey(queObj.hd))
                topViewMap.put(queObj.hd, queObj.node);
            if (queObj.node.left != null)
                q.add(new QueueObj(queObj.node.left, queObj.hd - 1));
            if (queObj.node.right != null)
                q.add(new QueueObj(queObj.node.right, queObj.hd + 1));
        }
        for (Map.Entry<Integer, Node> eS: topViewMap.entrySet())
            System.out.print(eS.getValue().data + " ");
    }

}
