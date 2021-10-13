package org.mediaagility.training.assignments.fourth.enumFactory.transportPRODUCT;

public class Ship extends Transport{

    public Ship(int capacity) {
        super.setCapacity(capacity);
    }

    @Override
    public void move() {
        System.out.println("Ship is sailing with "+super.getCapacity()+" capacity !");
    }

    @Override
    public void stop() {
        System.out.println("Ship has docked!");
    }
}
