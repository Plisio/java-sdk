# Plisio Java SDK

Plisio API
- API version: 1.0 (build for java8)

Plisio payment gateway API

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.plisiogroup</groupId>
  <artifactId>plisio-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.plisiogroup:plisio-java-sdk:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/plisio-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.plisio.invoker.*;
import com.plisio.invoker.auth.*;
import com.plisio.model.*;
import com.plisio.api.BalanceApi;

import java.io.File;
import java.util.*;

public class BalanceApiExample {

    public static void main(String[] args) {
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
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://plisio.net/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BalanceApi* | [**balancesPsysCidGet**](docs/BalanceApi.md#balancesPsysCidGet) | **GET** /balances/{psys_cid} | Get cryptocurrency balance
*CurrenciesApi* | [**currenciesFiatGet**](docs/CurrenciesApi.md#currenciesFiatGet) | **GET** /currencies/{fiat} | List of supported cryptocurrencies
*InvoiceApi* | [**invoicesEmailIdGet**](docs/InvoiceApi.md#invoicesEmailIdGet) | **GET** /invoices/email/{id} | Invoice details
*InvoiceApi* | [**invoicesIdGet**](docs/InvoiceApi.md#invoicesIdGet) | **GET** /invoices/{id} | Invoice details
*InvoiceApi* | [**invoicesNewGet**](docs/InvoiceApi.md#invoicesNewGet) | **GET** /invoices/new | Create new invoice
*InvoiceApi* | [**invoicesSwitchIdGet**](docs/InvoiceApi.md#invoicesSwitchIdGet) | **GET** /invoices/switch/{id} | Invoice details
*ShopApi* | [**shopsGet**](docs/ShopApi.md#shopsGet) | **GET** /shops | Get shop info by api_key
*TransactionApi* | [**operationsCommissionPsysCidGet**](docs/TransactionApi.md#operationsCommissionPsysCidGet) | **GET** /operations/commission/{psys_cid} | Estimate cryptocurrency fee and Plisio commission
*TransactionApi* | [**operationsFeePlanPsysCidGet**](docs/TransactionApi.md#operationsFeePlanPsysCidGet) | **GET** /operations/fee-plan/{psys_cid} | Get Plisio fee plans
*TransactionApi* | [**operationsFeePsysCidGet**](docs/TransactionApi.md#operationsFeePsysCidGet) | **GET** /operations/fee/{psys_cid} | Estimate fee
*TransactionApi* | [**operationsGet**](docs/TransactionApi.md#operationsGet) | **GET** /operations | List of all user transactions
*TransactionApi* | [**operationsIdGet**](docs/TransactionApi.md#operationsIdGet) | **GET** /operations/{id} | Transaction details
*TransactionApi* | [**operationsWithdrawGet**](docs/TransactionApi.md#operationsWithdrawGet) | **GET** /operations/withdraw | Create new invoice
*WithdrawApi* | [**operationsWithdrawGet**](docs/WithdrawApi.md#operationsWithdrawGet) | **GET** /operations/withdraw | Create new invoice

## Documentation for Models

 - [BalanceApiResponseDto](docs/BalanceApiResponseDto.md)
 - [BalanceResponseDto](docs/BalanceResponseDto.md)
 - [CommissionApiResponseDto](docs/CommissionApiResponseDto.md)
 - [CommissionResponseBoostDto](docs/CommissionResponseBoostDto.md)
 - [CommissionResponseDto](docs/CommissionResponseDto.md)
 - [CommissionResponseSimpleDto](docs/CommissionResponseSimpleDto.md)
 - [CommissionResponseSimpleErrorDto](docs/CommissionResponseSimpleErrorDto.md)
 - [CryptocurrencyApiResponseDto](docs/CryptocurrencyApiResponseDto.md)
 - [DonateBlockDto](docs/DonateBlockDto.md)
 - [DonateDto](docs/DonateDto.md)
 - [ErrorDto](docs/ErrorDto.md)
 - [ErrorResponseDto](docs/ErrorResponseDto.md)
 - [FeeApiResponseDto](docs/FeeApiResponseDto.md)
 - [FeeParamsDto](docs/FeeParamsDto.md)
 - [FeePlanApiResponseDto](docs/FeePlanApiResponseDto.md)
 - [FeePlanBtcDto](docs/FeePlanBtcDto.md)
 - [FeePlanCommonDto](docs/FeePlanCommonDto.md)
 - [FeePlanCustomDto](docs/FeePlanCustomDto.md)
 - [FeePlanDto](docs/FeePlanDto.md)
 - [FeePlanEthDto](docs/FeePlanEthDto.md)
 - [FeePlanLimitsBtcDto](docs/FeePlanLimitsBtcDto.md)
 - [FeePlanLimitsEthDto](docs/FeePlanLimitsEthDto.md)
 - [FeePlanTonDto](docs/FeePlanTonDto.md)
 - [FeePlanTrxDto](docs/FeePlanTrxDto.md)
 - [FeePlanXmrDto](docs/FeePlanXmrDto.md)
 - [FeeResponseDto](docs/FeeResponseDto.md)
 - [FeeSimplePlanDto](docs/FeeSimplePlanDto.md)
 - [FeeSimplePlanItemDto](docs/FeeSimplePlanItemDto.md)
 - [HateoasLinkDto](docs/HateoasLinkDto.md)
 - [HateoasLinksDto](docs/HateoasLinksDto.md)
 - [HateoasMetaDto](docs/HateoasMetaDto.md)
 - [InvoiceCallbackExtendedResponseDto](docs/InvoiceCallbackExtendedResponseDto.md)
 - [InvoiceDetailsApiResponseDto](docs/InvoiceDetailsApiResponseDto.md)
 - [InvoiceDetailsResponseDto](docs/InvoiceDetailsResponseDto.md)
 - [InvoiceExtendedResponseDto](docs/InvoiceExtendedResponseDto.md)
 - [InvoiceFormResponseDto](docs/InvoiceFormResponseDto.md)
 - [InvoicePaysysContractsGroupDto](docs/InvoicePaysysContractsGroupDto.md)
 - [InvoicePaysysDto](docs/InvoicePaysysDto.md)
 - [InvoiceResponseDto](docs/InvoiceResponseDto.md)
 - [InvoiceSimpleResponseDto](docs/InvoiceSimpleResponseDto.md)
 - [InvoiceSwitchApiResponseDto](docs/InvoiceSwitchApiResponseDto.md)
 - [InvoiceUpdateEmailApiResponseDto](docs/InvoiceUpdateEmailApiResponseDto.md)
 - [InvoiceUpdateEmailResponseDto](docs/InvoiceUpdateEmailResponseDto.md)
 - [InvoiceWhiteLabelResponseDto](docs/InvoiceWhiteLabelResponseDto.md)
 - [OperationApiResponseDto](docs/OperationApiResponseDto.md)
 - [OperationDto](docs/OperationDto.md)
 - [OperationParamsDto](docs/OperationParamsDto.md)
 - [OperationSimpleDto](docs/OperationSimpleDto.md)
 - [OperationsApiResponseDto](docs/OperationsApiResponseDto.md)
 - [OperationsHateoasResponseDto](docs/OperationsHateoasResponseDto.md)
 - [PaysysDto](docs/PaysysDto.md)
 - [ShopDto](docs/ShopDto.md)
 - [ShopInfoDto](docs/ShopInfoDto.md)
 - [ShopResponseDto](docs/ShopResponseDto.md)
 - [SuccessResponseDto](docs/SuccessResponseDto.md)
 - [WithdrawApiResponseDto](docs/WithdrawApiResponseDto.md)
 - [WithdrawResponseDto](docs/WithdrawResponseDto.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: URL query string

### view_key

- **Type**: API key
- **API key parameter name**: view_key
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

lead@plisio.net
