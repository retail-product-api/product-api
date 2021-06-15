package com.myretail.productapi.exceptions;

/**
 * Custom exception that is thrown when the API request to fetch the product name fails.
 *
 */
public class APIRequestException extends RuntimeException {
    public APIRequestException(String message, Exception e) {
        super(message);
    }
}
