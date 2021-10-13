package org.mediaagility.training.assignments.second;

import org.mediaagility.training.assignments.second.FactoryClass.AreaPerimeterFactory;

import java.util.Scanner;

public class MainFactory extends AreaPerimeterFactory {

    // Main class extending to Factory class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Area or Perimeter:-");
        String str = sc.nextLine();
        System.out.println("Enter dimensions (length, breadth, side and radius):-");
        int length = sc.nextInt(), breadth = sc.nextInt(), side = sc.nextInt(), radius = sc.nextInt();
        getAreaPerimeter(str,length,breadth,side,radius);
    }
}
