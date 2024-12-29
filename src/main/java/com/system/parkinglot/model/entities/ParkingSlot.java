package com.system.parkinglot.model.entities;

import com.system.parkinglot.constant.enums.ParkingSlotStatus;
import com.system.parkinglot.constant.enums.SupportingVehicle;

public class ParkingSlot {

    private String parkingSlotId;
    private String parkingSlotNumber;
    private Vehicle vehicle;
    private ParkingSlotStatus parkingSlotStatus;
    private SupportingVehicle supportingVehicle;

}
