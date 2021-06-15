package com.myretail.productapi.model;

/**
 * Currency enum representing the currency type for a product price.
 *
 */
public enum Currency {

    EUR("EUR"),
    USD("USD");

    private final String code;

    /**
     * Constructor.
     * @param code enum currency code.
     */
    Currency(String code) {
        this.code = code;
    }

    /**
     * Getter method that returns the currency code.
     * @return enum currency code.
     */
    public String getCode() {
        return code;
    }

}

