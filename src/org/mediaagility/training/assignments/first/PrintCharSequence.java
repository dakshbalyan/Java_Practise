package org.mediaagility.training.assignments.first;

public class PrintCharSequence {
    public static void main(String[] args) {
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 97 ; j <= 97 + i; j++) {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
