package org.personal.dsa.tree.normaltree;

import java.util.*;

public class TreeNode<T> {
    private Scanner scanner = new Scanner(System.in);
    public T data;
    public List<TreeNode> children;

    public TreeNode(T data) {
        this.data = data;
        children = new ArrayList<>();
    }

    public TreeNode(){
        children = new ArrayList<>();
    }
    public void printTree(TreeNode<T> root) {
        // Not a base but an edge case
        if(root == null) return;
        // No need to declare base case here since it is already taken care of
        // How ? -> If there are no child for a root then the program won't go
        // inside the for loop only
        System.out.print(root.data + " : " );
        for (TreeNode child : root.children) {
            System.out.print(child.data+",");
        }
        System.out.println();
        for(int i = 0 ; i < root.children.size(); i++){
            printTree(root.children.get(i));
        }
    }

    public TreeNode<T> takeInputLevelWise(){
        System.out.print("Enter root: ");
        int rootData = scanner.nextInt();
        // The Queue is used to remember the order of children added to the parent Node
        // The Front of each queue when polled will refer to the parent Node
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(rootData);
        queue.add(root);
        while(queue.size() != 0 ){
            TreeNode parentNode = queue.poll();
            System.out.println("Enter num of children for "+parentNode+" : ");
            int numChild = scanner.nextInt();
            for(int i = 0 ; i < numChild; i++){
                System.out.print("Enter "+(i+1)+"th Child: ");
                int childData = scanner.nextInt();
                TreeNode childNode = new TreeNode(childData);
                parentNode.children.add(childNode);
                queue.add(childNode);
            }
        }

        return root;
    }

    public void printTreeLevelWise(TreeNode root){
        Queue<TreeNode> queue =  new LinkedList<>();
        queue.add(root);
        while(queue.size() != 0){
            TreeNode parent = queue.poll();
            System.out.print(parent+",");
            parent.children.forEach(e-> {
                queue.add((TreeNode) e);
            });
        }
        System.out.println();
    }
    // Same as printTree
    public void printPreOrder(TreeNode root){
        if(root == null)
            return;
        System.out.print(root.data+",");
        for(int i = 0 ; i < root.children.size(); i++){
            printPreOrder((TreeNode) root.children.get(i));
        }
    }

    public void printPostOrder(TreeNode root){
        if(root == null)
            return;
        for(int i = 0 ; i < root.children.size(); i++){
            printPostOrder((TreeNode) root.children.get(i));
        }
        System.out.print(root.data+",");
    }



    @Override
    public String toString() {
        return  String.valueOf(data);
    }
}
