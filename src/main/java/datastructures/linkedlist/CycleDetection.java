package datastructures.linkedlist;

public class CycleDetection {

    static class Node {
        int data;
        Node next;
    }

    static int HasCycle(Node head) {
        Node p1 = head, p2 = head;
        while (p1 != null && p1.next != null && p2 != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            {
                if (p1 == p2)
                    return 1;
            }
        }
        return 0;
    }

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }

    static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode p = head;
        SinglyLinkedListNode q = head;
        while(p != null && q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if(p == q) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode node = new SinglyLinkedListNode();
        node.next = null;
        node.data = 1;
        boolean b = CycleDetection.hasCycle(node);
        System.out.println("b = " + b);
        Node node1 = new Node();
        node1.next = null;
        node1.data = 1;
        int c = CycleDetection.HasCycle(node1);
        System.out.println("c = " + c);
    }
}
