package com.system.parkinglot.model.entities;

import com.system.parkinglot.constant.enums.ParkingAreaType;

import java.util.List;

public class ParkingLot {
    private String parkingLotId;
    private String parkingLotName;
    private ParkingAreaType parkingAreaType;
    private String parkingLotAddress;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;




}
