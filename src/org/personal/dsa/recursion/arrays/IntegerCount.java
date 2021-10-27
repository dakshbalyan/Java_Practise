package org.personal.dsa.recursion.arrays;

import java.util.Scanner;

// Find the count of a num present in the arr
public class IntegerCount {
    public static void main(String[] args) {
        int[] arr = {5, 2, 5, 4, 5, 6, 4, 8, 8};
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
//            System.out.println(getIntegerCount(num, arr, 0));
            System.out.println(getIntegerCount(num, arr, arr.length-1));
        }
    }

    private static int getIntegerCount(int num, int[] arr, int index) {
        // base case
//        if(index == arr.length)
        if(index < 0)
            return 0;
        // recursive call
//        int cnt = getIntegerCount(num, arr, index + 1);
        int cnt = getIntegerCount(num, arr, index - 1);

        // calculation
        if(num == arr[index]){
            cnt++;
        }

        return cnt;
    }
}
