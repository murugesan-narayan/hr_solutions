package datastructures.linkedlist;

public class ReverseADoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;
    }

    Node Reverse(Node head) {
        Node current = head;
        Node temp = new Node();
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            head = current;
            current = current.prev;
        }
        return head;
    }

    static class DoublyLinkedListNode {
        int data;
        DoublyLinkedListNode next;
        DoublyLinkedListNode prev;
    }
    //MyCode
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode curr = head;
        while(curr != null) {
            DoublyLinkedListNode temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            head = curr;
            curr = curr.prev;
        }
        return head;
    }

}
