package org.personal.dsa.recursion.strings;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainDriver {
    private int i = 54;
    public static void main(String[] args) {
//        char[] strArr = {'a','a','k','s','s','h','h','h','a'};
//        char[] strArr = {};
//        System.out.println("String Length : " + StringLength.findStringLength(strArr, 0));
        Scanner scanner = new Scanner(System.in);
//        char ch = scanner.nextLine().charAt(0);
//        System.out.print("New arr after removal : ");
//        RemoveChar.removeCharFromString(strArr,0, ch);
//        for(char c : strArr)
//            System.out.print(c+" ");
//        System.out.println("\nLength after removal : "+StringLength.findStringLength(strArr,0));
//
//        RemoveContiguousDuplicate.removeDuplicates(strArr,0);
//
//        for (char c : strArr)
//            System.out.print(c+" ");
//
//        System.out.println();

        String s = scanner.nextLine();
        List<String> allAnagrams = new LinkedList<>();
        AllAnagrams.fetchAllAnagrams(s,0,allAnagrams);

        allAnagrams.forEach(System.out::println);

        double data = 44.32;

    }
}
