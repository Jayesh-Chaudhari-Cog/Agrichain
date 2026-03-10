package com.cts.agrichain.entity;

import com.cts.agrichain.enums.DisbursementStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Disbursement {

    @Id
    private int DisbursementID;
    private int FarmerID;
    private int ProgramID;
    private double disbursementAmount;
    private LocalDate disbursementDate;

    @Enumerated(EnumType.STRING)
    private DisbursementStatus disbursementStatus;

    public int getDisbursementID() {
        return DisbursementID;
    }
    public void setDisbursementID(int disbursementID) {
        DisbursementID = disbursementID;
    }

    public int getFarmerID() {
        return FarmerID;
    }
    public void setFarmerID(int farmerID) {
        FarmerID = farmerID;
    }

    public int getProgramID() {
        return ProgramID;
    }
    public void setProgramID(int programID) {
        ProgramID = programID;
    }

    public double getDisbursementAmount() {
        return disbursementAmount;
    }
    public void setDisbursementAmount(double disbursementAmount) {
        this.disbursementAmount = disbursementAmount;
    }

    public LocalDate getDisbursementDate() {
        return disbursementDate;
    }
    public void setDisbursementDate(LocalDate disbursementDate) {
        this.disbursementDate = disbursementDate;
    }

    public DisbursementStatus getDisbursementStatus() {
        return disbursementStatus;
    }
    public void setDisbursementStatus(DisbursementStatus disbursementStatus) {
        this.disbursementStatus = disbursementStatus;
    }
}
