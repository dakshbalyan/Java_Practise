package org.personal.dsa.recursion.strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeypadSubsequence {
    private final Map<Integer,String> keyMap = new HashMap<>(10);
    private final String alphabets = "abcdefghijklmnopqrstuvwxyz";
    public void fillUpKeys(){
        int j = 0, k = 3;
        keyMap.put(0,"#");
        for(int i = 1 ; i < 9 ; i++){
            keyMap.put(i,alphabets.substring(j,k));
            j+=3; k+=3;
        }
        keyMap.put(9,alphabets.substring(j));
        System.out.println(keyMap);
    }

    public void getSubseq(int num, List<String> out){
        if(num == 0){
            out.add("");
            return;
        }

        getSubseq(num/10,out);
        int currNum = num%10;
        int size = out.size();
        // Copying the existing strings
        for(int i = 1; i < keyMap.get(currNum).length(); i++){
            for(int j = 0; j < size;j++){
                out.add(out.get(j));
            }
        }
        int ptr = 0, i = 0;
        // Updating the list
        while(i < out.size()){
            for(int j = 0 ; j < size && ptr < keyMap.get(currNum).length(); j++){
                String s = out.get(i)+keyMap.get(currNum).charAt(ptr);
                out.set(i,s);
                i++;
            }
            ptr++;
        }
    }

    public void printKepadSubsequence(int num, String out){
        if (num == 0){
            System.out.println(out);
            return;
        }
        int currNum = num%10;
        for(int i = 0 ; i < keyMap.get(currNum).length();i++){
            printKepadSubsequence(num/10,keyMap.get(currNum).charAt(i)+out);
        }
    }
}
