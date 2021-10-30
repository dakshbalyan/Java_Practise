package org.personal.dsa.recursion.strings;

public class ReverseString {
    public static void reverseString(char[] s, int index) {
        // Base case
        if( index == s.length - 1 )
            return;
        // Recursive call
        reverseString(s, index + 1);

        // Calculation
        char tmp = s[index];
        for(int i = index ; i < s.length - 1 ; i++){
            s[i] = s[i+1];
        }
        s[s.length-1] = tmp;

    }
}
