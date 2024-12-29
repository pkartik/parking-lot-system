package com.system.parkinglot.constant.enums;

public enum GateType {

    ENTRY_GATE("Entry_Gate"), EXIT_GATE("Exit_Gate");

    private final String gateType;

    GateType(String gateType) {
        this.gateType = gateType;
    }

    public String getGateType() {
        return gateType;
    }


}
