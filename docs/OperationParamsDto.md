# OperationParamsDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fee** | [**FeeParamsDto**](FeeParamsDto.md) |  |  [optional]
**orderNumber** | **String** | Invoice order number. Must be unique number in your store for each new store&#x60;s order!!! |  [optional]
**orderName** | **String** | Order name |  [optional]
**description** | **String** | Order description |  [optional]
**sourceAmount** | **String** | Invoice amount in fiat currency |  [optional]
**sourceCurrency** | **String** | Invoice fiat currency |  [optional]
**value** | **String** | fee value |  [optional]
**avatar** | **String** | Custom invoice avatar |  [optional]
**store** | **String** | Custom invoice store name |  [optional]
**currency** | **String** | Code column from https://plisio.net/documentation/appendices/supported-cryptocurrencies |  [optional]
**psysCid** | **String** | ID column from https://plisio.net/documentation/appendices/supported-cryptocurrencies |  [optional]
**amount** | **String** | Invoice amount in selected cryptocurrency |  [optional]
**sourceRate** | **String** | Cryptocurrency rate |  [optional]
**email** | **String** | Email of payer |  [optional]
**donateHash** | **String** | Donation hash |  [optional]
