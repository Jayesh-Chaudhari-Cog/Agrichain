package com.cts.agrichain.entity;
import com.cts.agrichain.enums.AuditScope;
import com.cts.agrichain.enums.AuditStatus;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

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


    @Enumerated(EnumType.STRING)
    private AuditStatus status;

    @OneToMany(mappedBy = "audit", cascade = CascadeType.ALL)
    private List<Compliance> compliances;

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
    public List<Compliance> getCompliances() {
        return compliances;
    }

    public void setCompliances(List<Compliance> compliances) {
        this.compliances = compliances;
    }

    public void addCompliance(Compliance compliance) {
        compliances.add(compliance);
        compliance.setAudit(this);
    }
}




