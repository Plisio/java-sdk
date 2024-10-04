# CommissionResponseSimpleDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commission** | **String** | Plisio commission value |  [optional]
**fee** | **String** | Cryptocurrency fee value |  [optional]
**feeUnit** | **String** | Cryptocurrency feeUnit value |  [optional]
**feeFiat** | **String** | Cryptocurrency fee value in selected fiat currency |  [optional]
**feeFiatUnit** | **String** | Selected fiat currency |  [optional]
**maxAmount** | **String** | Maximum allowed amount to withdrawal |  [optional]
**plan** | **String** | Plisio&#x27;s cryptocurrency fee estimation plan |  [optional]
**useWallet** | **String** | Pay fee from wallet |  [optional]
**useWalletBalance** | **String** | Balance of wallet that will be used to pay fee |  [optional]
**plans** | [**FeeSimplePlanDto**](FeeSimplePlanDto.md) |  |  [optional]
**custom** | [**List&lt;FeePlanCustomDto&gt;**](FeePlanCustomDto.md) | Cryptocurrency fee limits |  [optional]
**errors** | [**List&lt;CommissionResponseSimpleErrorDto&gt;**](CommissionResponseSimpleErrorDto.md) |  |  [optional]
**customFeeRate** | **Float** |  |  [optional]
