package com.cts.agrichain.entity;

import com.cts.agrichain.enums.ComplianceResult;
import com.cts.agrichain.enums.ComplianceType;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "compliance")


public class Compliance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long complianceId;
    private long entityId;
    @Enumerated(EnumType.STRING)
    private ComplianceType type;
    @Enumerated(EnumType.STRING)

    private ComplianceResult result;
    private LocalDate date;
    private String notes;


    public long getComplianceId() {
        return complianceId;
    }

    public void setComplianceId(long complianceId) {
        this.complianceId = complianceId;
    }

    public long getEntityId() {
        return entityId;
    }

    public void setEntityId(long entityId) {
        this.entityId = entityId;
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











