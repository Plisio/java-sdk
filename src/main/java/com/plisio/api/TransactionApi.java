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


import com.plisio.model.CommissionApiResponseDto;
import com.plisio.model.ErrorResponseDto;
import com.plisio.model.FeeApiResponseDto;
import com.plisio.model.FeePlanApiResponseDto;
import com.plisio.model.OperationApiResponseDto;
import com.plisio.model.OperationsApiResponseDto;
import com.plisio.model.WithdrawApiResponseDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public TransactionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionApi(ApiClient apiClient) {
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
     * Build call for operationsCommissionPsysCidGet
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @param addresses wallet address or comma separated addresses when estimating fee for mass withdrawal (required)
     * @param amounts amount or comma separated amount that will be send in case of mass withdraw (required)
     * @param type operation type (required)
     * @param feePlan normal or priority (https://plisio.net/documentation/endpoints/fee-plans) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call operationsCommissionPsysCidGetCall(String psysCid, String addresses, String amounts, String type, String feePlan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/operations/commission/{psys_cid}"
            .replaceAll("\\{" + "psys_cid" + "\\}", apiClient.escapeString(psysCid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (addresses != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("addresses", addresses));
        if (amounts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("amounts", amounts));
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
    private com.squareup.okhttp.Call operationsCommissionPsysCidGetValidateBeforeCall(String psysCid, String addresses, String amounts, String type, String feePlan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'psysCid' is set
        if (psysCid == null) {
            throw new ApiException("Missing the required parameter 'psysCid' when calling operationsCommissionPsysCidGet(Async)");
        }
        // verify the required parameter 'addresses' is set
        if (addresses == null) {
            throw new ApiException("Missing the required parameter 'addresses' when calling operationsCommissionPsysCidGet(Async)");
        }
        // verify the required parameter 'amounts' is set
        if (amounts == null) {
            throw new ApiException("Missing the required parameter 'amounts' when calling operationsCommissionPsysCidGet(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling operationsCommissionPsysCidGet(Async)");
        }
        
        com.squareup.okhttp.Call call = operationsCommissionPsysCidGetCall(psysCid, addresses, amounts, type, feePlan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Estimate cryptocurrency fee and Plisio commission
     * 
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @param addresses wallet address or comma separated addresses when estimating fee for mass withdrawal (required)
     * @param amounts amount or comma separated amount that will be send in case of mass withdraw (required)
     * @param type operation type (required)
     * @param feePlan normal or priority (https://plisio.net/documentation/endpoints/fee-plans) (optional)
     * @return CommissionApiResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommissionApiResponseDto operationsCommissionPsysCidGet(String psysCid, String addresses, String amounts, String type, String feePlan) throws ApiException {
        ApiResponse<CommissionApiResponseDto> resp = operationsCommissionPsysCidGetWithHttpInfo(psysCid, addresses, amounts, type, feePlan);
        return resp.getData();
    }

    /**
     * Estimate cryptocurrency fee and Plisio commission
     * 
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @param addresses wallet address or comma separated addresses when estimating fee for mass withdrawal (required)
     * @param amounts amount or comma separated amount that will be send in case of mass withdraw (required)
     * @param type operation type (required)
     * @param feePlan normal or priority (https://plisio.net/documentation/endpoints/fee-plans) (optional)
     * @return ApiResponse&lt;CommissionApiResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommissionApiResponseDto> operationsCommissionPsysCidGetWithHttpInfo(String psysCid, String addresses, String amounts, String type, String feePlan) throws ApiException {
        com.squareup.okhttp.Call call = operationsCommissionPsysCidGetValidateBeforeCall(psysCid, addresses, amounts, type, feePlan, null, null);
        Type localVarReturnType = new TypeToken<CommissionApiResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Estimate cryptocurrency fee and Plisio commission (asynchronously)
     * 
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @param addresses wallet address or comma separated addresses when estimating fee for mass withdrawal (required)
     * @param amounts amount or comma separated amount that will be send in case of mass withdraw (required)
     * @param type operation type (required)
     * @param feePlan normal or priority (https://plisio.net/documentation/endpoints/fee-plans) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call operationsCommissionPsysCidGetAsync(String psysCid, String addresses, String amounts, String type, String feePlan, final ApiCallback<CommissionApiResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = operationsCommissionPsysCidGetValidateBeforeCall(psysCid, addresses, amounts, type, feePlan, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommissionApiResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for operationsFeePlanPsysCidGet
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call operationsFeePlanPsysCidGetCall(String psysCid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/operations/fee-plan/{psys_cid}"
            .replaceAll("\\{" + "psys_cid" + "\\}", apiClient.escapeString(psysCid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call operationsFeePlanPsysCidGetValidateBeforeCall(String psysCid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'psysCid' is set
        if (psysCid == null) {
            throw new ApiException("Missing the required parameter 'psysCid' when calling operationsFeePlanPsysCidGet(Async)");
        }
        
        com.squareup.okhttp.Call call = operationsFeePlanPsysCidGetCall(psysCid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Plisio fee plans
     * 
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @return FeePlanApiResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FeePlanApiResponseDto operationsFeePlanPsysCidGet(String psysCid) throws ApiException {
        ApiResponse<FeePlanApiResponseDto> resp = operationsFeePlanPsysCidGetWithHttpInfo(psysCid);
        return resp.getData();
    }

    /**
     * Get Plisio fee plans
     * 
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @return ApiResponse&lt;FeePlanApiResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FeePlanApiResponseDto> operationsFeePlanPsysCidGetWithHttpInfo(String psysCid) throws ApiException {
        com.squareup.okhttp.Call call = operationsFeePlanPsysCidGetValidateBeforeCall(psysCid, null, null);
        Type localVarReturnType = new TypeToken<FeePlanApiResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Plisio fee plans (asynchronously)
     * 
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call operationsFeePlanPsysCidGetAsync(String psysCid, final ApiCallback<FeePlanApiResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = operationsFeePlanPsysCidGetValidateBeforeCall(psysCid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FeePlanApiResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for operationsFeePsysCidGet
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @param addresses wallet address or comma separated addresses when estimating fee for mass withdrawal (required)
     * @param amounts amount or comma separated amount that will be send in case of mass withdraw (required)
     * @param feePlan normal or priority (https://plisio.net/documentation/endpoints/fee-plans) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call operationsFeePsysCidGetCall(String psysCid, String addresses, String amounts, String feePlan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/operations/fee/{psys_cid}"
            .replaceAll("\\{" + "psys_cid" + "\\}", apiClient.escapeString(psysCid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (addresses != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("addresses", addresses));
        if (amounts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("amounts", amounts));
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
    private com.squareup.okhttp.Call operationsFeePsysCidGetValidateBeforeCall(String psysCid, String addresses, String amounts, String feePlan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'psysCid' is set
        if (psysCid == null) {
            throw new ApiException("Missing the required parameter 'psysCid' when calling operationsFeePsysCidGet(Async)");
        }
        // verify the required parameter 'addresses' is set
        if (addresses == null) {
            throw new ApiException("Missing the required parameter 'addresses' when calling operationsFeePsysCidGet(Async)");
        }
        // verify the required parameter 'amounts' is set
        if (amounts == null) {
            throw new ApiException("Missing the required parameter 'amounts' when calling operationsFeePsysCidGet(Async)");
        }
        
        com.squareup.okhttp.Call call = operationsFeePsysCidGetCall(psysCid, addresses, amounts, feePlan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Estimate fee
     * 
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @param addresses wallet address or comma separated addresses when estimating fee for mass withdrawal (required)
     * @param amounts amount or comma separated amount that will be send in case of mass withdraw (required)
     * @param feePlan normal or priority (https://plisio.net/documentation/endpoints/fee-plans) (optional)
     * @return FeeApiResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FeeApiResponseDto operationsFeePsysCidGet(String psysCid, String addresses, String amounts, String feePlan) throws ApiException {
        ApiResponse<FeeApiResponseDto> resp = operationsFeePsysCidGetWithHttpInfo(psysCid, addresses, amounts, feePlan);
        return resp.getData();
    }

    /**
     * Estimate fee
     * 
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @param addresses wallet address or comma separated addresses when estimating fee for mass withdrawal (required)
     * @param amounts amount or comma separated amount that will be send in case of mass withdraw (required)
     * @param feePlan normal or priority (https://plisio.net/documentation/endpoints/fee-plans) (optional)
     * @return ApiResponse&lt;FeeApiResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FeeApiResponseDto> operationsFeePsysCidGetWithHttpInfo(String psysCid, String addresses, String amounts, String feePlan) throws ApiException {
        com.squareup.okhttp.Call call = operationsFeePsysCidGetValidateBeforeCall(psysCid, addresses, amounts, feePlan, null, null);
        Type localVarReturnType = new TypeToken<FeeApiResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Estimate fee (asynchronously)
     * 
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @param addresses wallet address or comma separated addresses when estimating fee for mass withdrawal (required)
     * @param amounts amount or comma separated amount that will be send in case of mass withdraw (required)
     * @param feePlan normal or priority (https://plisio.net/documentation/endpoints/fee-plans) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call operationsFeePsysCidGetAsync(String psysCid, String addresses, String amounts, String feePlan, final ApiCallback<FeeApiResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = operationsFeePsysCidGetValidateBeforeCall(psysCid, addresses, amounts, feePlan, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FeeApiResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for operationsGet
     * @param page page number (optional)
     * @param limit number of elements on the page (optional)
     * @param shopId Filter operation by shop (optional)
     * @param type Transaction type (optional)
     * @param status Transaction status (optional)
     * @param currency one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) (optional)
     * @param search text search by the transaction id (txid), invoice’s order number or customer email from invoice (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call operationsGetCall(Integer page, Integer limit, String shopId, String type, String status, String currency, String search, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/operations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (shopId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("shop_id", shopId));
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("status", status));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (search != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("search", search));

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
    private com.squareup.okhttp.Call operationsGetValidateBeforeCall(Integer page, Integer limit, String shopId, String type, String status, String currency, String search, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = operationsGetCall(page, limit, shopId, type, status, currency, search, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List of all user transactions
     * 
     * @param page page number (optional)
     * @param limit number of elements on the page (optional)
     * @param shopId Filter operation by shop (optional)
     * @param type Transaction type (optional)
     * @param status Transaction status (optional)
     * @param currency one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) (optional)
     * @param search text search by the transaction id (txid), invoice’s order number or customer email from invoice (optional)
     * @return OperationsApiResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OperationsApiResponseDto operationsGet(Integer page, Integer limit, String shopId, String type, String status, String currency, String search) throws ApiException {
        ApiResponse<OperationsApiResponseDto> resp = operationsGetWithHttpInfo(page, limit, shopId, type, status, currency, search);
        return resp.getData();
    }

    /**
     * List of all user transactions
     * 
     * @param page page number (optional)
     * @param limit number of elements on the page (optional)
     * @param shopId Filter operation by shop (optional)
     * @param type Transaction type (optional)
     * @param status Transaction status (optional)
     * @param currency one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) (optional)
     * @param search text search by the transaction id (txid), invoice’s order number or customer email from invoice (optional)
     * @return ApiResponse&lt;OperationsApiResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OperationsApiResponseDto> operationsGetWithHttpInfo(Integer page, Integer limit, String shopId, String type, String status, String currency, String search) throws ApiException {
        com.squareup.okhttp.Call call = operationsGetValidateBeforeCall(page, limit, shopId, type, status, currency, search, null, null);
        Type localVarReturnType = new TypeToken<OperationsApiResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List of all user transactions (asynchronously)
     * 
     * @param page page number (optional)
     * @param limit number of elements on the page (optional)
     * @param shopId Filter operation by shop (optional)
     * @param type Transaction type (optional)
     * @param status Transaction status (optional)
     * @param currency one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) (optional)
     * @param search text search by the transaction id (txid), invoice’s order number or customer email from invoice (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call operationsGetAsync(Integer page, Integer limit, String shopId, String type, String status, String currency, String search, final ApiCallback<OperationsApiResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = operationsGetValidateBeforeCall(page, limit, shopId, type, status, currency, search, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OperationsApiResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for operationsIdGet
     * @param id transactoion id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call operationsIdGetCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/operations/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call operationsIdGetValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling operationsIdGet(Async)");
        }
        
        com.squareup.okhttp.Call call = operationsIdGetCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Transaction details
     * 
     * @param id transactoion id (required)
     * @return OperationApiResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OperationApiResponseDto operationsIdGet(String id) throws ApiException {
        ApiResponse<OperationApiResponseDto> resp = operationsIdGetWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Transaction details
     * 
     * @param id transactoion id (required)
     * @return ApiResponse&lt;OperationApiResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OperationApiResponseDto> operationsIdGetWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = operationsIdGetValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<OperationApiResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Transaction details (asynchronously)
     * 
     * @param id transactoion id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call operationsIdGetAsync(String id, final ApiCallback<OperationApiResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = operationsIdGetValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OperationApiResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
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
