package com.system.parkinglot.model.entities;

import com.system.parkinglot.constant.enums.PaymentStatus;
import com.system.parkinglot.constant.enums.PaymentType;

public class Payment {
    private String paymentId;
    private PaymentType paymentType;
    private PaymentStatus paymentStatus;
    private String referenceId;
    private Provider provider;
}
