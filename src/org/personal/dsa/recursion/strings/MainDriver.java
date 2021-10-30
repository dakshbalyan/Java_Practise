package org.personal.dsa.recursion.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) {
//        char[] strArr = {'a','a','k','s','s','h','h','h','a'};
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

//        String s = scanner.nextLine();
//        char[] strArr = s.toCharArray();
//        List<String> allAnagrams = new LinkedList<>();
//        AllAnagrams.fetchAllAnagrams(s,0,allAnagrams);

//        allAnagrams.forEach(System.out::println);

//        ReverseString.reverseString(strArr,0);
//        for (char c : strArr)
//            System.out.print(c+" ");
//        List<String> ans = new ArrayList<>();
//        AllSubsequences.getAllSubsequences(s,ans,0);
//        AllSubsequences.printAllSubsequences(s,new String());
//

//        System.out.println();


        int num = scanner.nextInt();
        KeypadSubsequence keypad = new KeypadSubsequence();
        keypad.fillUpKeys();
        keypad.printKepadSubsequence(num,new String());
//        keypad.getSubseq(num, ans);
//        ans.forEach(str-> System.out.println(str));

    }
}
