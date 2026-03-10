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

    public int getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(int farmerId) {
        this.farmerId = farmerId;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public DocType getDocType() {
        return docType;
    }

    public void setDocType(DocType docType) {
        this.docType = docType;
    }

    public String getFileUri() {
        return fileUri;
    }

    public void setFileUri(String fileUri) {
        this.fileUri = fileUri;
    }

    public LocalTime getUploadedDate() {
        return uploadedDate;
    }

    public void setUploadedDate(LocalTime uploadedDate) {
        this.uploadedDate = uploadedDate;
    }

    public VerificationStatus getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(VerificationStatus verificationStatus) {
        this.verificationStatus = verificationStatus;
    }
}
