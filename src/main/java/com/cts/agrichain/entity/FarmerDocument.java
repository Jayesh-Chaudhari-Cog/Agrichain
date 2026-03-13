package com.cts.agrichain.entity;

import com.cts.agrichain.enums.DocType;
import com.cts.agrichain.enums.VerificationStatus;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "FarmerDocument")
public class FarmerDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate DocumentID
    private int documentId;

    // Many documents belong to one Farmer
    @ManyToOne
    @JoinColumn(name = "farmerId", nullable = false)
    private Farmer farmer;

    @Enumerated(EnumType.STRING)
    private DocType docType; // IDProof / LandRecord

    private String fileUri;

    private LocalDate uploadedDate; // when document was uploaded

    @Enumerated(EnumType.STRING)
    private VerificationStatus verificationStatus; // PENDING / VERIFIED / REJECTED

    // Getters and Setters
    public int getDocumentId() {
        return documentId;
    }
    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public Farmer getFarmer() {
        return farmer;
    }
    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
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

    public LocalDate getUploadedDate() {
        return uploadedDate;
    }
    public void setUploadedDate(LocalDate uploadedDate) {
        this.uploadedDate = uploadedDate;
    }

    public VerificationStatus getVerificationStatus() {
        return verificationStatus;
    }
    public void setVerificationStatus(VerificationStatus verificationStatus) {
        this.verificationStatus = verificationStatus;
    }
}
