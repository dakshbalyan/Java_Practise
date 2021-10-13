package org.mediaagility.training.assignments.second.abstraction;

public class Area extends BasicArithmetic{
    // extending the functionality of Basic Arithmetic Class by using the provided methods
    // for basic arithmetic
    private int length, breadth, side, radius;

    // 2 overloaded constructors
    public Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public Area(int length, int breadth, int side, int radius) {
        this.length = length;
        this.breadth = breadth;
        this.side = side;
        this.radius = radius;
    }
    // getters and setters
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // methods extending the functionalities
    public int areaSquare(){
        return multiply(getSide(),getSide());
    }
    public int areaCricle(){
        return multiply(pi,multiply(getRadius(),getRadius()));
    }
    public int areaRectangle(){
        return multiply(length,breadth);
    }
    // overriding multiply method to suit requirement
    @Override
    public int multiply(float a, int b){
        return (int) (a*b);
    }
}
