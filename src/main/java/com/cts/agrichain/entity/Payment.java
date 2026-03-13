package com.cts.agrichain.entity;

import com.cts.agrichain.enums.PaymentStatus;
import com.cts.agrichain.enums.PaymentType;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Payment {
    @Id
    private int paymentID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TransactionId")
    private Transaction transaction;

    @Enumerated(EnumType.STRING)
    private PaymentType method;
    private LocalDate paymentDate;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    public int getPaymentID() {
        return paymentID;
    }
    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public Transaction getTransaction() {
        return transaction;
    }
    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
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