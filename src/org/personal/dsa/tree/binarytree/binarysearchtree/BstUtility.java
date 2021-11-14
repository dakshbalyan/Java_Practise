package org.personal.dsa.tree.binarytree.binarysearchtree;

import org.personal.dsa.tree.binarytree.BinaryTreeNode;
import org.utility.LinkedListNode;
import org.utility.Pair;

public class BstUtility {
    public static boolean searchBST(BinaryTreeNode root, int k){
        // handling edge case
        if (root == null){
            return false;
        }
        int rootData = (int) root.data;
        boolean res = false;
        // base case
        if( rootData == k ){
            res = true;
        }
        else if( k < rootData ){
            res = searchBST(root.left, k);
        }
        else if( k > rootData ){
            res = searchBST(root.right, k);
        }

        return res;
    }

    public static void printRange(BinaryTreeNode root, int start, int end){
        if (root == null){
            return;
        }

        int rootData = (int) root.data;

        if (start > rootData){
            printRange(root.right, start, end);
        }
        else if (end < rootData){
            printRange(root.left, start, end);
        }
        else if ( start <= rootData && rootData <= end ){
            System.out.print(rootData +" ");
            printRange(root.left, start, end);
            printRange(root.right, start, end);
        }
    }
    /*
    The basic idea is that for any root of a BST, that root should be greater than all the
    elem on its left subtree and less than all the elem of its right subtree, i.e, rootData < rightSubtreeMin
    and rootData > leftSubtreeMax. For a BST to be verified if it's a BST there will be 3 conditions to be checked
    1. Root of tree or subtree should be less than its respective right subtree and greater than its left subtree.
    2. left subtree should also be a valid BST
    3. right subtree should also be a valid BST
        Time complexity will be -> O(n*h)
        when tree is balanced -> 2*T(n/2) + n --> O(nLogn)
        when tree is skewed -> T(n-1) + n --> O(n^2)
    * */
    public static boolean isBST(BinaryTreeNode root){
        // base case
        if ( root == null ){
            return true;
        }
        int rootData = (int) root.data;
        int leftMax = maximum(root.left);   // n/2
        int rightMin = minimum(root.right); // n/2
        // First 2 operations will do constant work & last 2 call would be made recursively
        // 2 times
        boolean ans = rootData > leftMax && rootData <= rightMin   // 2*k
                && isBST(root.left) && isBST(root.right);   // 2*T(n/2)

        return ans;
    }

    /*
    * Here, we used the technique used in getting height and diameter. Thus reducing the
    * time complexity to O(n)
    * */
    public static Pair<Boolean, Integer, Integer> checkBST(BinaryTreeNode root){
        // base case
        if( root == null ){
            return new Pair<>(true, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        // recursive calls ( Hypothesis )
        int rootData = (int) root.data;
        Pair leftPair = checkBST(root.left);    // T(n/2)
        Pair rightPair = checkBST(root.right);  // T(n/2)

        // calculations ( Induction ) -- Constant time for all below steps for every node visited
        int leftMax = (int) leftPair.getMax();
        int rightMin = (int) rightPair.getMin();
        boolean checkIfBstForRoot = rootData > leftMax && rootData <= rightMin
                && Boolean.parseBoolean(String.valueOf(leftPair.getKey())) &&
                Boolean.parseBoolean(String.valueOf(rightPair.getKey()));

        int currMin = Math.min(rootData, Math.min((int) leftPair.getMin(), (int) rightPair.getMin()));
        int currMax = Math.max(rootData, Math.max((int) leftPair.getMax(), (int) rightPair.getMax()));

        Pair<Boolean, Integer, Integer> ans = new Pair<>(
                checkIfBstForRoot, currMin, currMax
        );

        return ans;
    }

    /*
    * All this while we have been only implementing bottom to top approach. With the below
    * method we will be implementing top to bottom approach by making the constraints smaller
    * and smaller as we go down the tree.
    * */
    public static boolean checkBST2(BinaryTreeNode root, int start, int end){
        // base case
        if (root == null){
            return true;
        }

        // Recursive calls ( Hypotheses )
        int rootData = (int) root.data;
        boolean leftCheckBST = checkBST2(root.left, start, rootData-1);
        boolean rightCheckBST = checkBST2(root.right, rootData, end);

        // Calculations ( Induction )
        if ( rootData > start && rootData <= end ){
            return leftCheckBST && rightCheckBST;
        }
        else
            return false;

    }

    public static int minimum(BinaryTreeNode root){
        if ( root == null ){
            return Integer.MAX_VALUE;
        }
        int rootData = (int) root.data;
        int minVal = Math.min(rootData, Math.min(minimum(root.left), minimum(root.right)));
        return minVal;
    }
    public static int maximum(BinaryTreeNode root){
        if ( root == null ){
            return Integer.MIN_VALUE;
        }
        int rootData = (int) root.data;
        int maxVal = Math.max(rootData, Math.max(maximum(root.left), maximum(root.right)));
        return maxVal;
    }

    public static BinaryTreeNode makeBstFromSortedArray(int[] arr, int start, int end){
        // base case
        if( start > end ){
            return null;
        }

        // Calculation ( Induction )
        int midElem = (start+end)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[midElem]);

        // Recursion ( Hypothesis )
        root.left = makeBstFromSortedArray(arr, start, midElem-1);
        root.right = makeBstFromSortedArray(arr, midElem+1, end);

        return root;
    }

    /*
    * Normal solution, can be optimised by returning both the head and the tail of the linkedList.
    * Time complexity --> T(n) = 2T(n/2) + n ==> O(nlogn)
    * */
    public static LinkedListNode getLLFromBST(BinaryTreeNode root){
        if ( root == null ){
            return null;
        }
        int rootData = (int) root.data;
        LinkedListNode currNode = new LinkedListNode(rootData);
        LinkedListNode leftHead = getLLFromBST(root.left);      // T(n/2)
        LinkedListNode rightHead = getLLFromBST(root.right);    // T(n/2)
        if ( leftHead != null && rightHead != null ){
            LinkedListNode newHead = leftHead;
            while (leftHead.next != null) {                     // n
                leftHead = leftHead.next;
            }

            leftHead.next = currNode;
            currNode.next = rightHead;

            return newHead;
        }
        else if ( leftHead == null && rightHead != null ){
            currNode.next = rightHead;
            return currNode;
        }
        else if ( leftHead != null && rightHead == null ){
            LinkedListNode newHead = leftHead;
            while (leftHead.next != null) {
                leftHead = leftHead.next;
            }

            leftHead.next = currNode;
            return newHead;
        }

        return currNode;
    }

    public static LinkedListNode[] optimisedGetLLFromBST(BinaryTreeNode root){
        if ( root == null ){
            return null;
        }

        int rootData = (int) root.data;
        LinkedListNode currNode = new LinkedListNode(rootData);
        LinkedListNode[] leftListHeadTail = optimisedGetLLFromBST(root.left);
        LinkedListNode[] rightListHeadTail = optimisedGetLLFromBST(root.right);
        if( leftListHeadTail != null && rightListHeadTail == null ){
            leftListHeadTail[1].next = currNode;
            return new LinkedListNode[]{leftListHeadTail[0],currNode};
        }
        else if ( rightListHeadTail != null && leftListHeadTail == null ){
            currNode.next = rightListHeadTail[0];
            return new LinkedListNode[]{currNode, rightListHeadTail[0]};
        }
        else if ( leftListHeadTail == null && rightListHeadTail == null ){
            return new LinkedListNode[]{currNode, currNode};
        }
        else {
            leftListHeadTail[1].next = currNode;
            currNode.next = rightListHeadTail[0];
        }
        return new LinkedListNode[]{leftListHeadTail[0], rightListHeadTail[1]};
    }
}
