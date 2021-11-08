package org.personal.dsa.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUtility {
    private static Scanner sc = new Scanner(System.in);

    public static void printBinaryTree(BinaryTreeNode root){
        // Base case
        if(root == null) return;

        System.out.print(root+" : ");
        if(root.left != null){
            System.out.print("L"+root.left);
        }
        if(root.right != null){
            System.out.print(", R"+root.right);
        }
        System.out.println();
        printBinaryTree(root.left);
        printBinaryTree(root.right);
    }

    public static BinaryTreeNode takeInput(){
        System.out.print("Enter data: ");
        int rootData = sc.nextInt();
        if(rootData == -1){
            return null;
        }

        BinaryTreeNode leftChild = takeInput();
        BinaryTreeNode rightChild = takeInput();
        BinaryTreeNode root = new BinaryTreeNode(rootData);
        root.left = leftChild;
        root.right = rightChild;

        return root;
    }

    public static BinaryTreeNode takeInputLevelWise(){
        System.out.print("Enter parent: ");
        BinaryTreeNode root = new BinaryTreeNode(sc.nextInt());
        Queue<BinaryTreeNode> q = new LinkedList();
        q.add(root);
        while(q.size() != 0){
            BinaryTreeNode parent = q.poll();
            System.out.print("Enter left child: ");
            int leftChildData = sc.nextInt();
            if(leftChildData != -1){
                parent.left = new BinaryTreeNode(leftChildData);
                q.add(parent.left);
            }
            System.out.print("Enter right child: ");
            int rightChildData = sc.nextInt();
            if(rightChildData!=-1){
                parent.right = new BinaryTreeNode(rightChildData);
                q.add(parent.right);
            }

        }
        return root;
    }

    public static void printLevelWise(BinaryTreeNode root){

    }

    public static int getNumberOfNodes(BinaryTreeNode root){
        return 0;
    }

    public static void printPreOrder(BinaryTreeNode root){

    }

    public static void printPostOrder(BinaryTreeNode root){

    }

    public static void printInOrder(BinaryTreeNode root){

    }

    public static BinaryTreeNode buildFromPreAndInOrder(){
        return null;
    }

}
