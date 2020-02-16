package datastructures.linkedlist;

public class MergeTwoSortedLinkedLists {
    class Node {
        int data;
        Node next;
    }

    Node MergeLists(Node headA, Node headB) {
        if (headA == null && headB == null)
            return null;
        else if (headA != null && headB == null)
            return headA;
        else if (headA == null && headB != null)
            return headB;
        else if (headA.data < headB.data) {
            headA.next = MergeLists(headA.next, headB);
            return headA;
        } else {
            headB.next = MergeLists(headA, headB.next);
            return headB;
        }
    }
    class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }

    static SinglyLinkedListNode mergeLists_myCode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        SinglyLinkedListNode sortingNode = null;
        if(head1.data <= head2.data) {
            sortingNode = head1;
            head1 = sortingNode.next;
        } else {
            sortingNode = head2;
            head2 = sortingNode.next;
        }
        SinglyLinkedListNode sortedHead = sortingNode;
        while(head1 != null && head2 != null ) {
            if(head1.data <= head2.data) {
                sortingNode.next = head1;
                sortingNode = head1;
                head1 = sortingNode.next;
            } else {
                sortingNode.next = head2;
                sortingNode = head2;
                head2 = sortingNode.next;
            }
        }
        if (head1 == null) sortingNode.next = head2;
        else sortingNode.next = head1;
        return sortedHead;
    }
}
