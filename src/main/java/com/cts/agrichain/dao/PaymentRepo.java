package com.cts.agrichain.dao;

import com.cts.agrichain.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PaymentRepo extends JpaRepository<Payment, Integer> {
    List<Payment> findByPaymentStatus(String status);
    List<Payment> findByMethod(String method);
}
