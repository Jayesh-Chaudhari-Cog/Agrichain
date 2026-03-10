package com.cts.agrichain.entity;

import java.time.LocalDate;

import com.cts.agrichain.enums.ComplianceResult;
import com.cts.agrichain.enums.ComplianceType;
import jakarta.persistence.*;

@Entity
@Table(name = "ComplianceRecord")
public class ComplianceRecord {

    @Id
    private int complianceID;

    private int entityID;

    @Enumerated(EnumType.STRING)
    private ComplianceType type;

    @Enumerated(EnumType.STRING)
    private ComplianceResult result;

    private LocalDate date;
    private String notes;
}
