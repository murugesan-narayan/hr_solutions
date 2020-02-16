package datastructures.linkedlist;

public class InsertANodeAtTheTailOfALinkedList {
    class Node {
        int data;
        Node next;
    }

    Node Insert(Node head, int data) {
        Node current = head;
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

        return head;
    }

    /*static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if(head == null) return new SinglyLinkedListNode(data);
        SinglyLinkedListNode lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = new SinglyLinkedListNode(data);
        return head;


    }*/
}
