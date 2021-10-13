package org.mediaagility.training.week4;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamsPractise {
    public static void main(String[] args) {
//        List<String> li = new ArrayList<>();
//        li.add(randomString(5));
//        li.add(randomString(5));
//        li.add(randomString(5));
//        li.add(randomString(5));

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(randomString(5)));
        list.add(new Employee(randomString(5)));
        list.add(new Employee(randomString(5)));
        list.add(new Employee(randomString(5)));
        list.add(new Employee(randomString(5)));

//        Stream<String> stream = li.stream();
//        for(String s : li)
//            System.out.println(s);
//        // Below are non-terminal operations
//        // A stream supports only 1 non-terminal operation
//        Stream<String> lowerCaseStream = stream.map(s -> {
//            return s.toLowerCase();
//        });
//
//        Stream<String> upperCaseStream = lowerCaseStream.map(s -> {
//            return s.toUpperCase();
//        });
//
//        upperCaseStream.forEach(s -> System.out.println(s)); // this is a terminal operation

        // Instead of using the above method where we create a new variable
        // again and again, what we can simply do is make use of method chaining

//        li.stream()
//                .map(s -> s.toLowerCase())
//                .map(s -> s.toUpperCase())
//                .forEach(s -> System.out.println(s));

        list.stream()
                .map(employee -> employee.salary)
                .map(s -> Integer.parseInt(s))
        .forEach(i -> System.out.println(i));

    }

    private static String randomString(int size) {
//        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//                + "0123456789"
//                + "abcdefghijklmnopqrstuvxyz";
        String numericString = "0123456789";

        StringBuilder sb = new StringBuilder(size);

        for(int i = 0 ; i < size ; i++){
            // Math.random() returns always 0 - 1 in double
            // If multiplied by AlphanumericString.length then the range of
            // index will always be between 0 - AlphanumericString.length
//            int index = (int) (AlphaNumericString.length() * Math.random());
            int index = (int) (numericString.length() * Math.random());

//            sb.append(AlphaNumericString.charAt(index));
            sb.append(numericString.charAt(index));
        }
        return sb.toString();
    }

    public static class Employee{
        public String salary;
        public Employee(String salary){
            this.salary = salary;
        }
    }
}
