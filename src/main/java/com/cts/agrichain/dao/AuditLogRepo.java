package com.cts.agrichain.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditLogRepo extends JpaRepository<AuditLogRepo,String> {
}
