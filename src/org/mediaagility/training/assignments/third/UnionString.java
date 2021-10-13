package org.mediaagility.training.assignments.third;

import java.util.HashSet;
import java.util.Scanner;

public class UnionString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter stream of string into array 1 : ");
            String str1 = sc.nextLine();
            String[] arrString1 = str1.split(" ");
            System.out.print("\nEnter stream of string into array 2 : ");
            String str2 = sc.nextLine();
            String[] arrString2 = str2.split(" ");

            String[] unionStringArr = findUnionUsingArray(arrString1, arrString2);
//        String[] unionStringArr = findUnionUsingSet(arrString1,arrString2);

            System.out.println("\nThe union of strings are -->");
            for (String s : unionStringArr) {
                if (s != null)
                    System.out.print(s + ", ");
            }
            System.out.println();
        }
    }

    // I have implemented the union of strings using two data structures
    // one is with sets and other is with arrays

    // Using set the duplicates get automatically removed after adding all the string arrays elements
    // and the set can be returned as a string array
    private static String[] findUnionUsingSet(String[] arrString1, String[] arrString2) {
        HashSet<String> set = new HashSet<>();

        for(String s : arrString1)
            set.add(s);
        for(String s : arrString2)
            set.add(s);

        return set.toArray(new String[set.size()]);
    }

    // Here, the implementation using array is different.
    // The idea is to create an array with the size of the sum of sizes of the input arrays.
    // Then, copy one input array's elements to the result array, then iterate over the second input
    // array and check for duplicates for each element in the second input array and result array
    private static String[] findUnionUsingArray(String[] arrString1, String[] arrString2) {
        String[] res = new String[arrString1.length+ arrString2.length];    // result array
        for(int i = 0 ; i < arrString1.length ; i++)
            res[i] = arrString1[i];

        int ptr = arrString1.length;    // pointer to keep track of adding strings to res from arrString2
        for(int i = 0 ; i < arrString2.length ; i++){
            boolean ifDuplicate = false;
            // Inner loop iterates over the res array and checks for each string in arrString2
            // if it is already present in res array or not, if present we break out of the loop
            for(int j = 0 ; j < arrString1.length ; j++){
                if(arrString2[i].equals(res[j])){
                    ifDuplicate = true; break;
                }
            }
            // If the current element of arrString2 doesn't have any duplicates in res array
            // then we add it to the res array
            if(!ifDuplicate)
                res[ptr++] = arrString2[i];
        }

        return res;
    }
}
