package org.personal.dsa.recursion;

public class PrintSubsequences {
    public static void main(String[] args) {
        String s = "abc";
        // A naive approach would be to have a window of length
        // string.length() slide it over the string by reducing
        // it by 1 after full sliding. Print everything.
        // Time -> O(2^n) solution maybe

        // Recursion
        String[] out = new String[(int) Math.pow(2, s.length())];
//        printSubsequences(s, out, 0, 0);
    }

//    private static void printSubsequences(String s, String[] out, int sIndex, int outIndex) {
//        if(sIndex == s.length() && outIndex < out.length)
//            out[outIndex] = "";
//
//        printSubsequences(s,out,sIndex+1, outIndex+1);
//
//        for(int i = 0 ; i < )
//    }
}
