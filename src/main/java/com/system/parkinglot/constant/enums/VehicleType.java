package com.system.parkinglot.constant.enums;

public enum VehicleType {

    TWO_WHEELER_VEHICLE_TYPE("Two_Wheeler_Vehicle_Type"),
    THREE_WHEELER_VEHICLE_TYPE("Three_Wheeler_Vehicle_Type"),
    FOUR_WHEELER_VEHICLE_TYPE("Four_Wheeler_Vehicle_Type");

    private final String vehicleType;

    VehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

}
