package org.mediaagility.training.assignments.fourth.enumFactory.transportFACTORY;

import org.mediaagility.training.assignments.fourth.enumFactory.transportPRODUCT.Ship;
import org.mediaagility.training.assignments.fourth.enumFactory.transportPRODUCT.Transport;

public class ShipFactory implements TransportCreatorFactory{
    @Override
    public Transport createTransport(int capacity) {
        return new Ship(capacity);
    }
}
