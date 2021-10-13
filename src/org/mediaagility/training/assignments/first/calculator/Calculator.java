package org.mediaagility.training.assignments.first.calculator;

public class Calculator {
    public static void main(String[] args) {
        Functions functions = new Functions();

        System.out.println("Integer add: "+functions.add(2,3));
        System.out.println("Float add: "+functions.add(2.6f,3.5f));
        System.out.println("Double add: "+functions.add(2.9d,3.2d));
    }
}
