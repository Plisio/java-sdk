/*
 * Plisio API
 * Plisio payment gateway API
 *
 * Contact: lead@plisio.net
 *
 */

package com.plisio.api;

import com.plisio.model.ErrorResponseDto;
import com.plisio.model.InvoiceDetailsApiResponseDto;
import com.plisio.model.InvoiceWhiteLabelResponseDto;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for InvoiceApi
 */
@Ignore
public class InvoiceApiTest {

    private final InvoiceApi api = new InvoiceApi();

    /**
     * Invoice details
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void invoicesEmailIdGetTest() throws Exception {
        String id = null;
        String email = null;
        InvoiceDetailsApiResponseDto response = api.invoicesEmailIdGet(id, email);

        // TODO: test validations
    }
    /**
     * Invoice details
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void invoicesIdGetTest() throws Exception {
        String id = null;
        InvoiceDetailsApiResponseDto response = api.invoicesIdGet(id);

        // TODO: test validations
    }
    /**
     * Create new invoice
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void invoicesNewGetTest() throws Exception {
        String currency = null;
        String orderName = null;
        String orderNumber = null;
        String amount = null;
        String sourceCurrency = null;
        String sourceAmount = null;
        String allowedPsysCids = null;
        String description = null;
        String callbackUrl = null;
        String email = null;
        String language = null;
        String plugin = null;
        String version = null;
        Boolean redirectToInvoice = null;
        String expireMin = null;
        InvoiceWhiteLabelResponseDto response = api.invoicesNewGet(currency, orderName, orderNumber, amount, sourceCurrency, sourceAmount, allowedPsysCids, description, callbackUrl, email, language, plugin, version, redirectToInvoice, expireMin);

        // TODO: test validations
    }
    /**
     * Invoice details
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void invoicesSwitchIdGetTest() throws Exception {
        String id = null;
        String psysCid = null;
        InvoiceDetailsApiResponseDto response = api.invoicesSwitchIdGet(id, psysCid);

        // TODO: test validations
    }
}
