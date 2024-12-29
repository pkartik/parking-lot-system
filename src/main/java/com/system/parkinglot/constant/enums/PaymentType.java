package com.system.parkinglot.constant.enums;

public enum PaymentType {

    ONLINE_PAYMENT("Online_Payment"),
    CASH_PAYMENT("Cash_Payment");

    private final String paymentType;

    PaymentType(String paymentType) {
        this.paymentType=paymentType;
    }

    public String getPaymentType() {
        return paymentType;
    }
}
