package org.mediaagility.training.assignments.second;

public class ReverseString {
    public static void main(String[] args) {
        String originalString = "JAVA";
        String reversedString = "";

        // printing to a new string by iterating from the last character of
        // original string
        for(int i = originalString.length() - 1  ; i > -1 ; i--){
            reversedString+=originalString.charAt(i);
        }

//        System.out.println(5/0);

        System.out.println("Original String : "+ originalString+"\nReversed String : "+reversedString);
    }
}
