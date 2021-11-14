package org.personal.dsa.tree.normaltree;

public class TreeUtility {
    public static int getNumberOfNodes(TreeNode root){
        if(root == null) return 0;
        int cnt = 1;
        for(int i = 0 ; i < root.children.size() ; i++) {
            cnt += getNumberOfNodes((TreeNode) root.children.get(i));
        }

        return cnt;
    }

    public static void printAtLevelK(TreeNode root, int k){
        if(root == null) return;
        if( k == 0 ) {
            System.out.print(root.data + ",");
            return;
        }
        for(int i = 0 ; i < root.children.size(); i++){
            printAtLevelK((TreeNode) root.children.get(i),k-1);
        }
    }

    public static int getTreeHeight(TreeNode root){
        if(root == null)
            return 0;
        int[] lowerLevelHeight = new int[root.children.size()];
        for(int i = 0 ; i < lowerLevelHeight.length; i++){
            lowerLevelHeight[i] = getTreeHeight((TreeNode) root.children.get(i));
        }
        int maxHeight = 0;
        for(int i = 0 ; i < lowerLevelHeight.length;i++){
            if(maxHeight < lowerLevelHeight[i])
                maxHeight = lowerLevelHeight[i];
        }

        return maxHeight+1;
    }

    public static int getNumberOfLeafNodes(TreeNode root){
        if(root == null) return 0;
        // base case
        if(root.children.size() == 0){
            return 1;
        }
        int leafNumber = 0;
        for(int i = 0 ; i < root.children.size(); i++){
            leafNumber+=getNumberOfLeafNodes((TreeNode) root.children.get(i));
        }

        return leafNumber;
    }
}
