package org.personal.dsa.recursion;

import java.util.Scanner;

/*
Problem statement -> Find the index for first occurrence of a number in the
array. If it doesn't exist then return -1.
 */
public class FirstIndex {
    public static void main(String[] args) {
        int[] arr = {5,2,5,4,5,6,4,8,8};
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = sc.nextInt();
            System.out.println(getFirstIndex(num, arr, 0));
        }
    }
/*
Basic intuition was not write base case at first, rather think how you
would divide the problem into sub problems. Then think where the division
into smaller problems should stop. There may come some area where we have
to write some more logic -> this particular logic should be written keeping
the PMI principle in mind. Write the logic for nth recursive call, assuming
that the previous recursion calls will give you the right results.

After code is ready, then do your dry runs.
 */
    private static int getFirstIndex(int num, int[] arr, int index) {
        // base case
        if(index == arr.length)
            return -1;
        if(num == arr[index]){
            return index;
        }
        return getFirstIndex(num, arr, index + 1);
    }
}
