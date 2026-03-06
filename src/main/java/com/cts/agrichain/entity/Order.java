package com.cts.agrichain.entity;

public class Order {
    private String orderId;
    private String listingId;
    private String traderId;
    private int quantity;
    private String date;
    private String status;   // PENDING, CONFIRMED, COMPLETED, CANCELLED
}
