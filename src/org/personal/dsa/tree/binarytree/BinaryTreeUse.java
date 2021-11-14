package org.personal.dsa.tree.binarytree;

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

        // 1 2 3 4 5 -1 6 7 8 -1 9 10 -1 -1 -1 -1 -1 -1 -1 -1 11 12 -1 -1 -1
//        BinaryTreeNode<Integer> root = BinaryTreeUtility.takeInput();
        BinaryTreeNode<Integer> parent = BinaryTreeUtility.takeInputLevelWise();
//        System.out.println("Normal Print");
//        BinaryTreeUtility.printBinaryTree(root);
//        System.out.println("\nLevel Wise Print");
//        BinaryTreeUtility.printLevelWise(root);
//        System.out.println("\nPre-Order Print");
//        BinaryTreeUtility.printPreOrder(root);
//        System.out.println("\nPost-Order Print");
//        BinaryTreeUtility.printPostOrder(root);
//        System.out.println("\nIn-Order Print");
//        BinaryTreeUtility.printInOrder(root);

        int[] preOrder = {1,2,4,5,3,6,8,9,7};
        int[] inOrder = {4,2,5,1,8,6,9,3,7};


//        BinaryTreeNode<Integer> parent = BinaryTreeUtility.buildFromPreAndInOrder(
//                preOrder,inOrder,0,preOrder.length-1,
//                0,inOrder.length-1
//        );
        System.out.println();
        BinaryTreeUtility.printLevelWise(parent);

        System.out.println("Height of tree : "+BinaryTreeUtility.getTreeHeight(parent));
        System.out.println("Diameter of tree : "+BinaryTreeUtility.getDiameter(parent));

        int[] res = BinaryTreeUtility.getDiameterAndHeight(parent);
        System.out.println("Diameter: "+res[0]+" || "+"Height: "+res[1]);


        //        System.out.println("Number of nodes : "+BinaryTreeUtility.getNumberOfNodes(root));
    }
}
