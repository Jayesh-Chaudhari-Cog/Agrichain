package com.cts.agrichain.entity;
import java.time.Instant;

public class AuditLog {
    private String auditId;
    private String userId;    // can be null for unauth'd events
    private String action;    // e.g., AUTH_LOGIN_SUCCESS, USER_CREATE, DOC_UPLOAD
    private String resource;  // e.g., "User:123", "Farmer:456"
    private Instant timestamp;

    // Constructors, getters, setters
}
