package com.system.parkinglot.constant.enums;

public enum ParkingAreaType {
    OPEN_PARKING_AREA("Open_Parking_Area"),
    MULTILEVEL_PARKING_AREA("Multilevel_Parking_Area");

    private final String description;

    ParkingAreaType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
