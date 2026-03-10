package com.cts.agrichain.entity;

import com.cts.agrichain.enums.TransactionStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Transaction {

    @Id
    private int transactionID;
    private int orderID;
    private double transactionAmount;
    private LocalDate transactionDate;
    private TransactionStatus transactionStatus;

    public int getTransactionID() {
        return transactionID;
    }
    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public int getOrderID() {
        return orderID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }
    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }
    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}
