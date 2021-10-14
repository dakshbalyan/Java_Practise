package org.personal.leetcode.topInterviewQuesEasy;

public class ReverseLL {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
//        ListNode node1 = null;
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
//
        node1.nxt = node2;
        node2.nxt = node3;
        node3.nxt = node4;

        Solution solution = new Solution();
        solution.display(node1);
        solution.display(solution.reverseList(node2));
        System.out.println(node4.nxt.val);

    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.nxt == null) return head;
        ListNode itr = head, next = head;
        while (itr.nxt != null) {
            next = itr.nxt;
            itr.nxt = next.nxt;
            next.nxt = head;
            head = next;
        }
//        while(itr.nxt != null){
//            ListNode curr = itr.nxt;
//            head = makeItHead(head,curr,itr);
//        }
        return head;
    }

//    private ListNode makeItHead(ListNode head, ListNode curr, ListNode fixedPtr){
//        fixedPtr.nxt = curr.nxt;
//        curr.nxt = head;
//        return curr;
//    }

    protected void display(ListNode head) {
        if (head == null) System.out.println(head);
        else {
            ListNode itr = head;

            while (itr.nxt != null) {
                System.out.print(itr.val + "->");
                itr = itr.nxt;
            }
            System.out.println(itr.val);
        }
    }
}

class ListNode {
    protected ListNode nxt;
    protected int val;

    public ListNode(int val) {
        nxt = null;
        this.val = val;
    }
}