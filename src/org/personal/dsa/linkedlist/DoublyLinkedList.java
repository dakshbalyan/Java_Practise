package org.personal.dsa.linkedlist;

public class DoublyLinkedList {

    public static void main(String[] args) {
        MyLinkedListNew myLinkedListNew = new MyLinkedListNew();

        myLinkedListNew.addAtHead(7);
        System.out.println(myLinkedListNew.get(0));
        myLinkedListNew.addAtHead(2);
        System.out.println(myLinkedListNew.get(0));
        myLinkedListNew.addAtHead(1);
        System.out.println(myLinkedListNew.get(0));
//        System.out.println(myLinkedListNew.get(1));
//        for(int i = 0 ; i < myLinkedListNew.getSize(); i++){
//            System.out.print(myLinkedListNew.get(i)+" --> ");
//        }


        myLinkedListNew.addAtIndex(3, 0);
        System.out.println(myLinkedListNew.get(3));

        myLinkedListNew.deleteAtIndex(2);
//        System.out.println(myLinkedListNew.get(2));

        myLinkedListNew.addAtHead(6);
        System.out.println(myLinkedListNew.get(0));

        myLinkedListNew.addAtTail(4);
        System.out.println(myLinkedListNew.get(MyLinkedListNew.getSize() - 1));

        System.out.println(myLinkedListNew.get(4));

        myLinkedListNew.addAtHead(4);
        System.out.println(myLinkedListNew.get(0));

        myLinkedListNew.addAtIndex(5, 0);
        System.out.println(myLinkedListNew.get(5));

        myLinkedListNew.addAtHead(6);
        System.out.println(myLinkedListNew.get(0));

        for (int i = 0; i < MyLinkedListNew.getSize(); i++) {
            System.out.print(myLinkedListNew.get(i) + " --> ");
        }
    }
}

class MyLinkedListNew {

    private static int size = 0;
    private static DoubleNode head;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedListNew() {
        head = null;
    }

    public static int getSize() {
        return size;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index >= size) return -1;
        int cnt = 0;
        DoubleNode itr = head;
        while (itr != null) {
            if (cnt == index)
                return itr.val;
            itr = itr.next;
            cnt++;
        }

        return 0;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        if (head == null) {
            head = new DoubleNode(val);
            size++;
            return;
        }
        DoubleNode newHead = new DoubleNode(val);
        newHead.next = head;
        head.prev = newHead;
        head = newHead;

        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }

        DoubleNode newTail = new DoubleNode(val);
        DoubleNode itr = head;
        while (itr.next != null) {
            itr = itr.next;
        }

        itr.next = newTail;
        newTail.prev = itr;

        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > size) return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        int cnt = 1;
        DoubleNode itr = head;
        while (cnt < index) {
            itr = itr.next;
            cnt++;
        }

        DoubleNode newNode = new DoubleNode(val);
        DoubleNode next = itr.next;

        itr.next = newNode;
        newNode.prev = itr;
        newNode.next = next;
        next.prev = newNode;

        size++;

    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index >= size) return;

        if (index == 0) {
            head = head.next;
            size--;
            return;
        }

        int cnt = 0;
        DoubleNode itr = head;
        while (cnt != index) {
            itr = itr.next;
            cnt++;
        }

        if (itr.next == null) {
            itr.prev = null;
            size--;
            return;
        }

        DoubleNode prev = itr.prev, next = itr.next;

        prev.next = next;
        next.prev = prev;

        size--;

    }

    public class DoubleNode {
        DoubleNode next, prev;
        int val;

        public DoubleNode(int val) {
            this.val = val;
            next = null;
            prev = null;
        }
    }
}