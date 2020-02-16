package datastructures.linkedlist;

public class DeleteANode {

    class Node {
        int data;
        Node next;
    }

    Node Delete(Node head, int position) {

        Node current = head;
        Node prev = current;
        int counter = 0;

        if (head == null && position == 0) {
            return null;
        }
        if (position == 0 && head != null) {
            head = head.next;
            return head;
        } else {

            current = head.next;
            while (current != null) {

                if (++counter == position) {
                    prev.next = current.next;
                    break;
                }
                prev = current;
                current = current.next;
            }

        }
        return head;

    }

    //MyCode
    /*static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode currentNode = head;
        SinglyLinkedListNode previousNode = null;
        for (int i=0; i <= position && currentNode != null; i++) {
            if (i == position) {
                if (previousNode == null) head = currentNode.next;
                else previousNode.next = currentNode.next;
            } else {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        return head;
    }*/

}
