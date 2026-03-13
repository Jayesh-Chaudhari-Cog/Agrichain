package com.cts.agrichain.entity;

import java.time.LocalDate;

import com.cts.agrichain.enums.ComplianceResult;
import com.cts.agrichain.enums.ComplianceType;
import jakarta.persistence.*;

@Entity
@Table(name = "ComplianceRecord")
public class ComplianceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int complianceID;

    private int entityID;

    @Enumerated(EnumType.STRING)
    private ComplianceType type;

    @Enumerated(EnumType.STRING)
    private ComplianceResult result;

    private LocalDate date;
    private String notes;

    public int getComplianceID() {
        return complianceID;
    }

    public void setComplianceID(int complianceID) {
        this.complianceID = complianceID;
    }

    public int getEntityID() {
        return entityID;
    }

    public void setEntityID(int entityID) {
        this.entityID = entityID;
    }

    public ComplianceType getType() {
        return type;
    }

    public void setType(ComplianceType type) {
        this.type = type;
    }

    public ComplianceResult getResult() {
        return result;
    }

    public void setResult(ComplianceResult result) {
        this.result = result;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
