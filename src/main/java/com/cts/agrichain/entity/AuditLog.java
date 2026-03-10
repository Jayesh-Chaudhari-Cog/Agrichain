package com.cts.agrichain.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.Instant;


@Entity

public class AuditLog {
    @Id
    private String auditId;
    private String userId;
    private String action;
    private String resource;
    private Instant timestamp;

    // Constructors, getters, setters
}
