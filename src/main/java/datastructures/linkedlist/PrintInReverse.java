package datastructures.linkedlist;

public class PrintInReverse {
/*    class Node {
        int data;
        Node next;
    }

    void ReversePrint(Node head) {
        if (head != null) {
            ReversePrint(head.next);
            System.out.println(head.data);
        }
    }*/
    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }

    //MyCode
    static void reversePrint(SinglyLinkedListNode head) {
        if (head != null) {
            reversePrint(head.next);
            System.out.println(head.data);
        }
    }

    public static void main(String[] args) {
        SinglyLinkedListNode node = new SinglyLinkedListNode();
        node.data = 1;
        reversePrint(node);
    }

}
