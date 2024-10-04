/*
 * Plisio API
 * Plisio payment gateway API
 *
 * Contact: lead@plisio.net
 *
 */

package com.plisio.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InvoiceSimpleResponseDto
 */

public class InvoiceSimpleResponseDto {
  @SerializedName("txn_id")
  private String txnId = null;

  @SerializedName("invoice_url")
  private String invoiceUrl = null;

  @SerializedName("invoice_total_sum")
  private String invoiceTotalSum = null;

  public InvoiceSimpleResponseDto txnId(String txnId) {
    this.txnId = txnId;
    return this;
  }

   /**
   * Plisio’s intertnal ID
   * @return txnId
  **/
  @Schema(description = "Plisio’s intertnal ID")
  public String getTxnId() {
    return txnId;
  }

  public void setTxnId(String txnId) {
    this.txnId = txnId;
  }

  public InvoiceSimpleResponseDto invoiceUrl(String invoiceUrl) {
    this.invoiceUrl = invoiceUrl;
    return this;
  }

   /**
   * Invoice URL
   * @return invoiceUrl
  **/
  @Schema(description = "Invoice URL")
  public String getInvoiceUrl() {
    return invoiceUrl;
  }

  public void setInvoiceUrl(String invoiceUrl) {
    this.invoiceUrl = invoiceUrl;
  }

  public InvoiceSimpleResponseDto invoiceTotalSum(String invoiceTotalSum) {
    this.invoiceTotalSum = invoiceTotalSum;
    return this;
  }

   /**
   * shop pays commission: invoice amount client pays commission: invoice_commission + invoice_sum
   * @return invoiceTotalSum
  **/
  @Schema(description = "shop pays commission: invoice amount client pays commission: invoice_commission + invoice_sum")
  public String getInvoiceTotalSum() {
    return invoiceTotalSum;
  }

  public void setInvoiceTotalSum(String invoiceTotalSum) {
    this.invoiceTotalSum = invoiceTotalSum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceSimpleResponseDto invoiceSimpleResponseDto = (InvoiceSimpleResponseDto) o;
    return Objects.equals(this.txnId, invoiceSimpleResponseDto.txnId) &&
        Objects.equals(this.invoiceUrl, invoiceSimpleResponseDto.invoiceUrl) &&
        Objects.equals(this.invoiceTotalSum, invoiceSimpleResponseDto.invoiceTotalSum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txnId, invoiceUrl, invoiceTotalSum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceSimpleResponseDto {\n");
    
    sb.append("    txnId: ").append(toIndentedString(txnId)).append("\n");
    sb.append("    invoiceUrl: ").append(toIndentedString(invoiceUrl)).append("\n");
    sb.append("    invoiceTotalSum: ").append(toIndentedString(invoiceTotalSum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
