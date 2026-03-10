package com.cts.agrichain.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditLog extends JpaRepository<AuditLog,String> {
}
