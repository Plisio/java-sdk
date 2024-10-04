# InvoiceFormResponseDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Plisio’s intertnal ID (copy of txn_id) |  [optional]
**amount** | **String** | Invoice amount in the selected cryptocurrency |  [optional]
**receivedAmount** | **String** | Received and approved amount in the selected cryptocurrency |  [optional]
**pendingAmount** | **String** | Pending (not approve) amount in the selected cryptocurrency |  [optional]
**remainingAmount** | **String** | Remaining amount in the selected cryptocurrency |  [optional]
**walletHash** | **String** | Invoice hash |  [optional]
**psysCid** | **String** | ID column from https://plisio.net/documentation/appendices/supported-cryptocurrencies |  [optional]
**currency** | **String** | Code column from https://plisio.net/documentation/appendices/supported-cryptocurrencies |  [optional]
**sourceCurrency** | **String** | Fiat currency - only USD available for the moment |  [optional]
**sourceRate** | **String** | Exchange rate from the “psys_cid” to the “source_currency” at the moment of transfer |  [optional]
**expectedConfirmations** | **String** | How many confirmations expected to mark invoice completed |  [optional]
**invoiceCommission** | **String** | Plisio commission |  [optional]
**invoiceSum** | **String** | shop pays commission: invoice amount - invoice_commission client pays commission: invoice amount |  [optional]
**invoiceFormResponseDtoInvoiceTotalSum** | **String** | shop pays commission: invoice amount client pays commission: invoice_commission + invoice_sum |  [optional]
**emailAlreadySet** | **Boolean** | If email has been set |  [optional]
**txUrl** | **String** | link to the cryptocurrency block explorer |  [optional]
**txId** | **List&lt;String&gt;** | array of transaction ids |  [optional]
**switchId** | **String** | Initial invoice ID |  [optional]
**paidId** | **String** | ID of invoice that has money |  [optional]
**params** | [**OperationParamsDto**](OperationParamsDto.md) |  |  [optional]
**donateHash** | **String** | Donation hash |  [optional]
**returnUrl** | **String** | Invoice return url |  [optional]
**psysCidUnsupported** | **Boolean** | True when psys_cid not in supported by shop |  [optional]
