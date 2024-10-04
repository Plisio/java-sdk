/*
 * Plisio API
 * Plisio payment gateway API
 *
 * Contact: lead@plisio.net
 *
 */

package com.plisio.api;

import com.plisio.model.BalanceApiResponseDto;
import com.plisio.model.ErrorResponseDto;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for BalanceApi
 */
@Ignore
public class BalanceApiTest {

    private final BalanceApi api = new BalanceApi();

    /**
     * Get cryptocurrency balance
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void balancesPsysCidGetTest() throws Exception {
        String psysCid = null;
        BalanceApiResponseDto response = api.balancesPsysCidGet(psysCid);

        // TODO: test validations
    }
}
