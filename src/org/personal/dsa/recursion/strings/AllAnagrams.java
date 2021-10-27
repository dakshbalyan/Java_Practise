package org.personal.dsa.recursion.strings;

import java.util.ArrayList;
import java.util.List;

// Program to return all anagrams for a given string
public class AllAnagrams {
    public static void fetchAllAnagrams(String s, int index, List<String> ans) {

        if(index == s.length() - 1 ){
            ans.add(String.valueOf(s.charAt(index)));
            return;
        }

        fetchAllAnagrams(s, index + 1, ans);
        for(int i = 0 ; i < ans.size() ; i++){
            StringBuilder str = new StringBuilder(ans.get(i));
            List<String> localRes = new ArrayList<>(str.length()+1);
            for(int j = 0 ; j <= str.length(); j++){
                str.insert(j,s.charAt(index));
                localRes.add(str.toString());
                str.deleteCharAt(j);
            }
            ans.remove(i);
            ans.addAll(localRes);
        }


    }
}
