package org.mediaagility.training.assignments.second.interfaces;

public class ArithmeticFunctions implements Arithmetic{
    // class implementing the methods

    @Override
    public int add(int a, int b) { return a+b; }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    @Override
    public int divide(int a, int b) {
        return a/b;
    }

    @Override
    public double add(double a, double b){return a+b;}

    @Override
    public double subtract(double a, double b){return a-b;}

    @Override
    public double multiply(double a, double b){return a*b;}

    @Override
    public double divide(double a, double b){return a/b;}
}
