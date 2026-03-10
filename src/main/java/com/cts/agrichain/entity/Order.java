package com.cts.agrichain.entity;

import com.cts.agrichain.enums.OrderStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Order {

    @Id
    private int orderId;
    private int listingId;
    private int traderId;
    private int quantity;
    private String orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getListingId() {
        return listingId;
    }
    public void setListingId(int listingId) {
        this.listingId = listingId;
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

    public String getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
