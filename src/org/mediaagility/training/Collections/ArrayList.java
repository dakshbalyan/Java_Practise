package org.mediaagility.training.Collections;

import java.util.List;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer> al = new java.util.ArrayList<>();
        for(int i = 0 ; i < 10 ; i++)
            al.add(i+1);

        System.out.print("Element to find: ");
        Scanner sc = new Scanner(System.in);
        int find = sc.nextInt();
        if(al.contains(find))
            System.out.println("\nTrue");
        else
            System.out.println("\nFalse");
    }
}
