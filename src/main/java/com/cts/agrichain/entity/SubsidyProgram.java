package com.cts.agrichain.entity;

import com.cts.agrichain.enums.OrderStatus;
import com.cts.agrichain.enums.SubsidyStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class SubsidyProgram {

    @Id
    private int ProgramID;
    private String Title;
    private String Description;
    private LocalDate StartDate;
    private LocalDate EndDate;
    private double allottedBudget;
    private double consumedBudget;

    @Enumerated(EnumType.STRING)
    private SubsidyStatus subsidyStatus;

    public int getProgramID() {
        return ProgramID;
    }
    public void setProgramID(int programID) {
        ProgramID = programID;
    }

    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }
    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }
    public void setEndDate(LocalDate endDate) {
        EndDate = endDate;
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
}
