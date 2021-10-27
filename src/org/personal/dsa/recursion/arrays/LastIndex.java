package org.personal.dsa.recursion.arrays;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        int[] arr = {5, 2, 5, 4, 5, 6, 4, 8, 8};
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            // problem is easy if we start from the end of array
//            System.out.println(getLastIndex(num, arr, arr.length-1));
            // what if we start from beginning?
            System.out.println(getLastIndex(num, arr, 0));
        }
    }

    private static int getLastIndex(int num, int[] arr, int index) {
        // When last index of arr is passed initially
        //base case
//        if(index < 0)
//            return -1;
//        // Calculation for nth term
//        if(arr[index] == num)
//            return index;
        // recursive call to smaller subarray
//        return getLastIndex(num, arr, index-1);

        // When starting index of arr is passed initially
        // base case
        if(index == arr.length) {
            return -1;
        }
        // recursive call
        int lastIndex = getLastIndex(num, arr,index+1);

        // calculation
        if (num == arr[index]) {
            lastIndex = Math.max(index, lastIndex);
        }
        return lastIndex;
    }


}
