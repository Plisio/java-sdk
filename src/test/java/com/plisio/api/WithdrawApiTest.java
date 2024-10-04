/*
 * Plisio API
 * Plisio payment gateway API
 *
 * Contact: lead@plisio.net
 *
 */

package com.plisio.api;

import com.plisio.model.ErrorResponseDto;
import com.plisio.model.WithdrawApiResponseDto;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for WithdrawApi
 */
@Ignore
public class WithdrawApiTest {

    private final WithdrawApi api = new WithdrawApi();

    /**
     * Create new invoice
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void operationsWithdrawGetTest() throws Exception {
        String psysCid = null;
        String to = null;
        String amount = null;
        String type = null;
        String feePlan = null;
        WithdrawApiResponseDto response = api.operationsWithdrawGet(psysCid, to, amount, type, feePlan);

        // TODO: test validations
    }
}
