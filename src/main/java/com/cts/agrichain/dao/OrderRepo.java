package com.cts.agrichain.dao;

import com.cts.agrichain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepo extends JpaRepository<Order, Integer> {
    List<Order> findByTraderId(int traderId);
    List<Order> findByListingId(int listingId);
    List<Order> findByOrderStatus(String orderStatus);
}
