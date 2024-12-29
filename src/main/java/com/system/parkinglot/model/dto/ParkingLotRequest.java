package com.system.parkinglot.model.dto;

import java.util.List;

import com.system.parkinglot.constant.enums.ParkingAreaType;
import com.system.parkinglot.model.entities.Gate;
import com.system.parkinglot.model.entities.ParkingFloor;



public class ParkingLotRequest {
    String parkingLotName;
    ParkingAreaType parkingAreaType;
    String parkingLotAddress;
    List<ParkingFloor> parkingFloors;
    List<Gate> gates;
    
}
