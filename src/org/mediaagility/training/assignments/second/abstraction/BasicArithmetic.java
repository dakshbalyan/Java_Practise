package org.mediaagility.training.assignments.second.abstraction;

abstract class BasicArithmetic {
// The abstract class provided
    public float pi = 2.14f;

    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){
        return a/b;
    }

    public abstract int multiply(float a, int b);
}
