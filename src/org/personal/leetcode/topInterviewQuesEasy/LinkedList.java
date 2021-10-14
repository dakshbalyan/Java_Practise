package org.personal.leetcode.topInterviewQuesEasy;

public class LinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
//        System.out.println("get--> "+myLinkedList.get(0));
        myLinkedList.addAtHead(2);
        myLinkedList.deleteAtIndex(1);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(3);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(5);
        myLinkedList.addAtTail(5);
//        myLinkedList.addAtIndex(1,2);
        System.out.println("get--> " + myLinkedList.get(5));

        for (int i = 0; i < myLinkedList.getSize(); i++) {
            System.out.print(myLinkedList.get(i) + " --> ");
        }
        System.out.println();
//        System.out.println("get--> "+myLinkedList.get(0));
        myLinkedList.deleteAtIndex(6);
        myLinkedList.deleteAtIndex(4);
        for (int i = 0; i < myLinkedList.getSize(); i++) {
            System.out.print(myLinkedList.get(i) + " --> ");
        }

    }
}

// Basic Linked List functions
class MyLinkedList {

    private int size = 0;
    private Node head;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
    }

    public int getSize() {
        return size;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        int res = -1;
        try {
            if (index > size || size == 0)
                return -1;
            int count = 0;
            Node temp = head;
            while (count < index) {
                temp = temp.nxt;
                count++;
            }
            res = temp.val;
        } catch (Exception e) {
            e.toString();
        }
        return res;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        try {
            if (size == 0) {
                head = new Node(val);
                size++;
            } else {
                Node newHead = new Node(val);
                newHead.nxt = head;
                head = newHead;
                size++;
            }
        } catch (Exception e) {
            e.toString();
        }

        System.out.println("Added " + val + " at head");
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        try {
            if (size == 0) {
                addAtHead(val);
                return;
            }
            Node tail = new Node(val);
            Node temp = head;

            while (temp.nxt != null) {
                temp = temp.nxt;
            }

            temp.nxt = tail;
            size++;
        } catch (Exception e) {
            e.toString();
        }

        System.out.println("Added " + val + " at tail");
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        try {
            if (index > size)
                return;
            int count = 0;
            Node curr = head;
            Node prev = null;
            if (index == 0) {
                addAtHead(val);
                return;
            }
            if (index == size) {
                addAtTail(val);
                return;
            }
            while (count < index) {
                prev = curr;
                curr = curr.nxt;
                count++;
            }

            Node newNode = new Node(val);
            prev.nxt = newNode;
            newNode.nxt = curr;
            size++;
        } catch (Exception e) {
            e.toString();
        }

        System.out.println("Added " + val + " at index " + index);
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        try {
            if (index >= size)
                return;

            int count = 0;
            Node curr = head;
            Node prev = null;
            while (count < index) {
                prev = curr;
                curr = curr.nxt;
                count++;
            }

            if (index != 0) {
                prev.nxt = curr.nxt;
                curr.nxt = null;
            } else {
                if (head != null) {
                    head = head.nxt;
                    curr.nxt = null;
                } else {
                    head = null;
                }
            }
        } catch (Exception e) {
            e.toString();
        }

        System.out.println("Deleted value at index " + index);
    }

    class Node {
        Node nxt;
        int val;

        public Node(int val) {
            this.val = val;
            nxt = null;
        }

    }
}
