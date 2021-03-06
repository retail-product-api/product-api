package com.myretail.productapi.service.productservices;

import com.myretail.productapi.exceptions.APIRequestException;

/**
 * Service for fetching names of products.
 *
 */
public interface ProductRestClientService {
    /**
     * Method to get the name of the product given the id.
     *
     * @param productId product id
     * @return the name of the product.
     */
    String getProductNameFromAPI(String productId) throws APIRequestException;
}
