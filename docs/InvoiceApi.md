# InvoiceApi

All URIs are relative to *https://plisio.net/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoicesEmailIdGet**](InvoiceApi.md#invoicesEmailIdGet) | **GET** /invoices/email/{id} | Invoice details
[**invoicesIdGet**](InvoiceApi.md#invoicesIdGet) | **GET** /invoices/{id} | Invoice details
[**invoicesNewGet**](InvoiceApi.md#invoicesNewGet) | **GET** /invoices/new | Create new invoice
[**invoicesSwitchIdGet**](InvoiceApi.md#invoicesSwitchIdGet) | **GET** /invoices/switch/{id} | Invoice details

<a name="invoicesEmailIdGet"></a>
# **invoicesEmailIdGet**
> InvoiceDetailsApiResponseDto invoicesEmailIdGet(id, email)

Invoice details

### Example
```java
// Import classes:
//import com.plisio.invoker.ApiClient;
//import com.plisio.invoker.ApiException;
//import com.plisio.invoker.Configuration;
//import com.plisio.invoker.auth.*;
//import com.plisio.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
String id = "id_example"; // String | invoice id
String email = "email_example"; // String | payer's email
try {
    InvoiceDetailsApiResponseDto result = apiInstance.invoicesEmailIdGet(id, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoicesEmailIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| invoice id |
 **email** | **String**| payer&#x27;s email |

### Return type

[**InvoiceDetailsApiResponseDto**](InvoiceDetailsApiResponseDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="invoicesIdGet"></a>
# **invoicesIdGet**
> InvoiceDetailsApiResponseDto invoicesIdGet(id)

Invoice details

### Example
```java
// Import classes:
//import com.plisio.invoker.ApiClient;
//import com.plisio.invoker.ApiException;
//import com.plisio.invoker.Configuration;
//import com.plisio.invoker.auth.*;
//import com.plisio.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
String id = "id_example"; // String | invoice id
try {
    InvoiceDetailsApiResponseDto result = apiInstance.invoicesIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoicesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| invoice id |

### Return type

[**InvoiceDetailsApiResponseDto**](InvoiceDetailsApiResponseDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="invoicesNewGet"></a>
# **invoicesNewGet**
> InvoiceWhiteLabelResponseDto invoicesNewGet(currency, orderName, orderNumber, amount, sourceCurrency, sourceAmount, allowedPsysCids, description, callbackUrl, email, language, plugin, version, redirectToInvoice, expireMin)

Create new invoice

### Example
```java
// Import classes:
//import com.plisio.invoker.ApiClient;
//import com.plisio.invoker.ApiException;
//import com.plisio.invoker.Configuration;
//import com.plisio.invoker.auth.*;
//import com.plisio.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
String currency = "currency_example"; // String | one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies)
String orderName = "orderName_example"; // String | merchant internal order name
String orderNumber = "orderNumber_example"; // String | merchant internal order number. Must be unique number in your store for each new store`s order!!!
String amount = "amount_example"; // String | any cryptocurrency float value. !!! Please, skip this field If you want to convert a fiat currency and use source_currency and source_amount fields instead
String sourceCurrency = "sourceCurrency_example"; // String | one of the 167 fiat currencies https://plisio.net/documentation/appendices/supported-fiat-currencies
String sourceAmount = "sourceAmount_example"; // String | any float value
String allowedPsysCids = "allowedPsysCids_example"; // String | comma-separated list of cryptocurrencies that allowed for payment. Customer will be able to select one of them. Example: BTC,ETH,TZEC
String description = "description_example"; // String | merchant invoice description
String callbackUrl = "callbackUrl_example"; // String | merchant full URL to get invoice updates. The “POST” request will be sent to this URL (example). If this parameter isn’t set, Plisio will send a callback to URL that can be set under profile API » API settings » ”Status URL” field
String email = "email_example"; // String | an auto-fill invoice email. The customer will be asked to insert their email where a notification will be sent
String language = "language_example"; // String | en_US (we support EN language only)
String plugin = "plugin_example"; // String | Plisio’s internal field to determine integration plugin
String version = "version_example"; // String | Plisio’s internal field to determine integration plugin version 
Boolean redirectToInvoice = true; // Boolean | Instead of JSON response user will be redirected to the Plisio's invoice page (is not working for a white-label shop)
String expireMin = "expireMin_example"; // String | Interval in minutes when invoice will be expired
try {
    InvoiceWhiteLabelResponseDto result = apiInstance.invoicesNewGet(currency, orderName, orderNumber, amount, sourceCurrency, sourceAmount, allowedPsysCids, description, callbackUrl, email, language, plugin, version, redirectToInvoice, expireMin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoicesNewGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) |
 **orderName** | **String**| merchant internal order name |
 **orderNumber** | **String**| merchant internal order number. Must be unique number in your store for each new store&#x60;s order!!! |
 **amount** | **String**| any cryptocurrency float value. !!! Please, skip this field If you want to convert a fiat currency and use source_currency and source_amount fields instead | [optional]
 **sourceCurrency** | **String**| one of the 167 fiat currencies https://plisio.net/documentation/appendices/supported-fiat-currencies | [optional]
 **sourceAmount** | **String**| any float value | [optional]
 **allowedPsysCids** | **String**| comma-separated list of cryptocurrencies that allowed for payment. Customer will be able to select one of them. Example: BTC,ETH,TZEC | [optional]
 **description** | **String**| merchant invoice description | [optional]
 **callbackUrl** | **String**| merchant full URL to get invoice updates. The “POST” request will be sent to this URL (example). If this parameter isn’t set, Plisio will send a callback to URL that can be set under profile API » API settings » ”Status URL” field | [optional]
 **email** | **String**| an auto-fill invoice email. The customer will be asked to insert their email where a notification will be sent | [optional]
 **language** | **String**| en_US (we support EN language only) | [optional]
 **plugin** | **String**| Plisio’s internal field to determine integration plugin | [optional]
 **version** | **String**| Plisio’s internal field to determine integration plugin version  | [optional]
 **redirectToInvoice** | **Boolean**| Instead of JSON response user will be redirected to the Plisio&#x27;s invoice page (is not working for a white-label shop) | [optional]
 **expireMin** | **String**| Interval in minutes when invoice will be expired | [optional]

### Return type

[**InvoiceWhiteLabelResponseDto**](InvoiceWhiteLabelResponseDto.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="invoicesSwitchIdGet"></a>
# **invoicesSwitchIdGet**
> InvoiceDetailsApiResponseDto invoicesSwitchIdGet(id, psysCid)

Invoice details

### Example
```java
// Import classes:
//import com.plisio.invoker.ApiClient;
//import com.plisio.invoker.ApiException;
//import com.plisio.invoker.Configuration;
//import com.plisio.invoker.auth.*;
//import com.plisio.api.InvoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: view_key
ApiKeyAuth view_key = (ApiKeyAuth) defaultClient.getAuthentication("view_key");
view_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//view_key.setApiKeyPrefix("Token");

InvoiceApi apiInstance = new InvoiceApi();
String id = "id_example"; // String | invoice id
String psysCid = "psysCid_example"; // String | destination cryptocurrency id
try {
    InvoiceDetailsApiResponseDto result = apiInstance.invoicesSwitchIdGet(id, psysCid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#invoicesSwitchIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| invoice id |
 **psysCid** | **String**| destination cryptocurrency id |

### Return type

[**InvoiceDetailsApiResponseDto**](InvoiceDetailsApiResponseDto.md)

### Authorization

[view_key](../README.md#view_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

