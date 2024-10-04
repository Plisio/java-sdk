# InvoiceDetailsResponseDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invoice** | [**InvoiceExtendedResponseDto**](InvoiceExtendedResponseDto.md) |  |  [optional]
**activeInvoiceId** | **String** | Current active invoice ID. Invoice ID with the last selected cryptocurrency |  [optional]
**shop** | [**ShopInfoDto**](ShopInfoDto.md) |  |  [optional]
**paysys** | [**InvoicePaysysDto**](InvoicePaysysDto.md) |  |  [optional]
**allowedPsysCids** | [**List&lt;InvoicePaysysDto&gt;**](InvoicePaysysDto.md) | Allowed cryptocurrencies for select |  [optional]
