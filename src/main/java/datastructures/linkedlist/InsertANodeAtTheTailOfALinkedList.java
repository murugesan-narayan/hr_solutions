package datastructures.linkedlist;

public class InsertANodeAtTheTailOfALinkedList {
/*    class Node {
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
    }*/

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
        SinglyLinkedListNode(int data) { this.data = data; }
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if(head == null) return new SinglyLinkedListNode(data);
        SinglyLinkedListNode lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = new SinglyLinkedListNode(data);
        return head;

    }

    public static void main(String[] args) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(1);
        SinglyLinkedListNode result = insertNodeAtTail(node, 2);
        System.out.println("result = " + result);
        result = insertNodeAtTail(result, 3);
        System.out.println("result = " + result);
    }

}
