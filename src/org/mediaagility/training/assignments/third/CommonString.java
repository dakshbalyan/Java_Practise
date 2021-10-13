package org.mediaagility.training.assignments.third;

import java.util.Arrays;
import java.util.Scanner;

public class CommonString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String str2 = sc.nextLine();

        String[] str1Array = new String[str1.length()];
        String[] str2Array = new String[str2.length()];

        for(int i = 0 ; i < str1.length(); i++) str1Array[i] = String.valueOf(str1.charAt(i));
        for(int i = 0 ; i < str2.length(); i++) str2Array[i] = String.valueOf(str2.charAt(i));

        String commonStr = commonString(str1Array,str2Array);
        if(commonStr.length()!=0)
            System.out.println("Common string is =====> "+commonStr);
        else
            System.out.println("No common string!!!!");
    }

    private static String commonString(String[] str1, String[] str2) {
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < str1.length ; i++){
            int k = i;
            StringBuilder temp = new StringBuilder();
            for(int j = 0 ; j < str2.length && k < str1.length; j++){
                if(str1[k].equals(str2[j])){
                    temp.append(str1[k++]);
                }
            }
            res = (res.length() > temp.length()) ? res : temp;
        }

        return res.toString();
    }
}
