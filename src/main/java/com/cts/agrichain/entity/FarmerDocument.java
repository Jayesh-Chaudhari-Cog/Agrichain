package com.cts.agrichain.entity;

import com.cts.agrichain.enums.DocType;
import com.cts.agrichain.enums.VerificationStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

import java.time.Instant;
import java.time.LocalTime;
@Entity
public class FarmerDocument {

    @Id
    private int farmerId;

    private int documentId;
    @Enumerated(EnumType.STRING)
    private DocType docType;
    private String fileUri;
    private LocalTime uploadedDate;
    @Enumerated(EnumType.STRING)
    private VerificationStatus verificationStatus;


}
