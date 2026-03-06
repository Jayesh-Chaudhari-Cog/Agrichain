package com.cts.agrichain.exception;

public class PaymentProcessingException extends Exception {
    private String errorCode;

    public String getErrorCode() {
        return errorCode;
    }
}
