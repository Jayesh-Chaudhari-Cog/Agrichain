package com.cts.agrichain.entity;

import com.cts.agrichain.enums.FarmerStatus;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Farmer")
public class Farmer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate FarmerID
    private int farmerId;

    private String name;

    private LocalDate dob;      // Date of Birth
    private String gender;
    private String address;
    private String contactInfo; // phone/email
    private String landDetails;

    @Enumerated(EnumType.STRING)
    private FarmerStatus status; // ACTIVE, INACTIVE, PENDING

    // One Farmer can have many CropListings
    @OneToMany(mappedBy = "farmer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CropListing> cropListings;

    // One Farmer can have many Documents
    @OneToMany(mappedBy = "farmer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FarmerDocument> documents;

    @OneToMany(mappedBy = "farmer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Disbursement> disbursements;


    public List<Disbursement> getDisbursements() {
        return disbursements;
    }

    public void setDisbursements(List<Disbursement> disbursements) {
        this.disbursements = disbursements;
    }

    // Getters and Setters
    public int getFarmerId() {
        return farmerId;
    }
    public void setFarmerId(int farmerId) {
        this.farmerId = farmerId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getLandDetails() {
        return landDetails;
    }
    public void setLandDetails(String landDetails) {
        this.landDetails = landDetails;
    }

    public FarmerStatus getStatus() {
        return status;
    }
    public void setStatus(FarmerStatus status) {
        this.status = status;
    }

    public List<CropListing> getCropListings() {
        return cropListings;
    }
    public void setCropListings(List<CropListing> cropListings) {
        this.cropListings = cropListings;
    }

    public List<FarmerDocument> getDocuments() {
        return documents;
    }
    public void setDocuments(List<FarmerDocument> documents) {
        this.documents = documents;
    }
}
