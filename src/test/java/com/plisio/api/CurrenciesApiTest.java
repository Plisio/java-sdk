/*
 * Plisio API
 * Plisio payment gateway API
 *
 * Contact: lead@plisio.net
 *
 */

package com.plisio.api;

import com.plisio.model.CryptocurrencyApiResponseDto;
import com.plisio.model.ErrorResponseDto;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CurrenciesApi
 */
@Ignore
public class CurrenciesApiTest {

    private final CurrenciesApi api = new CurrenciesApi();

    /**
     * List of supported cryptocurrencies
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void currenciesFiatGetTest() throws Exception {
        String fiat = null;
        CryptocurrencyApiResponseDto response = api.currenciesFiatGet(fiat);

        // TODO: test validations
    }
}
