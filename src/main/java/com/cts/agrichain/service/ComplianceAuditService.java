package com.cts.agrichain.service;

import com.cts.agrichain.entity.Audit;
import com.cts.agrichain.entity.Compliance;

import java.util.List;

public interface ComplianceAuditService {
    Audit createAudit(Audit audit);
    Compliance addComplianceToAudit(Long auditId, Compliance compliance);
    List<Compliance> getCompliancesByAudit(Long auditId);
    List<Audit> getAllAudits();
}
