package com.cts.agrichain.exception;

/**
 * Thrown when a requested resource is not found. HTTP Mapping: 404 NOT FOUND
 */
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

