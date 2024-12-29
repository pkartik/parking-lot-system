package com.system.parkinglot.constant.enums;

public enum ParkingAreaType {
    OPEN_PARKING_AREA("Open_Parking_Area"),
    BUILDING_PARKING_AREA("Building_Parking_Area");

    private final String description;

    ParkingAreaType(String description) {
    this.description = description;

    
}

 public String getDescription(){
    return description;
 }

}
