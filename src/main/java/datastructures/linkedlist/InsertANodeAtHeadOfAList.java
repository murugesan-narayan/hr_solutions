package datastructures.linkedlist;

public class InsertANodeAtHeadOfAList {

    /*class Node {
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

    }*/
    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
        SinglyLinkedListNode(int data) {this.data=data;}
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (llist == null) return newNode;
        newNode.next = llist;
        return newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(2);
        SinglyLinkedListNode result = insertNodeAtHead(node, 1);
        System.out.println("result = " + result);
        result = insertNodeAtHead(node, 5);
        System.out.println("result = " + result);
    }

}
