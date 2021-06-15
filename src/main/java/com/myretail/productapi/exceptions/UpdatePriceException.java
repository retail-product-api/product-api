package com.myretail.productapi.exceptions;

/**
 * Custom exception that is thrown when a product price updation fails.
 *
 */
public class UpdatePriceException extends RuntimeException {
    public UpdatePriceException(String message) {
        super(message);
    }
}
