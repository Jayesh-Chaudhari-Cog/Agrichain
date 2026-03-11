package com.cts.agrichain.entity;

import com.cts.agrichain.enums.FarmerStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Farmer {
    @Id
    private String farmerId;
    private int dob;
    private String gender;
    private String address;
    private int contactInfo;
    private String landDetails;
    @Enumerated(EnumType.STRING)
    private FarmerStatus status;

    public String getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(String farmerId) {
        this.farmerId = farmerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
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

    public int getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(int contactInfo) {
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
}
