package org.personal.dsa.tree;

public class BinaryTreeUse {
    public static void main(String[] args) {
        /*BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rightNode = new BinaryTreeNode<>(3);
        root.left = leftNode;
        root.right = rightNode;
        BinaryTreeNode<Integer> leftLeftNode = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> leftRightNode = new BinaryTreeNode<>(5);
        leftNode.left = leftLeftNode;
        leftNode.right = leftRightNode;
         */

        // 1 2 4 -1 -1 5 6 -1 -1 7 -1 -1 3 8 -1 -1 -1
//        BinaryTreeNode<Integer> root = BinaryTreeUtility.takeInput();
        BinaryTreeNode<Integer> root = BinaryTreeUtility.takeInputLevelWise();
        BinaryTreeUtility.printBinaryTree(root);
    }
}
