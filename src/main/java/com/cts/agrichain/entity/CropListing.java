package com.cts.agrichain.entity;

import com.cts.agrichain.enums.CropListingStatus;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "CropListing")
public class CropListing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate primary key
    private int listingId;

    @ManyToOne
    @JoinColumn(name = "farmerId", nullable = false)
    private Farmer farmer;

    private String cropType;
    private int quantity;
    private double price;
    private String location;

    @Enumerated(EnumType.STRING)
    private CropListingStatus status;   // PENDING, VALIDATED, REJECTED

    // Relationship: One CropListing can have many Orders
    @OneToMany(mappedBy = "cropListing", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders;

    // Getters and Setters
    public int getListingId() {
        return listingId;
    }
    public void setListingId(int listingId) {
        this.listingId = listingId;
    }

    public Farmer getFarmer() {
        return farmer;
    }
    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }
    public String getCropType() {
        return cropType;
    }
    public void setCropType(String cropType) {
        this.cropType = cropType;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public CropListingStatus getStatus() {
        return status;
    }
    public void setStatus(CropListingStatus status) {
        this.status = status;
    }

    public List<Order> getOrders() {
        return orders;
    }
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
