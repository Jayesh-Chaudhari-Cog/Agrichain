package com.cts.agrichain.entity;

import com.cts.agrichain.enums.OrderStatus;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Orders") // avoid reserved keyword "Order"
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-generate primary key
    private int orderId;

    // Many orders can belong to one CropListing
    @ManyToOne
    @JoinColumn(name = "listingId", nullable = false)
    private CropListing cropListing;

    private int traderId;
    private int quantity;
    private LocalDate orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public CropListing getCropListing() {
        return cropListing;
    }
    public void setCropListing(CropListing cropListing) {
        this.cropListing = cropListing;
    }

    public int getTraderId() {
        return traderId;
    }
    public void setTraderId(int traderId) {
        this.traderId = traderId;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
