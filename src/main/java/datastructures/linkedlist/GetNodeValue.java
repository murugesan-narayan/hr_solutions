package datastructures.linkedlist;

public class GetNodeValue {
/*    class Node {
        int data;
        Node next;
    }

    int GetNode(Node head, int n) {
        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i < n; i++) {
            p1 = p1.next;
        }
        while (p1.next != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        return p2.data;
    }*/
    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }

    static int getNode(SinglyLinkedListNode head, int positionFromTail) {

        int i = 0;
        if (head == null) return -1;
        SinglyLinkedListNode temp = head;
        while(temp != null) {
            i++;
            temp = temp.next;
        }
        i -= positionFromTail;
        for(int j=0; j<=i-2; j++) {
            if(head.next != null) head = head.next;
        }
        return head.data;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode node = new SinglyLinkedListNode();
        node.data = 1;
        int v = getNode(node, 1);
        System.out.println("v = " + v);
        v = getNode(node, 2);
        System.out.println("v = " + v);
    }
}
