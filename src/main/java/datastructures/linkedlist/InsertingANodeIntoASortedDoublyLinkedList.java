package datastructures.linkedlist;

public class InsertingANodeIntoASortedDoublyLinkedList {

    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {

        DoublyLinkedListNode temp=head;	//have a copy of head, to return the DLL,after the changes
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);//create a new node and add data to it

        //case 1: if DLL is empty
        if (head == null) {//if DLL is empty,make newNode as head
            newNode.next = null;
            newNode.prev = null;
            return newNode;
        }

        //case 2: if new_node has to be inserted at head's position
        if (head.data > data) {//if new_node is to be added in front of head
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = null;
            return newNode;
        }

        //case 3: if new_node can be added in other places except head

        //in while loop have null checking as first condition to prevent NullPointerException
        while (head.next != null && head.next.data<data)
            head=head.next;
        newNode.next=head.next;
        head.next=newNode;
        newNode.prev=head;
        return temp;
    }

/*    static DoublyLinkedListNode sortedInsert_MyCode(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if (head == null) return newNode;
        DoublyLinkedListNode curr = head;
        DoublyLinkedListNode last = null;
        while(curr != null) {
            if(curr.data > data) {
                if (curr.prev != null) curr.prev.next = newNode;
                newNode.prev = curr.prev;
                newNode.next = curr;
                curr.prev = newNode;
                if (newNode.prev == null) return newNode;
                return head;
            } else {
                last = curr;
                curr = curr.next;
            }
        }
        last.next = newNode;
        newNode.prev = last;
        return head;
    }*/

    public static void main(String[] args) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(1);
        DoublyLinkedListNode result = sortedInsert(node, 2);
        System.out.println("result = " + result);
        result = sortedInsert(result, 5);
        System.out.println("result = " + result);
    }

}
