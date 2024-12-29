package com.system.parkinglot.constant.enums;

public enum PaymentStatus {

    PAYMENT_SUCCESSFULLY_COMPLETED("Payment_Successfully_Completed"),
    PAYMENT_PARTIALLY_COMPLETED("Payment_Partially_Completed"),
    PAYMENT_PENDING("Payment_Pending"),
    PAYMENT_REJECTED("Payment_Rejected"),
    PAYMENT_FAILED("Payment_Failed");

    private final String paymentStatus;

    PaymentStatus(String paymentStatus) {
        this.paymentStatus=paymentStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }
}
