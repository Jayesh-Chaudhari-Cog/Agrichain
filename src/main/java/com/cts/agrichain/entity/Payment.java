package com.cts.agrichain.entity;

import com.cts.agrichain.enums.PaymentStatus;
import com.cts.agrichain.enums.PaymentType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Payment {
    @Id
    private int paymentID;
    private int transactionID;
    private PaymentType method;
    private LocalDate paymentDate;
    private PaymentStatus paymentStatus;

    public int getPaymentID() {
        return paymentID;
    }
    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getTransactionID() {
        return transactionID;
    }
    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public PaymentType getMethod() {
        return method;
    }
    public void setMethod(PaymentType method) {
        this.method = method;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}