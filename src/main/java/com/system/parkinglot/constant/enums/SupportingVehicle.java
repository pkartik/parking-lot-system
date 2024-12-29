package com.system.parkinglot.constant.enums;

public enum SupportingVehicle {
    TWO_WHEELER("Two_Wheeler"),
    THREE_WHEELER("Three_Wheeler"),
    FOUR_WHEELER("Four_Wheeler");

    private final String supportingVehicle;

    SupportingVehicle(String supportingVehicle) {
        this.supportingVehicle = supportingVehicle;
    }

    public String getSupportingVehicle() {
        return supportingVehicle;
    }

}
