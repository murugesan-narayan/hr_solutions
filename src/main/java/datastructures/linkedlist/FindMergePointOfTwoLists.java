package datastructures.linkedlist;

public class FindMergePointOfTwoLists {
    static class Node {
        int data;
        Node next;
    }

    static int FindMergeNode(Node headA, Node headB) {
        Node currentA = headA;
        Node currentB = headB;

        int lenA = 0, lenB = 0, d;

        while (currentA != null) {
            lenA++;
            currentA = currentA.next;
        }
        while (currentB != null) {
            lenB++;
            currentB = currentB.next;
        }

        if (lenA > lenB) {
            d = lenA - lenB;
        } else {
            d = lenB - lenA;
        }

        currentA = headA;
        currentB = headB;
        for (int i = 0; i < d; i++) {
            if (lenA > lenB) {
                currentA = currentA.next;
            } else {
                currentB = currentB.next;
            }

        }

        while (currentA != currentB) {
            currentA = currentA.next;
            currentB = currentB.next;
        }

        return currentA.data;
    }

    public static void main(String[] args) {
        Node n = new Node();
        n.data=1;
        n.next=null;
        Node p = new Node();
        p.data=1;
        p.next=null;
        int i = FindMergeNode(n, p);
        System.out.println("i = " + i);
    }
/*
    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }
    //MyCode
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        int d = length(head1) - length(head2);
        if (d >= 0) while (d-- > 0) head1 = head1.next;
        else while (d++ < 0) head2 = head2.next;
        while (head1 != head2) {
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1.data;
    }

    static int length(SinglyLinkedListNode head) {
        int l = 0;
        while (head != null) {
            l++;
            head = head.next;
        }
        return l;
    }*/
}