package org.personal.dsa.tree;

import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
//        TreeNode<Integer> root = new TreeNode<>(1);
//        TreeNode<Integer> node1 = new TreeNode<>(2);
//        TreeNode<Integer> node2 = new TreeNode<>(3);
//        TreeNode<Integer> node3 = new TreeNode<>(4);
//        TreeNode<Integer> node4 = new TreeNode<>(5);
//        TreeNode<Integer> node5 = new TreeNode<>(6);
//        root.children.add(node2);
//        root.children.add(node1);
//        root.children.add(node3);
//        node3.children.add(node4);
//        node4.children.add(node5);

//
//
//        root.printTree(null);
//  1 3 2 3 4 2 5 6 2 7 8 0 0 0 0 1 9 0
        TreeNode<Integer> node = new TreeNode<>();
        TreeNode<Integer> root = node.takeInputLevelWise();
        node.printTree(root);
        node.printTreeLevelWise(root);
        node.printPreOrder(root);
        System.out.println();
        node.printPostOrder(root);
        System.out.println();
        System.out.println("Number of nodes: "+TreeUtility.getNumberOfNodes(root));
        System.out.println("Height of Tree: "+TreeUtility.getTreeHeight(root));
        int k = new Scanner(System.in).nextInt();
        System.out.print("Print at level "+k+" : ");
        TreeUtility.printAtLevelK(root,k);
        System.out.println();
        System.out.println("Number of Leaves : "+TreeUtility.getNumberOfLeafNodes(root));



    }


}
