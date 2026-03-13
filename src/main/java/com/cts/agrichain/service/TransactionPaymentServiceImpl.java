package com.cts.agrichain.service;

import com.cts.agrichain.entity.Transaction;
import com.cts.agrichain.entity.Payment;
import com.cts.agrichain.enums.TransactionStatus;
import com.cts.agrichain.enums.PaymentStatus;
import com.cts.agrichain.exception.ResourceNotFoundException;
import com.cts.agrichain.dao.TransactionRepo;
import com.cts.agrichain.dao.PaymentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionPaymentServiceImpl implements TransactionPaymentService {

    private final TransactionRepo transactionRepo;
    private final PaymentRepo paymentRepo;

    public TransactionPaymentServiceImpl(TransactionRepo transactionRepo, PaymentRepo paymentRepo) {
        this.transactionRepo = transactionRepo;
        this.paymentRepo = paymentRepo;
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {
        transaction.setTransactionStatus(TransactionStatus.PENDING);
        return transactionRepo.save(transaction);
    }

    @Override
    public Transaction updateTransactionStatus(int transactionId, String status) {
        Transaction transaction = transactionRepo.findById(transactionId)
                .orElseThrow(() -> new ResourceNotFoundException("Transaction not found with ID: " + transactionId));
        transaction.setTransactionStatus(TransactionStatus.valueOf(status.toUpperCase()));
        return transactionRepo.save(transaction);
    }

    @Override
    public Payment recordPayment(Payment payment) {
        payment.setPaymentStatus(PaymentStatus.PENDING);
        return paymentRepo.save(payment);
    }

    @Override
    public Payment updatePaymentStatus(int paymentId, String status) {
        Payment payment = paymentRepo.findById(paymentId)
                .orElseThrow(() -> new ResourceNotFoundException("Payment not found with ID: " + paymentId));
        payment.setPaymentStatus(PaymentStatus.valueOf(status.toUpperCase()));
        return paymentRepo.save(payment);
    }

    @Override
    public List<Transaction> getTransactionsByStatus(String status) {
        return transactionRepo.findByTransactionStatus(status);
    }

    @Override
    public List<Payment> getPaymentsByStatus(String status) {
        return paymentRepo.findByPaymentStatus(status);
    }
}
