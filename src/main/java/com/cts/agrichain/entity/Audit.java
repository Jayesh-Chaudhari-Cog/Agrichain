package com.cts.agrichain.entity;
import java.time.LocalDate;

public class Audit {
    private Long auditId;
    private Long officerId;
    private String scope;
    private String findings;
    private LocalDate date;
    private String status;
}
