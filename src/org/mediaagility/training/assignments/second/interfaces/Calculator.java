package org.mediaagility.training.assignments.second.interfaces;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArithmeticFunctions arithmeticFunctions = new ArithmeticFunctions();
        System.out.println("Select by entering number\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        int choice = sc.nextInt();
        System.out.println("Enter numbers!");
        double a = sc.nextDouble(), b = sc.nextDouble();
        switch (choice) {
            case 1 -> System.out.println("Sum is: " + arithmeticFunctions.add(a, b));
            case 2 -> System.out.println("Difference is: " + arithmeticFunctions.subtract(a, b));
            case 3 -> System.out.println("Product is: " + arithmeticFunctions.multiply(a, b));
            case 4 -> System.out.println("Division result: " + arithmeticFunctions.divide(a, b));
            default -> System.out.println("Wrong number entered!!!");
        }
    }
}
