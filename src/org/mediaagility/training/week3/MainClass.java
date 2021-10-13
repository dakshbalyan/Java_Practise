package org.mediaagility.training.week3;

import java.util.ArrayList;
import java.util.List;

public class MainClass extends ImplementingGenerics{
    // Since the super class has a parameterised constructor the subclass also needs
    // to have a parameterised constructor
    // practise generic method, equals and hashcode
    public MainClass(Object o) {
        super(o);
    }

    public static void main(String[] args) {
        ImplementingGenerics<String> obj1 = new ImplementingGenerics("Example String");
        ImplementingGenerics<Integer> obj2 = new ImplementingGenerics(1234);
        obj2.display();
        obj1.display();

        List<Integer> listInt = new ArrayList<>();
        for(int i = 0 ; i < 10 ; i++)   listInt.add(i);
        obj1.setLi(listInt);
        obj1.printList();

        System.out.println();

        List<String> listString = new ArrayList<>();
        for(char i = 97; i < 110 ; i++) listString.add(String.valueOf(i));
        obj2.setLi(listString);
        obj2.printList();
    }
}
