package com.cts.agrichain.entity;

public class CropListing {
    private String listingId;
    private String farmerId;
    private String cropType;
    private int quantity;
    private double price;
    private String location;
    private String status;   // PENDING, VALIDATED, REJECTED
}
