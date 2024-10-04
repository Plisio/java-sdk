/*
 * Plisio API
 * Plisio payment gateway API
 *
 * Contact: lead@plisio.net
 *
 */

package com.plisio.api;

import com.plisio.invoker.ApiCallback;
import com.plisio.invoker.ApiClient;
import com.plisio.invoker.ApiException;
import com.plisio.invoker.ApiResponse;
import com.plisio.invoker.Configuration;
import com.plisio.invoker.Pair;
import com.plisio.invoker.ProgressRequestBody;
import com.plisio.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.plisio.model.ErrorResponseDto;
import com.plisio.model.WithdrawApiResponseDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WithdrawApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public WithdrawApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WithdrawApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setHeadersOverrides(Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * Build call for operationsWithdrawGet
     * @param psysCid one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) (required)
     * @param to hash or multiple comma separated hashes pooled for the &#x27;mass_cash_out&#x27; (required)
     * @param amount any comma separated float values for the “ mass_cash_out” in the order that hashes are in “to” parameter (required)
     * @param type &#x27;cash_out&#x27; or &#x27;mass_cash_out&#x27; to send to single or multiple comma separated hashes (required)
     * @param feePlan  normal or priority (https://plisio.net/documentation/endpoints/fee-plan) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call operationsWithdrawGetCall(String psysCid, String to, String amount, String type, String feePlan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/operations/withdraw";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (psysCid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("psys_cid", psysCid));
        if (to != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("to", to));
        if (amount != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("amount", amount));
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (feePlan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("feePlan", feePlan));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call operationsWithdrawGetValidateBeforeCall(String psysCid, String to, String amount, String type, String feePlan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'psysCid' is set
        if (psysCid == null) {
            throw new ApiException("Missing the required parameter 'psysCid' when calling operationsWithdrawGet(Async)");
        }
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new ApiException("Missing the required parameter 'to' when calling operationsWithdrawGet(Async)");
        }
        // verify the required parameter 'amount' is set
        if (amount == null) {
            throw new ApiException("Missing the required parameter 'amount' when calling operationsWithdrawGet(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling operationsWithdrawGet(Async)");
        }
        
        com.squareup.okhttp.Call call = operationsWithdrawGetCall(psysCid, to, amount, type, feePlan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create new invoice
     * 
     * @param psysCid one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) (required)
     * @param to hash or multiple comma separated hashes pooled for the &#x27;mass_cash_out&#x27; (required)
     * @param amount any comma separated float values for the “ mass_cash_out” in the order that hashes are in “to” parameter (required)
     * @param type &#x27;cash_out&#x27; or &#x27;mass_cash_out&#x27; to send to single or multiple comma separated hashes (required)
     * @param feePlan  normal or priority (https://plisio.net/documentation/endpoints/fee-plan) (optional)
     * @return WithdrawApiResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WithdrawApiResponseDto operationsWithdrawGet(String psysCid, String to, String amount, String type, String feePlan) throws ApiException {
        ApiResponse<WithdrawApiResponseDto> resp = operationsWithdrawGetWithHttpInfo(psysCid, to, amount, type, feePlan);
        return resp.getData();
    }

    /**
     * Create new invoice
     * 
     * @param psysCid one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) (required)
     * @param to hash or multiple comma separated hashes pooled for the &#x27;mass_cash_out&#x27; (required)
     * @param amount any comma separated float values for the “ mass_cash_out” in the order that hashes are in “to” parameter (required)
     * @param type &#x27;cash_out&#x27; or &#x27;mass_cash_out&#x27; to send to single or multiple comma separated hashes (required)
     * @param feePlan  normal or priority (https://plisio.net/documentation/endpoints/fee-plan) (optional)
     * @return ApiResponse&lt;WithdrawApiResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WithdrawApiResponseDto> operationsWithdrawGetWithHttpInfo(String psysCid, String to, String amount, String type, String feePlan) throws ApiException {
        com.squareup.okhttp.Call call = operationsWithdrawGetValidateBeforeCall(psysCid, to, amount, type, feePlan, null, null);
        Type localVarReturnType = new TypeToken<WithdrawApiResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create new invoice (asynchronously)
     * 
     * @param psysCid one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) (required)
     * @param to hash or multiple comma separated hashes pooled for the &#x27;mass_cash_out&#x27; (required)
     * @param amount any comma separated float values for the “ mass_cash_out” in the order that hashes are in “to” parameter (required)
     * @param type &#x27;cash_out&#x27; or &#x27;mass_cash_out&#x27; to send to single or multiple comma separated hashes (required)
     * @param feePlan  normal or priority (https://plisio.net/documentation/endpoints/fee-plan) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call operationsWithdrawGetAsync(String psysCid, String to, String amount, String type, String feePlan, final ApiCallback<WithdrawApiResponseDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = operationsWithdrawGetValidateBeforeCall(psysCid, to, amount, type, feePlan, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WithdrawApiResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
