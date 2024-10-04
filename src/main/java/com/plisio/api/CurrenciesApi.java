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


import com.plisio.model.CryptocurrencyApiResponseDto;
import com.plisio.model.ErrorResponseDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrenciesApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public CurrenciesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CurrenciesApi(ApiClient apiClient) {
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
     * Build call for currenciesFiatGet
     * @param fiat one of the 168 fiat currencies https://plisio.net/documentation/appendices/supported-fiat-currencies (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call currenciesFiatGetCall(String fiat, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/currencies/{fiat}"
            .replaceAll("\\{" + "fiat" + "\\}", apiClient.escapeString(fiat.toString()));

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
    private com.squareup.okhttp.Call currenciesFiatGetValidateBeforeCall(String fiat, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'fiat' is set
        if (fiat == null) {
            throw new ApiException("Missing the required parameter 'fiat' when calling currenciesFiatGet(Async)");
        }
        
        com.squareup.okhttp.Call call = currenciesFiatGetCall(fiat, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List of supported cryptocurrencies
     * 
     * @param fiat one of the 168 fiat currencies https://plisio.net/documentation/appendices/supported-fiat-currencies (required)
     * @return CryptocurrencyApiResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CryptocurrencyApiResponseDto currenciesFiatGet(String fiat) throws ApiException {
        ApiResponse<CryptocurrencyApiResponseDto> resp = currenciesFiatGetWithHttpInfo(fiat);
        return resp.getData();
    }

    /**
     * List of supported cryptocurrencies
     * 
     * @param fiat one of the 168 fiat currencies https://plisio.net/documentation/appendices/supported-fiat-currencies (required)
     * @return ApiResponse&lt;CryptocurrencyApiResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CryptocurrencyApiResponseDto> currenciesFiatGetWithHttpInfo(String fiat) throws ApiException {
        com.squareup.okhttp.Call call = currenciesFiatGetValidateBeforeCall(fiat, null, null);
        Type localVarReturnType = new TypeToken<CryptocurrencyApiResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List of supported cryptocurrencies (asynchronously)
     * 
     * @param fiat one of the 168 fiat currencies https://plisio.net/documentation/appendices/supported-fiat-currencies (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call currenciesFiatGetAsync(String fiat, final ApiCallback<CryptocurrencyApiResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = currenciesFiatGetValidateBeforeCall(fiat, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CryptocurrencyApiResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
