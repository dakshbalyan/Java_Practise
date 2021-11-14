package org.personal.dsa.tree.binarytree;


import java.util.ArrayList;
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

    public static BinaryTreeNode  takeInputLevelWise(){
        System.out.print("Enter parent: ");
        BinaryTreeNode root = new BinaryTreeNode(sc.nextInt());
        Queue<BinaryTreeNode> q = new LinkedList();
        q.add(root);
        while(q.size() != 0){
            BinaryTreeNode parent = q.poll();
            System.out.print("Enter left child of "+parent.toString()+" : ");
            int leftChildData = sc.nextInt();
            if(leftChildData != -1){
                parent.left = new BinaryTreeNode(leftChildData);
                q.add(parent.left);
            }
            System.out.print("Enter right child of "+parent.toString()+" : ");
            int rightChildData = sc.nextInt();
            if(rightChildData!=-1){
                parent.right = new BinaryTreeNode(rightChildData);
                q.add(parent.right);
            }

        }
        return root;
    }

    public static void printLevelWise(BinaryTreeNode root){
        if( root == null ) return;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size() != 0) {
            BinaryTreeNode parent = q.poll();

            System.out.print(parent + " : ");

            if (parent.left != null) {
                q.add(parent.left);
                System.out.print("L" + parent.left);
            }
            if (parent.right != null) {
                q.add(parent.right);
                System.out.print(", R" + parent.right);
            }
            System.out.println();

        }
    }

    public static int getNumberOfNodes(BinaryTreeNode root){
        if( root  == null )
            return 0;

        int leftCnt = getNumberOfNodes(root.left);
        int rightCnt = getNumberOfNodes(root.right);

        return leftCnt+rightCnt+1;
    }

    // root, left, right
    public static void printPreOrder(BinaryTreeNode root){
        if (root == null) {
            return;
        }

        System.out.print(root+", ");

        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    // left, right, root
    public static void printPostOrder(BinaryTreeNode root){
        if( root == null ){
            return;
        }

        printPostOrder(root.left);
        printPostOrder(root.right);

        System.out.print(root+", ");
    }

    // left, root, right
    public static void printInOrder(BinaryTreeNode root){
        if( root == null ){
            return;
        }

        printInOrder(root.left);
        System.out.print(root+", ");
        printInOrder(root.right);

    }

    /* The idea is to get the built tree from left and right subtree and attach it to the
       root. To build the left and right subtree we call the function in recursion where
       we pass the left and right subtree's preOrder and inOrder.
     */
    public static BinaryTreeNode buildFromPreAndInOrder(int[] preOrder, int[] inOrder,
               int preStart, int preEnd, int inStart, int inEnd){

        // base case
        if( preStart > preEnd || inStart > inEnd)
            return null;
        // Calculations to find the left and right subtree's inOrder and preOrder
        int rootData = preOrder[preStart];
        BinaryTreeNode<Integer> root = new BinaryTreeNode(rootData);
        int rootIndexInOrder = 0;
        for(int i = inStart ; i <= inEnd ; i++){
            if(inOrder[i] == rootData) {
                rootIndexInOrder = i;
                break;
            }
        }
        int lInStart = inStart, rInStart = rootIndexInOrder+1;
        int lPreStart = preStart+1;
        int lInEnd = rootIndexInOrder-1, rInEnd = inEnd;
        int lPreEnd = lInEnd - lInStart + lPreStart, rPreEnd = preEnd;
        int rPreStart = lPreEnd+1;

        // Recursive calls
        root.left = buildFromPreAndInOrder(preOrder, inOrder, lPreStart, lPreEnd, lInStart,lInEnd);
        root.right = buildFromPreAndInOrder(preOrder, inOrder, rPreStart, rPreEnd,rInStart, rInEnd);

        return root;
    }

    /*
    *   Diameter of a tree -> Maximum distance between any 2 nodes in a tree
    *   Basic approach is based from adding the left subtree height and right subtree height and that would
    *   be your diameter. However, it fails when the right/left subtree has a bigger diameter than the sum
    *   of left and right tree height. Therefore, we return the max( lh+rh, ld, rd)
    *   Time complexity -> O(n*h)
    *   n - number of nodes and h is height of tree
    * */
    public static int getDiameter(BinaryTreeNode root){
        // base case
        if(root == null){
            return 0;
        }
        // Recursive calls
        int leftDiameter = getDiameter(root.left);
        int rightDiameter = getDiameter(root.right);
        int leftHeight = getTreeHeight(root.left);
        int rightHeight = getTreeHeight(root.right);

        // calculation
        return Math.max(leftHeight+rightHeight, Math.max(leftDiameter, rightDiameter));
    }
    /*
    * Technique to reduce time complexity by calling for 2 things we need in a single recursion call.
    * The above problem has been reduced from O(n*h) to O(n) here.
    *   T(n) = 2*T(n/2) + k*n
    *   gives O(n) and not O(logn)
    * */
    public static int[] getDiameterAndHeight(BinaryTreeNode root){
        if (root == null){
            return new int[]{0,0};
        }

        int[] leftDiameterAndHeight = getDiameterAndHeight(root.left);      // T(n/2)
        int[] rightDiameterAndHeight = getDiameterAndHeight(root.right);    // T(n/2)

        // Constant work for every node visited
        int[] ans = new int[2];
        // diameter
        ans[0] = Math.max(leftDiameterAndHeight[1] + rightDiameterAndHeight[1],
                Math.max(leftDiameterAndHeight[0],rightDiameterAndHeight[0]));
        // height
        ans[1] = Math.max(leftDiameterAndHeight[1], rightDiameterAndHeight[1]) + 1;

        return ans;
    }
    public static void printAtLevelK(BinaryTreeNode root, int k){

    }

    // Time complexity - O(n)
    public static int getTreeHeight(BinaryTreeNode root){
        // base case
        if(root == null){
            return 0;
        }
        // Calculation with recursion
        int height = Math.max(getTreeHeight(root.left), getTreeHeight(root.right)) + 1;

        return height;
    }
    // The below method makes extra calls after the elem and path is found
    public static ArrayList<Integer> getPath(BinaryTreeNode root, int k){
        // edge case
        if ( root == null ){
            return null;
        }
        int rootData = (int) root.data;
        // base case
        if ( rootData == k ){
            ArrayList<Integer> al = new ArrayList<>();
            al.add(rootData);
            return al;
        }

        ArrayList<Integer> leftPath = getPath(root.left, k);
        ArrayList<Integer> rightPath = getPath(root.right, k);

        if ( leftPath == null && rightPath == null ){
            return null;
        } else if ( leftPath != null && rightPath == null ){
            leftPath.add(rootData);
            return leftPath;
        } else if ( leftPath == null && rightPath != null ){
            rightPath.add(rootData);
        }

        return rightPath;
    }

    // Important technique to be used in other problems
    public static ArrayList<Integer> optimisedPathFromRoot(BinaryTreeNode root, int k){
        if (root == null){
            return null;
        }

        int rootData = (int) root.data;

        if (rootData == k){
            ArrayList<Integer> al = new ArrayList<>();
            al.add(rootData);
            return al;
        }

        ArrayList<Integer> leftPath = optimisedPathFromRoot(root.left, k);
        if (leftPath != null){
            leftPath.add(rootData);
            return leftPath;
        }

        ArrayList<Integer> rightPath = optimisedPathFromRoot(root.right, k);
        if (rightPath != null){
            rightPath.add(rootData);
            return rightPath;
        }

        return null;
    }
}
