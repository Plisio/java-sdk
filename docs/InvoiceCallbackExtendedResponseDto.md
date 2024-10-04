# InvoiceCallbackExtendedResponseDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invoiceCallbackExtendedResponseDtoAmount** | **String** | Invoice amount in the selected cryptocurrency |  [optional]
**invoiceCallbackExtendedResponseDtoPendingAmount** | **String** | Remained amount in the selected cryptocurrency |  [optional]
**invoiceCallbackExtendedResponseDtoWalletHash** | **String** | Invoice hash |  [optional]
**invoiceCallbackExtendedResponseDtoPsysCid** | **String** | ID column from https://plisio.net/documentation/appendices/supported-cryptocurrencies |  [optional]
**invoiceCallbackExtendedResponseDtoCurrency** | **String** | Code column from https://plisio.net/documentation/appendices/supported-cryptocurrencies |  [optional]
**invoiceCallbackExtendedResponseDtoSourceCurrency** | **String** | Fiat currency - only USD available for the moment |  [optional]
**invoiceCallbackExtendedResponseDtoSourceRate** | **String** | Exchange rate from the “psys_cid” to the “source_currency” at the moment of transfer |  [optional]
**invoiceCallbackExtendedResponseDtoExpectedConfirmations** | **String** | How many confirmations expected to mark invoice completed |  [optional]
**qrCode** | **String** | QR code image in base64 format |  [optional]
**verifyHash** | **String** | Hash to verify the “POST” data signed with your SHOP_API_KEY |  [optional]
**invoiceCallbackExtendedResponseDtoInvoiceCommission** | **String** | Plisio commission |  [optional]
**invoiceCallbackExtendedResponseDtoInvoiceSum** | **String** | shop pays commission: invoice amount - invoice_commission client pays commission: invoice amount |  [optional]
**invoiceCallbackExtendedResponseDtoInvoiceTotalSum** | **String** | shop pays commission: invoice amount client pays commission: invoice_commission + invoice_sum |  [optional]
