# CurrenciesApi

All URIs are relative to *https://plisio.net/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**currenciesFiatGet**](CurrenciesApi.md#currenciesFiatGet) | **GET** /currencies/{fiat} | List of supported cryptocurrencies

<a name="currenciesFiatGet"></a>
# **currenciesFiatGet**
> CryptocurrencyApiResponseDto currenciesFiatGet(fiat)

List of supported cryptocurrencies

### Example
```java
// Import classes:
//import com.plisio.invoker.ApiClient;
//import com.plisio.invoker.ApiException;
//import com.plisio.invoker.Configuration;
//import com.plisio.invoker.auth.*;
//import com.plisio.api.CurrenciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CurrenciesApi apiInstance = new CurrenciesApi();
String fiat = "fiat_example"; // String | one of the 168 fiat currencies https://plisio.net/documentation/appendices/supported-fiat-currencies
try {
    CryptocurrencyApiResponseDto result = apiInstance.currenciesFiatGet(fiat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#currenciesFiatGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fiat** | **String**| one of the 168 fiat currencies https://plisio.net/documentation/appendices/supported-fiat-currencies |

### Return type

[**CryptocurrencyApiResponseDto**](CryptocurrencyApiResponseDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

