package datastructures.linkedlist;

public class PrintInReverse {
    class Node {
        int data;
        Node next;
    }

    void ReversePrint(Node head) {
        if (head != null) {
            ReversePrint(head.next);
            System.out.println(head.data);
        }
    }

    //MyCode
    /*static void reversePrint(SinglyLinkedListNode head) {
        if(head != null) {
            reversePrint(head.next);
            System.out.println(head.data);
        }

    }*/

}
