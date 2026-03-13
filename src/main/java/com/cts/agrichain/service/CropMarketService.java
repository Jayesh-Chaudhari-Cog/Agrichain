package com.cts.agrichain.service;

import com.cts.agrichain.entity.CropListing;
import com.cts.agrichain.entity.Order;
import java.util.List;

public interface CropMarketService {
    CropListing createListing(CropListing listing);
    CropListing validateListing(int listingId);
    Order placeOrder(Order order);
    Order updateOrderStatus(int orderId, String status);
    List<CropListing> getValidatedListings();
    List<Order> getOrdersByTrader(int traderId);
}
