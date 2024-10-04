# FeePlanLimitsBtcDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**plan** | **String** | Plan name: normal, priority or custom |  [optional]
**value** | **String** | Fee value |  [optional]
**unit** | [**BigDecimal**](BigDecimal.md) | Fee unit |  [optional]
**confTarget** | [**BigDecimal**](BigDecimal.md) | estimate fee to be included into next &#x27;conf_target&#x27; block(s) |  [optional]
**feerate** | [**BigDecimal**](BigDecimal.md) | Fee rate in BTC/Kb |  [optional]
**satB** | [**BigDecimal**](BigDecimal.md) | Fee rate in sat/byte |  [optional]
**dynamicValues** | **String** | Name of dynamic property name (ex: sat_b) |  [optional]
