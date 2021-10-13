package org.mediaagility.training.assignments.second.FactoryClass;

import org.mediaagility.training.assignments.second.abstraction.Area;
import org.mediaagility.training.assignments.second.abstraction.Perimeter;

public class AreaPerimeterFactory{
    // Factory class doing the same thing as in abstraction package classes
    public static void getAreaPerimeter(String str, int length, int breadth, int side, int radius){
        switch(str){
            case "Area":
                Area area = new Area(length, breadth, side, radius);
                System.out.println("Areas of Figures\n\t1. Rectangle: " + area.areaRectangle());
                System.out.println("\t2. Square: " + area.areaSquare());
                System.out.println("\t3. Circle: " + area.areaCricle());
                break;
            case "Perimeter":
                Perimeter perimeter = new Perimeter(length, breadth, side, radius);
                System.out.println("Perimeters of figures\n\t1. Rectangle: " + perimeter.perimeterRect());
                System.out.println("\t2. Square: " + perimeter.perimeterSq());
                System.out.println("\t3. Circle: " + perimeter.perimeterCircle());
                break;
            default: break;
        }
    }

}
