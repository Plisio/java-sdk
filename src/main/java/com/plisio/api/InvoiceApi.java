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
import com.plisio.model.InvoiceDetailsApiResponseDto;
import com.plisio.model.InvoiceWhiteLabelResponseDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvoiceApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public InvoiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InvoiceApi(ApiClient apiClient) {
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
     * Build call for invoicesEmailIdGet
     * @param id invoice id (required)
     * @param email payer&#x27;s email (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call invoicesEmailIdGetCall(String id, String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/invoices/email/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (email != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("email", email));

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
    private com.squareup.okhttp.Call invoicesEmailIdGetValidateBeforeCall(String id, String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling invoicesEmailIdGet(Async)");
        }
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new ApiException("Missing the required parameter 'email' when calling invoicesEmailIdGet(Async)");
        }
        
        com.squareup.okhttp.Call call = invoicesEmailIdGetCall(id, email, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Invoice details
     * 
     * @param id invoice id (required)
     * @param email payer&#x27;s email (required)
     * @return InvoiceDetailsApiResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InvoiceDetailsApiResponseDto invoicesEmailIdGet(String id, String email) throws ApiException {
        ApiResponse<InvoiceDetailsApiResponseDto> resp = invoicesEmailIdGetWithHttpInfo(id, email);
        return resp.getData();
    }

    /**
     * Invoice details
     * 
     * @param id invoice id (required)
     * @param email payer&#x27;s email (required)
     * @return ApiResponse&lt;InvoiceDetailsApiResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InvoiceDetailsApiResponseDto> invoicesEmailIdGetWithHttpInfo(String id, String email) throws ApiException {
        com.squareup.okhttp.Call call = invoicesEmailIdGetValidateBeforeCall(id, email, null, null);
        Type localVarReturnType = new TypeToken<InvoiceDetailsApiResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Invoice details (asynchronously)
     * 
     * @param id invoice id (required)
     * @param email payer&#x27;s email (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call invoicesEmailIdGetAsync(String id, String email, final ApiCallback<InvoiceDetailsApiResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = invoicesEmailIdGetValidateBeforeCall(id, email, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InvoiceDetailsApiResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for invoicesIdGet
     * @param id invoice id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call invoicesIdGetCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/invoices/{id}"
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
    private com.squareup.okhttp.Call invoicesIdGetValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling invoicesIdGet(Async)");
        }
        
        com.squareup.okhttp.Call call = invoicesIdGetCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Invoice details
     * 
     * @param id invoice id (required)
     * @return InvoiceDetailsApiResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InvoiceDetailsApiResponseDto invoicesIdGet(String id) throws ApiException {
        ApiResponse<InvoiceDetailsApiResponseDto> resp = invoicesIdGetWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Invoice details
     * 
     * @param id invoice id (required)
     * @return ApiResponse&lt;InvoiceDetailsApiResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InvoiceDetailsApiResponseDto> invoicesIdGetWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = invoicesIdGetValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<InvoiceDetailsApiResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Invoice details (asynchronously)
     * 
     * @param id invoice id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call invoicesIdGetAsync(String id, final ApiCallback<InvoiceDetailsApiResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = invoicesIdGetValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InvoiceDetailsApiResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for invoicesNewGet
     * @param currency one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) (required)
     * @param orderName merchant internal order name (required)
     * @param orderNumber merchant internal order number. Must be unique number in your store for each new store&#x60;s order!!! (required)
     * @param amount any cryptocurrency float value. !!! Please, skip this field If you want to convert a fiat currency and use source_currency and source_amount fields instead (optional)
     * @param sourceCurrency one of the 167 fiat currencies https://plisio.net/documentation/appendices/supported-fiat-currencies (optional)
     * @param sourceAmount any float value (optional)
     * @param allowedPsysCids comma-separated list of cryptocurrencies that allowed for payment. Customer will be able to select one of them. Example: BTC,ETH,TZEC (optional)
     * @param description merchant invoice description (optional)
     * @param callbackUrl merchant full URL to get invoice updates. The “POST” request will be sent to this URL (example). If this parameter isn’t set, Plisio will send a callback to URL that can be set under profile API » API settings » ”Status URL” field (optional)
     * @param email an auto-fill invoice email. The customer will be asked to insert their email where a notification will be sent (optional)
     * @param language en_US (we support EN language only) (optional)
     * @param plugin Plisio’s internal field to determine integration plugin (optional)
     * @param version Plisio’s internal field to determine integration plugin version  (optional)
     * @param redirectToInvoice Instead of JSON response user will be redirected to the Plisio&#x27;s invoice page (is not working for a white-label shop) (optional)
     * @param expireMin Interval in minutes when invoice will be expired (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call invoicesNewGetCall(String currency, String orderName, String orderNumber, String amount, String sourceCurrency, String sourceAmount, String allowedPsysCids, String description, String callbackUrl, String email, String language, String plugin, String version, Boolean redirectToInvoice, String expireMin, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/invoices/new";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (amount != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("amount", amount));
        if (sourceCurrency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source_currency", sourceCurrency));
        if (sourceAmount != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source_amount", sourceAmount));
        if (allowedPsysCids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("allowed_psys_cids", allowedPsysCids));
        if (orderName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order_name", orderName));
        if (orderNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order_number", orderNumber));
        if (description != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("description", description));
        if (callbackUrl != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("callback_url", callbackUrl));
        if (email != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("email", email));
        if (language != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("language", language));
        if (plugin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("plugin", plugin));
        if (version != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("version", version));
        if (redirectToInvoice != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("redirect_to_invoice", redirectToInvoice));
        if (expireMin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("expire_min", expireMin));

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
    private com.squareup.okhttp.Call invoicesNewGetValidateBeforeCall(String currency, String orderName, String orderNumber, String amount, String sourceCurrency, String sourceAmount, String allowedPsysCids, String description, String callbackUrl, String email, String language, String plugin, String version, Boolean redirectToInvoice, String expireMin, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'currency' is set
        if (currency == null) {
            throw new ApiException("Missing the required parameter 'currency' when calling invoicesNewGet(Async)");
        }
        // verify the required parameter 'orderName' is set
        if (orderName == null) {
            throw new ApiException("Missing the required parameter 'orderName' when calling invoicesNewGet(Async)");
        }
        // verify the required parameter 'orderNumber' is set
        if (orderNumber == null) {
            throw new ApiException("Missing the required parameter 'orderNumber' when calling invoicesNewGet(Async)");
        }
        
        com.squareup.okhttp.Call call = invoicesNewGetCall(currency, orderName, orderNumber, amount, sourceCurrency, sourceAmount, allowedPsysCids, description, callbackUrl, email, language, plugin, version, redirectToInvoice, expireMin, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create new invoice
     * 
     * @param currency one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) (required)
     * @param orderName merchant internal order name (required)
     * @param orderNumber merchant internal order number. Must be unique number in your store for each new store&#x60;s order!!! (required)
     * @param amount any cryptocurrency float value. !!! Please, skip this field If you want to convert a fiat currency and use source_currency and source_amount fields instead (optional)
     * @param sourceCurrency one of the 167 fiat currencies https://plisio.net/documentation/appendices/supported-fiat-currencies (optional)
     * @param sourceAmount any float value (optional)
     * @param allowedPsysCids comma-separated list of cryptocurrencies that allowed for payment. Customer will be able to select one of them. Example: BTC,ETH,TZEC (optional)
     * @param description merchant invoice description (optional)
     * @param callbackUrl merchant full URL to get invoice updates. The “POST” request will be sent to this URL (example). If this parameter isn’t set, Plisio will send a callback to URL that can be set under profile API » API settings » ”Status URL” field (optional)
     * @param email an auto-fill invoice email. The customer will be asked to insert their email where a notification will be sent (optional)
     * @param language en_US (we support EN language only) (optional)
     * @param plugin Plisio’s internal field to determine integration plugin (optional)
     * @param version Plisio’s internal field to determine integration plugin version  (optional)
     * @param redirectToInvoice Instead of JSON response user will be redirected to the Plisio&#x27;s invoice page (is not working for a white-label shop) (optional)
     * @param expireMin Interval in minutes when invoice will be expired (optional)
     * @return InvoiceWhiteLabelResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InvoiceWhiteLabelResponseDto invoicesNewGet(String currency, String orderName, String orderNumber, String amount, String sourceCurrency, String sourceAmount, String allowedPsysCids, String description, String callbackUrl, String email, String language, String plugin, String version, Boolean redirectToInvoice, String expireMin) throws ApiException {
        ApiResponse<InvoiceWhiteLabelResponseDto> resp = invoicesNewGetWithHttpInfo(currency, orderName, orderNumber, amount, sourceCurrency, sourceAmount, allowedPsysCids, description, callbackUrl, email, language, plugin, version, redirectToInvoice, expireMin);
        return resp.getData();
    }

    /**
     * Create new invoice
     * 
     * @param currency one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) (required)
     * @param orderName merchant internal order name (required)
     * @param orderNumber merchant internal order number. Must be unique number in your store for each new store&#x60;s order!!! (required)
     * @param amount any cryptocurrency float value. !!! Please, skip this field If you want to convert a fiat currency and use source_currency and source_amount fields instead (optional)
     * @param sourceCurrency one of the 167 fiat currencies https://plisio.net/documentation/appendices/supported-fiat-currencies (optional)
     * @param sourceAmount any float value (optional)
     * @param allowedPsysCids comma-separated list of cryptocurrencies that allowed for payment. Customer will be able to select one of them. Example: BTC,ETH,TZEC (optional)
     * @param description merchant invoice description (optional)
     * @param callbackUrl merchant full URL to get invoice updates. The “POST” request will be sent to this URL (example). If this parameter isn’t set, Plisio will send a callback to URL that can be set under profile API » API settings » ”Status URL” field (optional)
     * @param email an auto-fill invoice email. The customer will be asked to insert their email where a notification will be sent (optional)
     * @param language en_US (we support EN language only) (optional)
     * @param plugin Plisio’s internal field to determine integration plugin (optional)
     * @param version Plisio’s internal field to determine integration plugin version  (optional)
     * @param redirectToInvoice Instead of JSON response user will be redirected to the Plisio&#x27;s invoice page (is not working for a white-label shop) (optional)
     * @param expireMin Interval in minutes when invoice will be expired (optional)
     * @return ApiResponse&lt;InvoiceWhiteLabelResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InvoiceWhiteLabelResponseDto> invoicesNewGetWithHttpInfo(String currency, String orderName, String orderNumber, String amount, String sourceCurrency, String sourceAmount, String allowedPsysCids, String description, String callbackUrl, String email, String language, String plugin, String version, Boolean redirectToInvoice, String expireMin) throws ApiException {
        com.squareup.okhttp.Call call = invoicesNewGetValidateBeforeCall(currency, orderName, orderNumber, amount, sourceCurrency, sourceAmount, allowedPsysCids, description, callbackUrl, email, language, plugin, version, redirectToInvoice, expireMin, null, null);
        Type localVarReturnType = new TypeToken<InvoiceWhiteLabelResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create new invoice (asynchronously)
     * 
     * @param currency one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) (required)
     * @param orderName merchant internal order name (required)
     * @param orderNumber merchant internal order number. Must be unique number in your store for each new store&#x60;s order!!! (required)
     * @param amount any cryptocurrency float value. !!! Please, skip this field If you want to convert a fiat currency and use source_currency and source_amount fields instead (optional)
     * @param sourceCurrency one of the 167 fiat currencies https://plisio.net/documentation/appendices/supported-fiat-currencies (optional)
     * @param sourceAmount any float value (optional)
     * @param allowedPsysCids comma-separated list of cryptocurrencies that allowed for payment. Customer will be able to select one of them. Example: BTC,ETH,TZEC (optional)
     * @param description merchant invoice description (optional)
     * @param callbackUrl merchant full URL to get invoice updates. The “POST” request will be sent to this URL (example). If this parameter isn’t set, Plisio will send a callback to URL that can be set under profile API » API settings » ”Status URL” field (optional)
     * @param email an auto-fill invoice email. The customer will be asked to insert their email where a notification will be sent (optional)
     * @param language en_US (we support EN language only) (optional)
     * @param plugin Plisio’s internal field to determine integration plugin (optional)
     * @param version Plisio’s internal field to determine integration plugin version  (optional)
     * @param redirectToInvoice Instead of JSON response user will be redirected to the Plisio&#x27;s invoice page (is not working for a white-label shop) (optional)
     * @param expireMin Interval in minutes when invoice will be expired (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call invoicesNewGetAsync(String currency, String orderName, String orderNumber, String amount, String sourceCurrency, String sourceAmount, String allowedPsysCids, String description, String callbackUrl, String email, String language, String plugin, String version, Boolean redirectToInvoice, String expireMin, final ApiCallback<InvoiceWhiteLabelResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = invoicesNewGetValidateBeforeCall(currency, orderName, orderNumber, amount, sourceCurrency, sourceAmount, allowedPsysCids, description, callbackUrl, email, language, plugin, version, redirectToInvoice, expireMin, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InvoiceWhiteLabelResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for invoicesSwitchIdGet
     * @param id invoice id (required)
     * @param psysCid destination cryptocurrency id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call invoicesSwitchIdGetCall(String id, String psysCid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/invoices/switch/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (psysCid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("psys_cid", psysCid));

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

        String[] localVarAuthNames = new String[] { "view_key" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call invoicesSwitchIdGetValidateBeforeCall(String id, String psysCid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling invoicesSwitchIdGet(Async)");
        }
        // verify the required parameter 'psysCid' is set
        if (psysCid == null) {
            throw new ApiException("Missing the required parameter 'psysCid' when calling invoicesSwitchIdGet(Async)");
        }
        
        com.squareup.okhttp.Call call = invoicesSwitchIdGetCall(id, psysCid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Invoice details
     * 
     * @param id invoice id (required)
     * @param psysCid destination cryptocurrency id (required)
     * @return InvoiceDetailsApiResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InvoiceDetailsApiResponseDto invoicesSwitchIdGet(String id, String psysCid) throws ApiException {
        ApiResponse<InvoiceDetailsApiResponseDto> resp = invoicesSwitchIdGetWithHttpInfo(id, psysCid);
        return resp.getData();
    }

    /**
     * Invoice details
     * 
     * @param id invoice id (required)
     * @param psysCid destination cryptocurrency id (required)
     * @return ApiResponse&lt;InvoiceDetailsApiResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InvoiceDetailsApiResponseDto> invoicesSwitchIdGetWithHttpInfo(String id, String psysCid) throws ApiException {
        com.squareup.okhttp.Call call = invoicesSwitchIdGetValidateBeforeCall(id, psysCid, null, null);
        Type localVarReturnType = new TypeToken<InvoiceDetailsApiResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Invoice details (asynchronously)
     * 
     * @param id invoice id (required)
     * @param psysCid destination cryptocurrency id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call invoicesSwitchIdGetAsync(String id, String psysCid, final ApiCallback<InvoiceDetailsApiResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = invoicesSwitchIdGetValidateBeforeCall(id, psysCid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InvoiceDetailsApiResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
