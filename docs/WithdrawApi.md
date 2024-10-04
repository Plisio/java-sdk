# WithdrawApi

All URIs are relative to *https://plisio.net/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**operationsWithdrawGet**](WithdrawApi.md#operationsWithdrawGet) | **GET** /operations/withdraw | Create new invoice

<a name="operationsWithdrawGet"></a>
# **operationsWithdrawGet**
> WithdrawApiResponseDto operationsWithdrawGet(psysCid, to, amount, type, feePlan)

Create new invoice

### Example
```java
// Import classes:
//import com.plisio.invoker.ApiClient;
//import com.plisio.invoker.ApiException;
//import com.plisio.invoker.Configuration;
//import com.plisio.invoker.auth.*;
//import com.plisio.api.WithdrawApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WithdrawApi apiInstance = new WithdrawApi();
String psysCid = "psysCid_example"; // String | one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies)
String to = "to_example"; // String | hash or multiple comma separated hashes pooled for the 'mass_cash_out'
String amount = "amount_example"; // String | any comma separated float values for the “ mass_cash_out” in the order that hashes are in “to” parameter
String type = "type_example"; // String | 'cash_out' or 'mass_cash_out' to send to single or multiple comma separated hashes
String feePlan = "feePlan_example"; // String |  normal or priority (https://plisio.net/documentation/endpoints/fee-plan)
try {
    WithdrawApiResponseDto result = apiInstance.operationsWithdrawGet(psysCid, to, amount, type, feePlan);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WithdrawApi#operationsWithdrawGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **psysCid** | **String**| one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) |
 **to** | **String**| hash or multiple comma separated hashes pooled for the &#x27;mass_cash_out&#x27; |
 **amount** | **String**| any comma separated float values for the “ mass_cash_out” in the order that hashes are in “to” parameter |
 **type** | **String**| &#x27;cash_out&#x27; or &#x27;mass_cash_out&#x27; to send to single or multiple comma separated hashes |
 **feePlan** | **String**|  normal or priority (https://plisio.net/documentation/endpoints/fee-plan) | [optional]

### Return type

[**WithdrawApiResponseDto**](WithdrawApiResponseDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

