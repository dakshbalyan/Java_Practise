package org.personal.dsa.recursion.strings;

import java.util.List;

public class AllSubsequences {
    // Takes 2^n space
    public static void getAllSubsequences(String s, List<String> out, int index){
        if(index == s.length()){
            out.add("");
            return;
        }

        getAllSubsequences(s,out,index+1);
        int size = out.size();
        for(int i = 0 ; i < size; i++){
            String str = s.charAt(index)+out.get(i);
            out.add(str);
        }
    }


    public static void printAllSubsequences(String s, String out){
        if(s.length() == 0){
            System.out.println(out);
            return;
        }

        printAllSubsequences(s.substring(1),out);
        printAllSubsequences(s.substring(1),out+s.charAt(0));
    }
}
