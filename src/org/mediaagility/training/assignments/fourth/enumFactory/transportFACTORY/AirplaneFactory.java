package org.mediaagility.training.assignments.fourth.enumFactory.transportFACTORY;

import org.mediaagility.training.assignments.fourth.enumFactory.transportPRODUCT.Airplane;
import org.mediaagility.training.assignments.fourth.enumFactory.transportPRODUCT.Transport;

public class AirplaneFactory implements TransportCreatorFactory {
    @Override
    public Transport createTransport(int capacity) {
        return new Airplane(capacity);
    }
}
