package org.mediaagility.training.assignments.fourth.enumFactory.transportFACTORY;

import org.mediaagility.training.assignments.fourth.enumFactory.transportPRODUCT.Transport;
import org.mediaagility.training.assignments.fourth.enumFactory.transportPRODUCT.Truck;

public class TruckFactory implements TransportCreatorFactory{
    @Override
    public Transport createTransport(int capacity) {
        return new Truck(capacity);
    }
}
