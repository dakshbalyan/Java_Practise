package org.mediaagility.training.assignments.fourth.enumFactory.transportPRODUCT;

public class Airplane extends Transport{

    public Airplane(int capacity) {
        super.setCapacity(capacity);
    }

    @Override
    public void move() {
        System.out.println("Airplane is flying with "+super.getCapacity()+" capacity !");
    }

    @Override
    public void stop() {
        System.out.println("Airplane has landed!");
    }
}
