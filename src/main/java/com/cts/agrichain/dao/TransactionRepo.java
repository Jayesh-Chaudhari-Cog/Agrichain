package com.cts.agrichain.dao;

import com.cts.agrichain.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TransactionRepo extends JpaRepository<Transaction, Integer> {
    List<Transaction> findByTransactionStatus(String status);
    List<Transaction> findByOrder_OrderId(int orderId);
}
