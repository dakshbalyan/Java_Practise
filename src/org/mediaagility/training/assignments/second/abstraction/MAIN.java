package org.mediaagility.training.assignments.second.abstraction;

public class MAIN {
    public static void main(String[] args) {
        // Whether we require the Area or Perimeter of the figures is passed as cmd line arguement

        if(args[0].equals("Area")){
            Area area = new Area(10, 5);
            System.out.println("Areas of Figures\n\t1. Rectangle: " + area.areaRectangle());
            area.setSide(4);
            System.out.println("\t2. Square: " + area.areaSquare());
            area.setRadius(5);
            System.out.println("\t3. Circle: " + area.areaCricle());
        }else if(args[0].equals("Perimeter")) {
            Perimeter perimeter = new Perimeter(8, 4);
            System.out.println("Perimeters of figures\n\t1. Rectangle: " + perimeter.perimeterRect());
            perimeter.setSide(5);
            System.out.println("\t2. Square: " + perimeter.perimeterSq());
            perimeter.setRadius(6);
            System.out.println("\t3. Circle: " + perimeter.perimeterCircle());
        }
    }
}
