package org.personal.dsa.tree.binarytree.binarysearchtree;

import org.personal.dsa.tree.binarytree.BinaryTreeUtility;

import java.util.Scanner;

public class BstUse {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 40 20 60 10 30 50 70 -1 -1 25 -1 -1 -1 -1 -1 -1 -1
        // 4 2 6 1 30 5 7 -1 -1 -1 -1 -1 -1 -1 -1
//        BinaryTreeNode<Integer> root = BinaryTreeUtility.takeInputLevelWise();
//        System.out.println();
//        BinaryTreeUtility.printLevelWise(root);
//        System.out.println("\nEnter number to be searched : ");
//        int k = sc.nextInt();
//        System.out.println(BstUtility.searchBST(root, k));
//        System.out.println("Start and End : ");
//        int start = sc.nextInt(), end = sc.nextInt();
//        BstUtility.printRange(root, start, end);
//        System.out.println();
//        System.out.println(BstUtility.isBST(root));
//
//        System.out.println(BstUtility.checkBST(root));
//
//        System.out.println(BstUtility.checkBST2(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

//        int[] arr = {1,3,5,7,12,56,89};
//        BinaryTreeNode<Integer> root = BstUtility.makeBstFromSortedArray(arr,0,arr.length-1);
//        BinaryTreeUtility.printLevelWise(root);
//
//        LinkedListNode head = BstUtility.getLLFromBST(root);
//        LinkedListNode itr = head;
//        while ( itr != null ){
//            System.out.print(itr.data+"->");
//            itr = itr.next;
//        }
//        System.out.println();
//
//        LinkedListNode[] oHeadTail = BstUtility.optimisedGetLLFromBST(root);
//        if ( oHeadTail != null ) {
//            LinkedListNode oItr = oHeadTail[0];
//            while (oItr != null) {
//                System.out.print(oItr.data + "->");
//                oItr = oItr.next;
//            }
//        }
//        System.out.println();

//        ArrayList<Integer> path = BinaryTreeUtility.getPath(root, 40);
//        ArrayList<Integer> path = BinaryTreeUtility.optimisedPathFromRoot(root, 25);
//        if (path != null){
//            for (int i = path.size() - 1; i > -1; i--) {
//                System.out.print(path.get(i) + "->");
//            }
//        } else {
//            System.out.println("Doesn't exist!");
//        }
//        System.out.println();
        BST bst = new BST();
        bst.add(10);
        bst.add(5);
        bst.add(20);
        bst.add(7);
        bst.add(3);
        bst.add(15);
        bst.add(70);
        bst.add(25);
        bst.add(35);
        bst.add(55);

        BinaryTreeUtility.printLevelWise(bst.getRoot());
        System.out.println(bst.hasData(40));
        bst.deleteData(55);
        System.out.println("After Deletion: "+bst.hasData(55));
        BinaryTreeUtility.printLevelWise(bst.getRoot());
        bst.deleteData(40);
        System.out.println("After Deletion: "+bst.hasData(40));
        BinaryTreeUtility.printLevelWise(bst.getRoot());

    }
}
