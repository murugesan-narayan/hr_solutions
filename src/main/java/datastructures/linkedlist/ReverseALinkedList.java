package datastructures.linkedlist;

public class ReverseALinkedList {
/*    class Node {
        int data;
        Node next;
    }

    Node Reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node remaing = Reverse(head.next);
        head.next.next = head;
        head.next = null;
        return remaing;

    }*/
    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }
    //MyCode
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if (head == null || head.next == null) return head;
        SinglyLinkedListNode endNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return endNode;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode node = new SinglyLinkedListNode();
        node.data = 1;
        SinglyLinkedListNode node1 = new SinglyLinkedListNode();
        node1.data = 2;
        node.next = node1;
        SinglyLinkedListNode result = reverse(node);
        System.out.println("result = " + result);
    }

}
