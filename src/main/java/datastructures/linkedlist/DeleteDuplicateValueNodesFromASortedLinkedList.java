package datastructures.linkedlist;

public class DeleteDuplicateValueNodesFromASortedLinkedList {
    static class Node {
        int data;
        Node next;
    }

    static Node RemoveDuplicates(Node head) {
        Node current = head;
        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node node1 = new Node();
        node1.next = null;
        node1.data = 1;
        Node node2 = new Node();
        node2.next = node1;
        node2.data = 1;
        Node re = RemoveDuplicates(node2);
        System.out.println("re = " + re);
    }
}
