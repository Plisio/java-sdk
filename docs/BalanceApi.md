# BalanceApi

All URIs are relative to *https://plisio.net/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**balancesPsysCidGet**](BalanceApi.md#balancesPsysCidGet) | **GET** /balances/{psys_cid} | Get cryptocurrency balance

<a name="balancesPsysCidGet"></a>
# **balancesPsysCidGet**
> BalanceApiResponseDto balancesPsysCidGet(psysCid)

Get cryptocurrency balance

### Example
```java
// Import classes:
//import com.plisio.invoker.ApiClient;
//import com.plisio.invoker.ApiException;
//import com.plisio.invoker.Configuration;
//import com.plisio.invoker.auth.*;
//import com.plisio.api.BalanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BalanceApi apiInstance = new BalanceApi();
String psysCid = "psysCid_example"; // String | ID column from one of the supported cryptocurrencies supported by Plisio
try {
    BalanceApiResponseDto result = apiInstance.balancesPsysCidGet(psysCid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BalanceApi#balancesPsysCidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **psysCid** | **String**| ID column from one of the supported cryptocurrencies supported by Plisio |

### Return type

[**BalanceApiResponseDto**](BalanceApiResponseDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

