package com.system.parkinglot.model.dto;

import java.util.List;

import com.system.parkinglot.model.entities.Gate;
import com.system.parkinglot.model.entities.ParkingFloor;


public class ParkingLotResponse {
    int parkingLotId;
    String name;
    String type; 
    List<ParkingFloor> parkingFloors;
    List<Gate> gates;
}
