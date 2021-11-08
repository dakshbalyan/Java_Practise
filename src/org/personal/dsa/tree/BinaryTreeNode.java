package org.personal.dsa.tree;

import java.util.Scanner;

public class BinaryTreeNode<T> {
    public T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }

    public BinaryTreeNode() {
    }

    @Override
    public String toString(){
        return String.valueOf(data);
    }
}
