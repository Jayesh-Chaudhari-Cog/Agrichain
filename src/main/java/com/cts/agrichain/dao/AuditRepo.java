package com.cts.agrichain.dao;

import com.cts.agrichain.entity.Audit;
import com.cts.agrichain.enums.AuditScope;
import com.cts.agrichain.enums.AuditStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AuditRepo extends JpaRepository<Audit,Long> {
    List<Audit> findByOfficerId(Long officerId);
    List<Audit> findByScope(AuditScope scope);
    List<Audit> findByStatus(AuditStatus status);


}
