package com.cts.agrichain.entity;
import com.cts.agrichain.enums.AuditScope;
import com.cts.agrichain.enums.AuditStatus;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "audit")

public class Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auditId;
    private Long officerId;

    @Enumerated(EnumType.STRING)
    private AuditScope scope;
    private String findings;

    private LocalDate date;
<<<<<<< HEAD
    private String status;
=======

    @Enumerated(EnumType.STRING)
    private AuditStatus status;
    public Long getAuditId() {
        return auditId;
    }

    public void setAuditId(Long auditId) {
        this.auditId = auditId;
    }

    public Long getOfficerId() {
        return officerId;
    }

    public void setOfficerId(Long officerId) {
        this.officerId = officerId;
    }

    public AuditScope getScope() {
        return scope;
    }

    public void setScope(AuditScope scope) {
        this.scope = scope;
    }

    public String getFindings() {
        return findings;
    }

    public void setFindings(String findings) {
        this.findings = findings;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public AuditStatus getStatus() {
        return status;
    }

    public void setStatus(AuditStatus status) {
        this.status = status;
    }
>>>>>>> kanishma
}




