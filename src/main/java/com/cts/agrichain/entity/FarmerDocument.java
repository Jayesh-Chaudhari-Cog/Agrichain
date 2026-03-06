package com.cts.agrichain.entity;

import java.time.Instant;

public class FarmerDocument {
    public enum DocType { ID_PROOF, LAND_RECORD }
    public enum VerificationStatus { PENDING, APPROVED, REJECTED }

    private String documentId;
    private String farmerId;
    private DocType docType;
    private String fileUri;
    private Instant uploadedDate;
    private VerificationStatus verificationStatus;

    // Constructors, getters, setters
}
