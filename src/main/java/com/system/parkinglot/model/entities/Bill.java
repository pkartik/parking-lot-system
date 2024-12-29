package com.system.parkinglot.model.entities;

import com.system.parkinglot.constant.enums.PaymentStatus;
import com.system.parkinglot.constant.enums.PaymentType;

import java.sql.Time;

public class Bill {

    private String billId;
    private long billAmount;
    private Time exitTime;
    private Gate gate;
    private Ticket ticket;

    private Operator operator;
    private Payment payment;


}
