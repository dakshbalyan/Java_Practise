package org.mediaagility.training.assignments.fourth.enumFactory.transportPRODUCT;

public abstract class Transport {
    private int capacity;

    public void setCapacity(int val){
        capacity = val;
    }
    public int getCapacity(){ return capacity; }

    public abstract void move();
    public abstract void stop();

}
