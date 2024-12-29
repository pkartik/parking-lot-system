package com.system.parkinglot.constant.enums;

public enum ParkingSlotStatus {

    PARKING_SLOT_AVAILABLE("Parking_Slot_Available"),
    PARKING_SLOT_UNAVAILABLE("Parking_slot_Unavailable");

    private final String parkingSlotStatus;

    ParkingSlotStatus(String parkingSlotStatus){
        this.parkingSlotStatus=parkingSlotStatus;
    }

    public String getParkingSlotStatus(){
        return parkingSlotStatus;
    }
    
}
