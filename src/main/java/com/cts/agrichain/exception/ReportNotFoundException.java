package com.cts.agrichain.exception;

/**
 * Thrown when a requested resource is not found. HTTP Mapping: 404 NOT FOUND
 */
public class ReportNotFoundException extends RuntimeException {
    public ReportNotFoundException(String message) {
        super(message);
    }
    public ReportNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

