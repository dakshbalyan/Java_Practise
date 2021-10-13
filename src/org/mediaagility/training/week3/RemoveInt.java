package org.mediaagility.training.week3;

import java.util.Scanner;

public class RemoveInt {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++)
            arr[i] = i+1;
        for(int x : arr)
            System.out.print(x+" ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        index--;
        while(index < arr.length - 1){
            arr[index] = arr[index+1];
            index++;
        }
        arr[arr.length-1] = 0;
        for(int x : arr)
            System.out.print(x+" ");
    }
}
