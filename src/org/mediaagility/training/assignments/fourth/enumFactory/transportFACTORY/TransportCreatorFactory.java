package org.mediaagility.training.assignments.fourth.enumFactory.transportFACTORY;

import org.mediaagility.training.assignments.fourth.enumFactory.transportPRODUCT.Transport;

public interface TransportCreatorFactory {

    default void callTransportFactory(int capacity){
        Transport transport = createTransport(capacity);
        transport.move();
        try {
            Thread.sleep(5000);
            transport.stop();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    Transport createTransport(int capacity);
}
