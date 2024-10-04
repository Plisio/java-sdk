# TransactionApi

All URIs are relative to *https://plisio.net/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**operationsCommissionPsysCidGet**](TransactionApi.md#operationsCommissionPsysCidGet) | **GET** /operations/commission/{psys_cid} | Estimate cryptocurrency fee and Plisio commission
[**operationsFeePlanPsysCidGet**](TransactionApi.md#operationsFeePlanPsysCidGet) | **GET** /operations/fee-plan/{psys_cid} | Get Plisio fee plans
[**operationsFeePsysCidGet**](TransactionApi.md#operationsFeePsysCidGet) | **GET** /operations/fee/{psys_cid} | Estimate fee
[**operationsGet**](TransactionApi.md#operationsGet) | **GET** /operations | List of all user transactions
[**operationsIdGet**](TransactionApi.md#operationsIdGet) | **GET** /operations/{id} | Transaction details
[**operationsWithdrawGet**](TransactionApi.md#operationsWithdrawGet) | **GET** /operations/withdraw | Create new invoice

<a name="operationsCommissionPsysCidGet"></a>
# **operationsCommissionPsysCidGet**
> CommissionApiResponseDto operationsCommissionPsysCidGet(psysCid, addresses, amounts, type, feePlan)

Estimate cryptocurrency fee and Plisio commission

### Example
```java
// Import classes:
//import com.plisio.invoker.ApiClient;
//import com.plisio.invoker.ApiException;
//import com.plisio.invoker.Configuration;
//import com.plisio.invoker.auth.*;
//import com.plisio.api.TransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TransactionApi apiInstance = new TransactionApi();
String psysCid = "psysCid_example"; // String | ID column from one of the supported cryptocurrencies supported by Plisio
String addresses = "addresses_example"; // String | wallet address or comma separated addresses when estimating fee for mass withdrawal
String amounts = "amounts_example"; // String | amount or comma separated amount that will be send in case of mass withdraw
String type = "type_example"; // String | operation type
String feePlan = "feePlan_example"; // String | normal or priority (https://plisio.net/documentation/endpoints/fee-plans)
try {
    CommissionApiResponseDto result = apiInstance.operationsCommissionPsysCidGet(psysCid, addresses, amounts, type, feePlan);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionApi#operationsCommissionPsysCidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **psysCid** | **String**| ID column from one of the supported cryptocurrencies supported by Plisio |
 **addresses** | **String**| wallet address or comma separated addresses when estimating fee for mass withdrawal |
 **amounts** | **String**| amount or comma separated amount that will be send in case of mass withdraw |
 **type** | **String**| operation type | [enum: cash_out, mass_cash_out]
 **feePlan** | **String**| normal or priority (https://plisio.net/documentation/endpoints/fee-plans) | [optional] [enum: normal, priority]

### Return type

[**CommissionApiResponseDto**](CommissionApiResponseDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="operationsFeePlanPsysCidGet"></a>
# **operationsFeePlanPsysCidGet**
> FeePlanApiResponseDto operationsFeePlanPsysCidGet(psysCid)

Get Plisio fee plans

### Example
```java
// Import classes:
//import com.plisio.invoker.ApiClient;
//import com.plisio.invoker.ApiException;
//import com.plisio.invoker.Configuration;
//import com.plisio.invoker.auth.*;
//import com.plisio.api.TransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TransactionApi apiInstance = new TransactionApi();
String psysCid = "psysCid_example"; // String | ID column from one of the supported cryptocurrencies supported by Plisio
try {
    FeePlanApiResponseDto result = apiInstance.operationsFeePlanPsysCidGet(psysCid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionApi#operationsFeePlanPsysCidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **psysCid** | **String**| ID column from one of the supported cryptocurrencies supported by Plisio |

### Return type

[**FeePlanApiResponseDto**](FeePlanApiResponseDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="operationsFeePsysCidGet"></a>
# **operationsFeePsysCidGet**
> FeeApiResponseDto operationsFeePsysCidGet(psysCid, addresses, amounts, feePlan)

Estimate fee

### Example
```java
// Import classes:
//import com.plisio.invoker.ApiClient;
//import com.plisio.invoker.ApiException;
//import com.plisio.invoker.Configuration;
//import com.plisio.invoker.auth.*;
//import com.plisio.api.TransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TransactionApi apiInstance = new TransactionApi();
String psysCid = "psysCid_example"; // String | ID column from one of the supported cryptocurrencies supported by Plisio
String addresses = "addresses_example"; // String | wallet address or comma separated addresses when estimating fee for mass withdrawal
String amounts = "amounts_example"; // String | amount or comma separated amount that will be send in case of mass withdraw
String feePlan = "feePlan_example"; // String | normal or priority (https://plisio.net/documentation/endpoints/fee-plans)
try {
    FeeApiResponseDto result = apiInstance.operationsFeePsysCidGet(psysCid, addresses, amounts, feePlan);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionApi#operationsFeePsysCidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **psysCid** | **String**| ID column from one of the supported cryptocurrencies supported by Plisio |
 **addresses** | **String**| wallet address or comma separated addresses when estimating fee for mass withdrawal |
 **amounts** | **String**| amount or comma separated amount that will be send in case of mass withdraw |
 **feePlan** | **String**| normal or priority (https://plisio.net/documentation/endpoints/fee-plans) | [optional] [enum: normal, priority]

### Return type

[**FeeApiResponseDto**](FeeApiResponseDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="operationsGet"></a>
# **operationsGet**
> OperationsApiResponseDto operationsGet(page, limit, shopId, type, status, currency, search)

List of all user transactions

### Example
```java
// Import classes:
//import com.plisio.invoker.ApiClient;
//import com.plisio.invoker.ApiException;
//import com.plisio.invoker.Configuration;
//import com.plisio.invoker.auth.*;
//import com.plisio.api.TransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TransactionApi apiInstance = new TransactionApi();
Integer page = 56; // Integer | page number
Integer limit = 56; // Integer | number of elements on the page
String shopId = "shopId_example"; // String | Filter operation by shop
String type = "type_example"; // String | Transaction type
String status = "status_example"; // String | Transaction status
String currency = "currency_example"; // String | one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies)
String search = "search_example"; // String | text search by the transaction id (txid), invoice’s order number or customer email from invoice
try {
    OperationsApiResponseDto result = apiInstance.operationsGet(page, limit, shopId, type, status, currency, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionApi#operationsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| page number | [optional]
 **limit** | **Integer**| number of elements on the page | [optional]
 **shopId** | **String**| Filter operation by shop | [optional]
 **type** | **String**| Transaction type | [optional] [enum: cash_in, cash_out, mass_cash_out, invoice]
 **status** | **String**| Transaction status | [optional] [enum: pending, completed, error, new, expired, mismatch, cancelled]
 **currency** | **String**| one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) | [optional]
 **search** | **String**| text search by the transaction id (txid), invoice’s order number or customer email from invoice | [optional]

### Return type

[**OperationsApiResponseDto**](OperationsApiResponseDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="operationsIdGet"></a>
# **operationsIdGet**
> OperationApiResponseDto operationsIdGet(id)

Transaction details

### Example
```java
// Import classes:
//import com.plisio.invoker.ApiClient;
//import com.plisio.invoker.ApiException;
//import com.plisio.invoker.Configuration;
//import com.plisio.invoker.auth.*;
//import com.plisio.api.TransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TransactionApi apiInstance = new TransactionApi();
String id = "id_example"; // String | transactoion id
try {
    OperationApiResponseDto result = apiInstance.operationsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionApi#operationsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| transactoion id |

### Return type

[**OperationApiResponseDto**](OperationApiResponseDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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
//import com.plisio.api.TransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TransactionApi apiInstance = new TransactionApi();
String psysCid = "psysCid_example"; // String | one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies)
String to = "to_example"; // String | hash or multiple comma separated hashes pooled for the 'mass_cash_out'
String amount = "amount_example"; // String | any comma separated float values for the “ mass_cash_out” in the order that hashes are in “to” parameter
String type = "type_example"; // String | 'cash_out' or 'mass_cash_out' to send to single or multiple comma separated hashes
String feePlan = "feePlan_example"; // String |  normal or priority (https://plisio.net/documentation/endpoints/fee-plan)
try {
    WithdrawApiResponseDto result = apiInstance.operationsWithdrawGet(psysCid, to, amount, type, feePlan);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionApi#operationsWithdrawGet");
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

