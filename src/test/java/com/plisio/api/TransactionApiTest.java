/*
 * Plisio API
 * Plisio payment gateway API
 *
 * Contact: lead@plisio.net
 *
 */

package com.plisio.api;

import com.plisio.model.CommissionApiResponseDto;
import com.plisio.model.ErrorResponseDto;
import com.plisio.model.FeeApiResponseDto;
import com.plisio.model.FeePlanApiResponseDto;
import com.plisio.model.OperationApiResponseDto;
import com.plisio.model.OperationsApiResponseDto;
import com.plisio.model.WithdrawApiResponseDto;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for TransactionApi
 */
@Ignore
public class TransactionApiTest {

    private final TransactionApi api = new TransactionApi();

    /**
     * Estimate cryptocurrency fee and Plisio commission
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void operationsCommissionPsysCidGetTest() throws Exception {
        String psysCid = null;
        String addresses = null;
        String amounts = null;
        String type = null;
        String feePlan = null;
        CommissionApiResponseDto response = api.operationsCommissionPsysCidGet(psysCid, addresses, amounts, type, feePlan);

        // TODO: test validations
    }
    /**
     * Get Plisio fee plans
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void operationsFeePlanPsysCidGetTest() throws Exception {
        String psysCid = null;
        FeePlanApiResponseDto response = api.operationsFeePlanPsysCidGet(psysCid);

        // TODO: test validations
    }
    /**
     * Estimate fee
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void operationsFeePsysCidGetTest() throws Exception {
        String psysCid = null;
        String addresses = null;
        String amounts = null;
        String feePlan = null;
        FeeApiResponseDto response = api.operationsFeePsysCidGet(psysCid, addresses, amounts, feePlan);

        // TODO: test validations
    }
    /**
     * List of all user transactions
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void operationsGetTest() throws Exception {
        Integer page = null;
        Integer limit = null;
        String shopId = null;
        String type = null;
        String status = null;
        String currency = null;
        String search = null;
        OperationsApiResponseDto response = api.operationsGet(page, limit, shopId, type, status, currency, search);

        // TODO: test validations
    }
    /**
     * Transaction details
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void operationsIdGetTest() throws Exception {
        String id = null;
        OperationApiResponseDto response = api.operationsIdGet(id);

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
