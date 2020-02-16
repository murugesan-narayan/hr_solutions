package datastructures.linkedlist;

public class ReverseALinkedList {
    class Node {
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

    }

    //MyCode
    /*static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if (head == null || head.next == null) return head;
        SinglyLinkedListNode endNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return endNode;
    }*/

}
