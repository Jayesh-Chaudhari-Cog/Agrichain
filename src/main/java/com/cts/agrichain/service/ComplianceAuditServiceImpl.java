package com.cts.agrichain.service;
import com.cts.agrichain.entity.Audit;
import com.cts.agrichain.entity.Compliance;
import com.cts.agrichain.dao.AuditRepo;
import com.cts.agrichain.dao.ComplianceRepo;
import com.cts.agrichain.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ComplianceAuditServiceImpl implements ComplianceAuditService {

    private final AuditRepo auditRepo;
    private final ComplianceRepo complianceRepo;

    public ComplianceAuditServiceImpl(AuditRepo auditRepo, ComplianceRepo complianceRepo) {
        this.auditRepo = auditRepo;
        this.complianceRepo = complianceRepo;
    }
    @Override
    public Audit createAudit(Audit audit) {
        return auditRepo.save(audit);
    }
    @Override
    public Compliance addComplianceToAudit(Long auditId, Compliance compliance) {
        Audit audit = auditRepo.findById(auditId)
                .orElseThrow(() -> new ResourceNotFoundException("Audit not found with ID: " + auditId));
        compliance.setAudit(audit); // link compliance to audit
        return complianceRepo.save(compliance);
    }

    @Override
    public List<Compliance> getCompliancesByAudit(Long auditId) {
        Audit audit = auditRepo.findById(auditId)
                .orElseThrow(() -> new ResourceNotFoundException("Audit not found with ID: " + auditId));
        return audit.getCompliances();
    }
    @Override
    public List<Audit> getAllAudits() {
        return auditRepo.findAll();
    }
}
