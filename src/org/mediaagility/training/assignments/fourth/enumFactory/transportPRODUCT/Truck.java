package org.mediaagility.training.assignments.fourth.enumFactory.transportPRODUCT;

public class Truck extends Transport{

    public Truck(int capacity){
        super.setCapacity(capacity);
    }

    @Override
    public void move() {
        System.out.println("Truck is moving with "+super.getCapacity()+" capacity !");
    }

    @Override
    public void stop() {
        System.out.println("Truck has stopped!");
    }
}
