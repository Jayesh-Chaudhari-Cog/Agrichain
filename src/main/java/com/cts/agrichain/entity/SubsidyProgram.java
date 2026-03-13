package com.cts.agrichain.entity;

import com.cts.agrichain.enums.SubsidyStatus;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class SubsidyProgram {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int programID;

    @OneToMany(mappedBy = "subsidyProgram", cascade = CascadeType.ALL)
    private List<Disbursement> disbursements;

    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private double allottedBudget;
    private double consumedBudget;

    @Enumerated(EnumType.STRING)
    private SubsidyStatus subsidyStatus;

    public int getProgramID() {
        return programID;
    }
    public void setProgramID(int programID) {
        programID = programID;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getAllottedBudget() {
        return allottedBudget;
    }
    public void setAllottedBudget(double allottedBudget) {
        this.allottedBudget = allottedBudget;
    }

    public double getConsumedBudget() {
        return consumedBudget;
    }
    public void setConsumedBudget(double consumedBudget) {
        this.consumedBudget = consumedBudget;
    }

    public SubsidyStatus getSubsidyStatus() {
        return subsidyStatus;
    }
    public void setSubsidyStatus(SubsidyStatus subsidyStatus) {
        this.subsidyStatus = subsidyStatus;
    }

    public void addDisbursement(Disbursement disbursement) {
        disbursements.add(disbursement);
        disbursement.setSubsidyProgram(this);
    }
}
