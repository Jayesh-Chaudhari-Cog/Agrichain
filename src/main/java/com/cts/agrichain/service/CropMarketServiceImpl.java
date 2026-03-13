package com.cts.agrichain.service;

import com.cts.agrichain.entity.CropListing;
import com.cts.agrichain.entity.Order;
import com.cts.agrichain.enums.CropListingStatus;
import com.cts.agrichain.enums.OrderStatus;
import com.cts.agrichain.exception.ResourceNotFoundException;
import com.cts.agrichain.dao.CropListingRepo;
import com.cts.agrichain.dao.OrderRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CropMarketServiceImpl implements CropMarketService {

    private final CropListingRepo cropListingRepo;
    private final OrderRepo orderRepo;

    public CropMarketServiceImpl(CropListingRepo cropListingRepo, OrderRepo orderRepo) {
        this.cropListingRepo = cropListingRepo;
        this.orderRepo = orderRepo;
    }

    @Override
    public CropListing createListing(CropListing listing) {
        listing.setStatus(CropListingStatus.PENDING);
        return cropListingRepo.save(listing);
    }

    @Override
    public CropListing validateListing(int listingId) {
        CropListing listing = cropListingRepo.findById(listingId)
                .orElseThrow(() -> new ResourceNotFoundException("Listing not found with ID: " + listingId));
        listing.setStatus(CropListingStatus.VALIDATED);
        return cropListingRepo.save(listing);
    }

    @Override
    public Order placeOrder(Order order) {
        order.setOrderStatus(OrderStatus.PENDING);
        return orderRepo.save(order);
    }

    @Override
    public Order updateOrderStatus(int orderId, String status) {
        Order order = orderRepo.findById(orderId)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found with ID: " + orderId));
        order.setOrderStatus(OrderStatus.valueOf(status.toUpperCase()));
        return orderRepo.save(order);
    }

    @Override
    public List<CropListing> getValidatedListings() {
        return cropListingRepo.findByStatus(CropListingStatus.VALIDATED.name());
    }

    @Override
    public List<Order> getOrdersByTrader(int traderId) {
        return orderRepo.findByTraderId(traderId);
    }
}
