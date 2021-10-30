package org.personal.dsa.recursion.stack;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        sort(stack);
    }

    private static void sort(Stack<Integer> stack) {
        if(stack.empty())
            return;
        int currNum = stack.pop();
    }
}
