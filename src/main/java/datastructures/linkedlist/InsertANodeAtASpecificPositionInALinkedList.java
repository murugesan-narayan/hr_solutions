package datastructures.linkedlist;

public class InsertANodeAtASpecificPositionInALinkedList {

    /*class Node {
        int data;
        Node next;
    }

    Node InsertNth(Node head, int data, int position) {
        Node newNode = new Node();
        newNode.data = data;
        Node current = head;
        Node prev = current;
        int counter = 0;

        if (position == 0) {
            newNode.next = head;
            return newNode;
        } else {
            current = head.next;
            while (current != null) {
                if (++counter == position) {
                    newNode.next = prev.next;
                    prev.next = newNode;
                    break;
                }
                prev = current;
                current = current.next;
            }
            if (current == null) {
                newNode.next = prev.next;
                prev.next = newNode;
            }
        }
        return head;
    }*/

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
        SinglyLinkedListNode(int data){
            this.data = data;
        }
    }

    //MyCode
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode currentNode = head;
        SinglyLinkedListNode previousNode = null;
        int i = 0;
        while (currentNode != null) {
            if(i == position) break;
            previousNode = currentNode;
            currentNode = currentNode.next;
            i++;
        }
        if (currentNode == null && previousNode == null) return newNode;
        if (currentNode != null && previousNode == null) currentNode.next = newNode;
        else {
            previousNode.next = newNode;
            newNode.next = currentNode;
        }
        return head;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(1);
        SinglyLinkedListNode result = insertNodeAtPosition(node, 2, 1);
        System.out.println("result = " + result);
        result = insertNodeAtPosition(node, 3, 2);
        System.out.println("result = " + result);
    }
}
