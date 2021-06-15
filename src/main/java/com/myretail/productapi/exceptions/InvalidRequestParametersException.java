package com.myretail.productapi.exceptions;

/**
 * Custom exception that is thrown when the request parameters are invalid.
 *
 */
public class InvalidRequestParametersException extends RuntimeException {
    public InvalidRequestParametersException(String message) {
        super(message);
    }
}
