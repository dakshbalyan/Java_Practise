package org.personal.dsa.recursion.arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {1,4,-7,2,-9,6,3};
        sort(arr,0);
        for(int i : arr)
            System.out.println(i);
    }

    private static void sort(int[] arr, int index) {
        // base case
        if(index == arr.length)
            return;
        // Recursive call
        sort(arr,index+1);
        // Calculation
        int ptr = index;
        for(int i = index+1; i < arr.length; i++){
            if(arr[ptr] > arr[i]) {
                swap(arr, ptr, i);
                ptr = i;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
    }

}
