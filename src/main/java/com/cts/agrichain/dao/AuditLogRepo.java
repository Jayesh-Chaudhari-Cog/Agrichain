package com.cts.agrichain.dao;

import com.cts.agrichain.entity.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AuditLogRepo extends JpaRepository<AuditLog,Integer> {
    List<AuditLog> findByUserId(int userId);
    List<AuditLog> findByAction(String action);
    List<AuditLog> findByResource(String resource);

}
