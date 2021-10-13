package org.mediaagility.training.assignments.fourth.enumFactory;

import org.mediaagility.training.assignments.fourth.enumFactory.ENUMS.TranportTypeEnums;
import org.mediaagility.training.assignments.fourth.enumFactory.transportFACTORY.AirplaneFactory;
import org.mediaagility.training.assignments.fourth.enumFactory.transportFACTORY.ShipFactory;
import org.mediaagility.training.assignments.fourth.enumFactory.transportFACTORY.TransportCreatorFactory;
import org.mediaagility.training.assignments.fourth.enumFactory.transportFACTORY.TruckFactory;

import java.util.Scanner;

public class MainCallingClass {
    private static TransportCreatorFactory transport;

    public static void main(String[] args) {

        while(true){
            Scanner sc = new Scanner(System.in);
            String transportType = sc.nextLine();

            transportType = transportType.toUpperCase();

            createTranscport(transportType);
        }

    }

    private static void createTranscport(String transportType) {
        if(TranportTypeEnums.TRUCK.toString().equals(transportType)){
            transport = new TruckFactory();
            transport.callTransportFactory(1000);
        }else if(TranportTypeEnums.SHIP.toString().equals(transportType)){
            transport = new ShipFactory();
            transport.callTransportFactory(200000);
        }else if(TranportTypeEnums.AIRPLANE.toString().equals(transportType)){
            transport = new AirplaneFactory();
            transport.callTransportFactory(20000);
        }
    }
}
