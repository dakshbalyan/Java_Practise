package org.mediaagility.training.assignments.third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModelObjectConsole {
    public static void main(String[] args) throws IOException {
        System.out.println("==================================\n1. To create an object of Student!\n" +
                "2. To create a model of a car.\n0. To exit!\n==================================");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Infinite loop to take input unless user wants to exit
        while(true){
            System.out.print("Enter number : ");
            // Flag variable to run the switch condition
            // Every time the flag's value is either 1 or 2
            // a new object of Student or Car will be created respectively
            // with the values provided in the console
            int flag = Integer.parseInt(br.readLine());
            switch (flag){
                case 0 : System.exit(0);
                case 1 :{
                    Student obj = new Student();
                    System.out.println("Enter name and age of student : ");
                    String param = br.readLine();
                    String[] paramArr = param.split(" ");   // parameters array

                    try{
                        obj.setName(paramArr[0]);
                        obj.setAge(Integer.parseInt(paramArr[1]));
                    }catch(Exception e){
                        System.out.println(e.toString());
                        break;
                    }
                    System.out.println("Student "+obj.getName()+" is "+obj.getAge()+" years old.");
                    break;
                }

                case 2 :{
                    Car obj = new Car();
                    System.out.println("Enter company name, model of car, year of manufacture and color of the car: ");
                    String param = br.readLine();
                    String[] paramArr = param.split(" ");

                    try{
                        obj.setCompany(paramArr[0]);
                        obj.setModel(paramArr[1]);
                        obj.setYearOfManufacture(Integer.parseInt(paramArr[2]));
                        obj.setColor(paramArr[3]);
                    }catch(Exception e){
                        System.out.println(e.toString());
                        break;
                    }
                    System.out.println(obj.getCompany()+" "+obj.getModel()+" was manufactured on "+

                            obj.getYearOfManufacture()+ " and is a "+obj.getColor()+ " car.");
                    break;
                }

                default: {
                    System.out.println("Enter a valid number !!");
                    break;
                }
            }
        }
    }
}

class Student{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Car{
    private String Company;

    private String model;

    private int yearOfManufacture;
    private String color;

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
