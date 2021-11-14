package org.personal.dsa.tree.binarytree.binarysearchtree;

import org.personal.dsa.tree.binarytree.BinaryTreeNode;

public class BST {
    private BinaryTreeNode<Integer> root;

    public BinaryTreeNode<Integer> getRoot(){ return this.root; }
    public BST(){
        root = null;
    }

    public void deleteData(int k){
        this.root = delete(this.root, k);
    }

    public void add(int k){
        this.root = add(this.root, k);
    }

    public boolean hasData(int k){
        return hasData(this.root, k);
    }

    private boolean hasData(BinaryTreeNode<Integer> root, int k){
        if( root == null ){
            return false;
        }
        int rootData = root.data;
        boolean ans = false;
        if ( k == rootData ){
            return true;
        } else if ( k < rootData ){
            ans = hasData(root.left,k);
        } else {
            ans = hasData(root.right, k);
        }

        return ans;
    }
    private BinaryTreeNode<Integer> add(BinaryTreeNode<Integer> root, int k){
        if ( root == null ){
            return new BinaryTreeNode<>(k);
        }
        int rootData = root.data;
        if ( k < rootData ){
            root.left = add(root.left, k);
        } else {
            root.right = add(root.right, k);
        }

        return root;
    }

    // Important technique
    private BinaryTreeNode<Integer> delete(BinaryTreeNode<Integer> root, int k){
        if (root == null){
            return null;
        }

        int rootData = root.data;
        if ( k == rootData ){
            if ( root.left != null && root.right != null ){
                BinaryTreeNode<Integer> maxNode = root.left;
                while(maxNode.right != null)
                    maxNode = maxNode.right;
                int leftMax = maxNode.data;
//            int rightMin = BstUtility.minimum(root.right);
                root.data = leftMax;
                root.left = delete(root.left, leftMax);
                return root;
            } else if ( root.left == null && root.right != null){
                return root.right;
            } else if ( root.left != null && root.right == null ){
                return root.left;
            } else {
                return null;
            }
        } else if ( k < rootData ){
            root.left = delete(root.left, k);
            return root;
        } else {
            root.right = delete(root.right, k);
            return root;
        }
    }

}
