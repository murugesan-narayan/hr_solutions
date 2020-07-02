package datastructures.linkedlist;

public class DeleteANode {

    static class Node {
        int data;
        Node next;
    }

    static Node Delete(Node head, int position) {

        Node current = head;
        Node prev = current;
        int counter = 0;

        if (head == null && position == 0) {
            return null;
        }
        if (position == 0) {
            head = head.next;
            return head;
        } else {
            if (head == null) return null;
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

    public static void main(String[] args) {
        Node node1 = new Node();
        node1.next = null;
        node1.data = 1;
        Delete(node1, 1);
        Node node2 = new Node();
        node2.next = node1;
        node2.data = 2;
        Node re = Delete(node2, 2);
        System.out.println("re = " + re);
    }
}
