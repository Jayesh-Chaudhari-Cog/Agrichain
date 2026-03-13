package com.cts.agrichain.service;

import com.cts.agrichain.entity.Transaction;
import com.cts.agrichain.entity.Payment;
import java.util.List;

public interface TransactionPaymentService {
    Transaction createTransaction(Transaction transaction);
    Transaction updateTransactionStatus(int transactionId, String status);
    Payment recordPayment(Payment payment);
    Payment updatePaymentStatus(int paymentId, String status);
    List<Transaction> getTransactionsByStatus(String status);
    List<Payment> getPaymentsByStatus(String status);
}
