package com.system.parkinglot.model.entities;

import java.util.List;

public class ParkingLot {
    int parkingLotId;
    String name;
    String type; 
    List<ParkingFloor> parkingFloors;
    List<Gate> gates;
}
