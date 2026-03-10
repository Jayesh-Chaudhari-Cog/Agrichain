package com.cts.agrichain.entity;

import com.cts.agrichain.enums.CropListingStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "CropListing")
public class CropListing {

    @Id
    private int listingId;

    private int farmerId;
    private String cropType;
    private int quantity;
    private double price;
    private String location;

    public CropListingStatus getStatus() {
        return status;
    }

    public void setStatus(CropListingStatus status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCropType() {
        return cropType;
    }

    public void setCropType(String cropType) {
        this.cropType = cropType;
    }

    public int getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(int farmerId) {
        this.farmerId = farmerId;
    }

    public int getListingId() {
        return listingId;
    }

    public void setListingId(int listingId) {
        this.listingId = listingId;
    }

    @Enumerated(EnumType.STRING)
    private CropListingStatus status;   // PENDING, VALIDATED, REJECTED

}