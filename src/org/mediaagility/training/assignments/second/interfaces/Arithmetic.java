package org.mediaagility.training.assignments.second.interfaces;

public interface Arithmetic extends BasicArithmetic {
    // The sub interface implementing Basic Arithmetic and extending
    // functionality by accepting arguments as double

    public abstract double add(double a, double b);
    public abstract double subtract(double a, double b);
    public abstract double multiply(double a, double b);
    public abstract double divide(double a, double b);
}
