package com.system.parkinglot.constant.enums;

public enum SupportingVehicle {
    TWO_WHEELER("Two Wheeler"),
    FOUR_WHEELER("Four Wheeler");

    private final String supportingVehicle;

    SupportingVehicle(String supportingVehicle) {
        this.supportingVehicle = supportingVehicle;
    }

    public String getSupportingVehicle(){
        return supportingVehicle;
    }

}
