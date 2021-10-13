package org.mediaagility.training.assignments.third;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.nextLine();
            if(str.equals("0")) System.exit(0);

            if (ifPalindromeCombination(str.toLowerCase()))
                System.out.println("Entered String CONTAINS a Palindrome!");
            else
                System.out.println("Entered String does NOT CONTAIN a Palindrome!");
        }

    }
    /*
    The basic underlying principle is to take an array where the indexes represents the
    alphabets positioning wrt their ASCII values. Example : a --> 97 ASCII value
    Thus, arr[0] will represent a, arr[1] for b and so on.
    The arr will maintain a count of the alphabets in the word. Looking at the pattern of palindromes
    I observed that -->
    If the count of alphabet in the word is even and at most a single alphabet has an odd count only
    then the word contains a combination of a possible palindrome!
    */

    private static boolean ifPalindromeCombination(String str){
        int[] counter = new int[26];    // array keeping count of alphabets in the words

        // for loop to set the counts
        for(int i = 0 ; i < str.length() ; i++){
            counter[str.charAt(i) - 97]++;
        }
        // keeping the count of the single occurring alphabet
        int oddCount = 0;
        boolean flag = true;    // to be returned value
        for(int x : counter){
            // If the count of alphabet is odd and
            // the frequency of odd alphabets is > 1 then
            // palindrome is not possible
            if(x%2!=0 && oddCount > 1) {
                flag = false;
                break;
            }else if(x%2 == 1){
                // If there are more than 1 alphabet with odd count
                // then no chance of it being a palindrome
                if(oddCount >= 1){
                    flag = false;
                    break;
                }else
                    oddCount++;
            }
        }

        return flag;
    }

}
