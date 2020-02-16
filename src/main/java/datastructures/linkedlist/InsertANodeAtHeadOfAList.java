package datastructures.linkedlist;

public class InsertANodeAtHeadOfAList {

    class Node {
        int data;
        Node next;
    }

    Node Insert(Node head, int x) {

        Node newNode = new Node();
        newNode.data = x;
        newNode.next = null;

        if (head == null) {
            head = newNode;

        } else {

            newNode.next = head;
            head = newNode;
        }

        return head;

    }

    /*static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (llist == null) return newNode;
        newNode.next = llist;
        return newNode;
    }*/

}
