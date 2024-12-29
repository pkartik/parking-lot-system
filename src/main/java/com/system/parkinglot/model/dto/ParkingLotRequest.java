package com.system.parkinglot.model.dto;
import java.util.List;
import com.system.parkinglot.constant.enums.ParkingAreaType;


public class ParkingLotRequest {
    String parkingLotName;
    ParkingAreaType parkingAreaType;
    String parkingLotAddress;
    List<ParkingFloorDTO> parkingFloors;
    List<GateDTO> gates;
    
}
