# ShopApi

All URIs are relative to *https://plisio.net/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**shopsGet**](ShopApi.md#shopsGet) | **GET** /shops | Get shop info by api_key

<a name="shopsGet"></a>
# **shopsGet**
> ShopResponseDto shopsGet()

Get shop info by api_key

### Example
```java
// Import classes:
//import com.plisio.invoker.ApiClient;
//import com.plisio.invoker.ApiException;
//import com.plisio.invoker.Configuration;
//import com.plisio.invoker.auth.*;
//import com.plisio.api.ShopApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ShopApi apiInstance = new ShopApi();
try {
    ShopResponseDto result = apiInstance.shopsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShopApi#shopsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ShopResponseDto**](ShopResponseDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

