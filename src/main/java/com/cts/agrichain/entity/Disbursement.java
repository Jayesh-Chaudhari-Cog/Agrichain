package com.cts.agrichain.entity;

import com.cts.agrichain.enums.DisbursementStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Disbursement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DisbursementID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "programId")
    private SubsidyProgram subsidyProgram;

    @ManyToOne
    @JoinColumn(name = "farmerId")
    private Farmer farmer;



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

    public Farmer getFarmer() {
        return farmer;
    }
    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

    public SubsidyProgram getSubsidyProgram() {
        return subsidyProgram;
    }
    public void setSubsidyProgram(SubsidyProgram subsidyProgram) {
        this.subsidyProgram = subsidyProgram;
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
