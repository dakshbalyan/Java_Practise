package org.mediaagility.training.week3;

import java.util.List;

public class ImplementingGenerics<T> implements ExampleGeneric<T>{
    private T t ;
    private List<?> li; // implementing wildcards

    public ImplementingGenerics(T t) {
        this.t = t;
    }

    public void setLi(List<?> li) {
        this.li = li;
    }

    @Override
    public void display() {
        System.out.println(t);
    }

    @Override
    public void printList() {
        for(Object o : li)
            System.out.print(o);
    }
}
