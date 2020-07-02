package datastructures.linkedlist;

public class CompareTwoLinkedLists {
    static class Node {
        int data;
        Node next;
        Node(int data, Node next) {
            this.data =data;
            this.next =next;
        }
    }

    int CompareLists(Node headA, Node headB) {
        while (headA != null && headB != null) {
            if (headA.data != headB.data) {
                return 0;

            } else {
                headA = headA.next;
                headB = headB.next;
            }

        }

        if ((headA == null) && (headB == null)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1,null);
        Node b = new Node(5,null);
        int v = new CompareTwoLinkedLists().CompareLists(a, b);
        System.out.println("v = " + v);
    }

}
