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
import com.plisio.model.InvoiceExtendedResponseDto;
import com.plisio.model.OperationParamsDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
/**
 * InvoiceCallbackExtendedResponseDto
 */

public class InvoiceCallbackExtendedResponseDto extends InvoiceExtendedResponseDto {
  @SerializedName("amount")
  private String invoiceCallbackExtendedResponseDtoAmount = null;

  @SerializedName("pending_amount")
  private String invoiceCallbackExtendedResponseDtoPendingAmount = null;

  @SerializedName("wallet_hash")
  private String invoiceCallbackExtendedResponseDtoWalletHash = null;

  @SerializedName("psys_cid")
  private String invoiceCallbackExtendedResponseDtoPsysCid = null;

  @SerializedName("currency")
  private String invoiceCallbackExtendedResponseDtoCurrency = null;

  @SerializedName("source_currency")
  private String invoiceCallbackExtendedResponseDtoSourceCurrency = null;

  @SerializedName("source_rate")
  private String invoiceCallbackExtendedResponseDtoSourceRate = null;

  @SerializedName("expected_confirmations")
  private String invoiceCallbackExtendedResponseDtoExpectedConfirmations = null;

  @SerializedName("qr_code")
  private String qrCode = null;

  @SerializedName("verify_hash")
  private String verifyHash = null;

  @SerializedName("invoice_commission")
  private String invoiceCallbackExtendedResponseDtoInvoiceCommission = null;

  @SerializedName("invoice_sum")
  private String invoiceCallbackExtendedResponseDtoInvoiceSum = null;

  @SerializedName("invoice_total_sum")
  private String invoiceCallbackExtendedResponseDtoInvoiceTotalSum = null;

  public InvoiceCallbackExtendedResponseDto invoiceCallbackExtendedResponseDtoAmount(String invoiceCallbackExtendedResponseDtoAmount) {
    this.invoiceCallbackExtendedResponseDtoAmount = invoiceCallbackExtendedResponseDtoAmount;
    return this;
  }

   /**
   * Invoice amount in the selected cryptocurrency
   * @return invoiceCallbackExtendedResponseDtoAmount
  **/
  @Schema(description = "Invoice amount in the selected cryptocurrency")
  public String getInvoiceCallbackExtendedResponseDtoAmount() {
    return invoiceCallbackExtendedResponseDtoAmount;
  }

  public void setInvoiceCallbackExtendedResponseDtoAmount(String invoiceCallbackExtendedResponseDtoAmount) {
    this.invoiceCallbackExtendedResponseDtoAmount = invoiceCallbackExtendedResponseDtoAmount;
  }

  public InvoiceCallbackExtendedResponseDto invoiceCallbackExtendedResponseDtoPendingAmount(String invoiceCallbackExtendedResponseDtoPendingAmount) {
    this.invoiceCallbackExtendedResponseDtoPendingAmount = invoiceCallbackExtendedResponseDtoPendingAmount;
    return this;
  }

   /**
   * Remained amount in the selected cryptocurrency
   * @return invoiceCallbackExtendedResponseDtoPendingAmount
  **/
  @Schema(description = "Remained amount in the selected cryptocurrency")
  public String getInvoiceCallbackExtendedResponseDtoPendingAmount() {
    return invoiceCallbackExtendedResponseDtoPendingAmount;
  }

  public void setInvoiceCallbackExtendedResponseDtoPendingAmount(String invoiceCallbackExtendedResponseDtoPendingAmount) {
    this.invoiceCallbackExtendedResponseDtoPendingAmount = invoiceCallbackExtendedResponseDtoPendingAmount;
  }

  public InvoiceCallbackExtendedResponseDto invoiceCallbackExtendedResponseDtoWalletHash(String invoiceCallbackExtendedResponseDtoWalletHash) {
    this.invoiceCallbackExtendedResponseDtoWalletHash = invoiceCallbackExtendedResponseDtoWalletHash;
    return this;
  }

   /**
   * Invoice hash
   * @return invoiceCallbackExtendedResponseDtoWalletHash
  **/
  @Schema(description = "Invoice hash")
  public String getInvoiceCallbackExtendedResponseDtoWalletHash() {
    return invoiceCallbackExtendedResponseDtoWalletHash;
  }

  public void setInvoiceCallbackExtendedResponseDtoWalletHash(String invoiceCallbackExtendedResponseDtoWalletHash) {
    this.invoiceCallbackExtendedResponseDtoWalletHash = invoiceCallbackExtendedResponseDtoWalletHash;
  }

  public InvoiceCallbackExtendedResponseDto invoiceCallbackExtendedResponseDtoPsysCid(String invoiceCallbackExtendedResponseDtoPsysCid) {
    this.invoiceCallbackExtendedResponseDtoPsysCid = invoiceCallbackExtendedResponseDtoPsysCid;
    return this;
  }

   /**
   * ID column from https://plisio.net/documentation/appendices/supported-cryptocurrencies
   * @return invoiceCallbackExtendedResponseDtoPsysCid
  **/
  @Schema(description = "ID column from https://plisio.net/documentation/appendices/supported-cryptocurrencies")
  public String getInvoiceCallbackExtendedResponseDtoPsysCid() {
    return invoiceCallbackExtendedResponseDtoPsysCid;
  }

  public void setInvoiceCallbackExtendedResponseDtoPsysCid(String invoiceCallbackExtendedResponseDtoPsysCid) {
    this.invoiceCallbackExtendedResponseDtoPsysCid = invoiceCallbackExtendedResponseDtoPsysCid;
  }

  public InvoiceCallbackExtendedResponseDto invoiceCallbackExtendedResponseDtoCurrency(String invoiceCallbackExtendedResponseDtoCurrency) {
    this.invoiceCallbackExtendedResponseDtoCurrency = invoiceCallbackExtendedResponseDtoCurrency;
    return this;
  }

   /**
   * Code column from https://plisio.net/documentation/appendices/supported-cryptocurrencies
   * @return invoiceCallbackExtendedResponseDtoCurrency
  **/
  @Schema(description = "Code column from https://plisio.net/documentation/appendices/supported-cryptocurrencies")
  public String getInvoiceCallbackExtendedResponseDtoCurrency() {
    return invoiceCallbackExtendedResponseDtoCurrency;
  }

  public void setInvoiceCallbackExtendedResponseDtoCurrency(String invoiceCallbackExtendedResponseDtoCurrency) {
    this.invoiceCallbackExtendedResponseDtoCurrency = invoiceCallbackExtendedResponseDtoCurrency;
  }

  public InvoiceCallbackExtendedResponseDto invoiceCallbackExtendedResponseDtoSourceCurrency(String invoiceCallbackExtendedResponseDtoSourceCurrency) {
    this.invoiceCallbackExtendedResponseDtoSourceCurrency = invoiceCallbackExtendedResponseDtoSourceCurrency;
    return this;
  }

   /**
   * Fiat currency - only USD available for the moment
   * @return invoiceCallbackExtendedResponseDtoSourceCurrency
  **/
  @Schema(description = "Fiat currency - only USD available for the moment")
  public String getInvoiceCallbackExtendedResponseDtoSourceCurrency() {
    return invoiceCallbackExtendedResponseDtoSourceCurrency;
  }

  public void setInvoiceCallbackExtendedResponseDtoSourceCurrency(String invoiceCallbackExtendedResponseDtoSourceCurrency) {
    this.invoiceCallbackExtendedResponseDtoSourceCurrency = invoiceCallbackExtendedResponseDtoSourceCurrency;
  }

  public InvoiceCallbackExtendedResponseDto invoiceCallbackExtendedResponseDtoSourceRate(String invoiceCallbackExtendedResponseDtoSourceRate) {
    this.invoiceCallbackExtendedResponseDtoSourceRate = invoiceCallbackExtendedResponseDtoSourceRate;
    return this;
  }

   /**
   * Exchange rate from the “psys_cid” to the “source_currency” at the moment of transfer
   * @return invoiceCallbackExtendedResponseDtoSourceRate
  **/
  @Schema(description = "Exchange rate from the “psys_cid” to the “source_currency” at the moment of transfer")
  public String getInvoiceCallbackExtendedResponseDtoSourceRate() {
    return invoiceCallbackExtendedResponseDtoSourceRate;
  }

  public void setInvoiceCallbackExtendedResponseDtoSourceRate(String invoiceCallbackExtendedResponseDtoSourceRate) {
    this.invoiceCallbackExtendedResponseDtoSourceRate = invoiceCallbackExtendedResponseDtoSourceRate;
  }

  public InvoiceCallbackExtendedResponseDto invoiceCallbackExtendedResponseDtoExpectedConfirmations(String invoiceCallbackExtendedResponseDtoExpectedConfirmations) {
    this.invoiceCallbackExtendedResponseDtoExpectedConfirmations = invoiceCallbackExtendedResponseDtoExpectedConfirmations;
    return this;
  }

   /**
   * How many confirmations expected to mark invoice completed
   * @return invoiceCallbackExtendedResponseDtoExpectedConfirmations
  **/
  @Schema(description = "How many confirmations expected to mark invoice completed")
  public String getInvoiceCallbackExtendedResponseDtoExpectedConfirmations() {
    return invoiceCallbackExtendedResponseDtoExpectedConfirmations;
  }

  public void setInvoiceCallbackExtendedResponseDtoExpectedConfirmations(String invoiceCallbackExtendedResponseDtoExpectedConfirmations) {
    this.invoiceCallbackExtendedResponseDtoExpectedConfirmations = invoiceCallbackExtendedResponseDtoExpectedConfirmations;
  }

  public InvoiceCallbackExtendedResponseDto qrCode(String qrCode) {
    this.qrCode = qrCode;
    return this;
  }

   /**
   * QR code image in base64 format
   * @return qrCode
  **/
  @Schema(description = "QR code image in base64 format")
  public String getQrCode() {
    return qrCode;
  }

  public void setQrCode(String qrCode) {
    this.qrCode = qrCode;
  }

  public InvoiceCallbackExtendedResponseDto verifyHash(String verifyHash) {
    this.verifyHash = verifyHash;
    return this;
  }

   /**
   * Hash to verify the “POST” data signed with your SHOP_API_KEY
   * @return verifyHash
  **/
  @Schema(description = "Hash to verify the “POST” data signed with your SHOP_API_KEY")
  public String getVerifyHash() {
    return verifyHash;
  }

  public void setVerifyHash(String verifyHash) {
    this.verifyHash = verifyHash;
  }

  public InvoiceCallbackExtendedResponseDto invoiceCallbackExtendedResponseDtoInvoiceCommission(String invoiceCallbackExtendedResponseDtoInvoiceCommission) {
    this.invoiceCallbackExtendedResponseDtoInvoiceCommission = invoiceCallbackExtendedResponseDtoInvoiceCommission;
    return this;
  }

   /**
   * Plisio commission
   * @return invoiceCallbackExtendedResponseDtoInvoiceCommission
  **/
  @Schema(description = "Plisio commission")
  public String getInvoiceCallbackExtendedResponseDtoInvoiceCommission() {
    return invoiceCallbackExtendedResponseDtoInvoiceCommission;
  }

  public void setInvoiceCallbackExtendedResponseDtoInvoiceCommission(String invoiceCallbackExtendedResponseDtoInvoiceCommission) {
    this.invoiceCallbackExtendedResponseDtoInvoiceCommission = invoiceCallbackExtendedResponseDtoInvoiceCommission;
  }

  public InvoiceCallbackExtendedResponseDto invoiceCallbackExtendedResponseDtoInvoiceSum(String invoiceCallbackExtendedResponseDtoInvoiceSum) {
    this.invoiceCallbackExtendedResponseDtoInvoiceSum = invoiceCallbackExtendedResponseDtoInvoiceSum;
    return this;
  }

   /**
   * shop pays commission: invoice amount - invoice_commission client pays commission: invoice amount
   * @return invoiceCallbackExtendedResponseDtoInvoiceSum
  **/
  @Schema(description = "shop pays commission: invoice amount - invoice_commission client pays commission: invoice amount")
  public String getInvoiceCallbackExtendedResponseDtoInvoiceSum() {
    return invoiceCallbackExtendedResponseDtoInvoiceSum;
  }

  public void setInvoiceCallbackExtendedResponseDtoInvoiceSum(String invoiceCallbackExtendedResponseDtoInvoiceSum) {
    this.invoiceCallbackExtendedResponseDtoInvoiceSum = invoiceCallbackExtendedResponseDtoInvoiceSum;
  }

  public InvoiceCallbackExtendedResponseDto invoiceCallbackExtendedResponseDtoInvoiceTotalSum(String invoiceCallbackExtendedResponseDtoInvoiceTotalSum) {
    this.invoiceCallbackExtendedResponseDtoInvoiceTotalSum = invoiceCallbackExtendedResponseDtoInvoiceTotalSum;
    return this;
  }

   /**
   * shop pays commission: invoice amount client pays commission: invoice_commission + invoice_sum
   * @return invoiceCallbackExtendedResponseDtoInvoiceTotalSum
  **/
  @Schema(description = "shop pays commission: invoice amount client pays commission: invoice_commission + invoice_sum")
  public String getInvoiceCallbackExtendedResponseDtoInvoiceTotalSum() {
    return invoiceCallbackExtendedResponseDtoInvoiceTotalSum;
  }

  public void setInvoiceCallbackExtendedResponseDtoInvoiceTotalSum(String invoiceCallbackExtendedResponseDtoInvoiceTotalSum) {
    this.invoiceCallbackExtendedResponseDtoInvoiceTotalSum = invoiceCallbackExtendedResponseDtoInvoiceTotalSum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceCallbackExtendedResponseDto invoiceCallbackExtendedResponseDto = (InvoiceCallbackExtendedResponseDto) o;
    return Objects.equals(this.invoiceCallbackExtendedResponseDtoAmount, invoiceCallbackExtendedResponseDto.invoiceCallbackExtendedResponseDtoAmount) &&
        Objects.equals(this.invoiceCallbackExtendedResponseDtoPendingAmount, invoiceCallbackExtendedResponseDto.invoiceCallbackExtendedResponseDtoPendingAmount) &&
        Objects.equals(this.invoiceCallbackExtendedResponseDtoWalletHash, invoiceCallbackExtendedResponseDto.invoiceCallbackExtendedResponseDtoWalletHash) &&
        Objects.equals(this.invoiceCallbackExtendedResponseDtoPsysCid, invoiceCallbackExtendedResponseDto.invoiceCallbackExtendedResponseDtoPsysCid) &&
        Objects.equals(this.invoiceCallbackExtendedResponseDtoCurrency, invoiceCallbackExtendedResponseDto.invoiceCallbackExtendedResponseDtoCurrency) &&
        Objects.equals(this.invoiceCallbackExtendedResponseDtoSourceCurrency, invoiceCallbackExtendedResponseDto.invoiceCallbackExtendedResponseDtoSourceCurrency) &&
        Objects.equals(this.invoiceCallbackExtendedResponseDtoSourceRate, invoiceCallbackExtendedResponseDto.invoiceCallbackExtendedResponseDtoSourceRate) &&
        Objects.equals(this.invoiceCallbackExtendedResponseDtoExpectedConfirmations, invoiceCallbackExtendedResponseDto.invoiceCallbackExtendedResponseDtoExpectedConfirmations) &&
        Objects.equals(this.qrCode, invoiceCallbackExtendedResponseDto.qrCode) &&
        Objects.equals(this.verifyHash, invoiceCallbackExtendedResponseDto.verifyHash) &&
        Objects.equals(this.invoiceCallbackExtendedResponseDtoInvoiceCommission, invoiceCallbackExtendedResponseDto.invoiceCallbackExtendedResponseDtoInvoiceCommission) &&
        Objects.equals(this.invoiceCallbackExtendedResponseDtoInvoiceSum, invoiceCallbackExtendedResponseDto.invoiceCallbackExtendedResponseDtoInvoiceSum) &&
        Objects.equals(this.invoiceCallbackExtendedResponseDtoInvoiceTotalSum, invoiceCallbackExtendedResponseDto.invoiceCallbackExtendedResponseDtoInvoiceTotalSum) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceCallbackExtendedResponseDtoAmount, invoiceCallbackExtendedResponseDtoPendingAmount, invoiceCallbackExtendedResponseDtoWalletHash, invoiceCallbackExtendedResponseDtoPsysCid, invoiceCallbackExtendedResponseDtoCurrency, invoiceCallbackExtendedResponseDtoSourceCurrency, invoiceCallbackExtendedResponseDtoSourceRate, invoiceCallbackExtendedResponseDtoExpectedConfirmations, qrCode, verifyHash, invoiceCallbackExtendedResponseDtoInvoiceCommission, invoiceCallbackExtendedResponseDtoInvoiceSum, invoiceCallbackExtendedResponseDtoInvoiceTotalSum, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceCallbackExtendedResponseDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    invoiceCallbackExtendedResponseDtoAmount: ").append(toIndentedString(invoiceCallbackExtendedResponseDtoAmount)).append("\n");
    sb.append("    invoiceCallbackExtendedResponseDtoPendingAmount: ").append(toIndentedString(invoiceCallbackExtendedResponseDtoPendingAmount)).append("\n");
    sb.append("    invoiceCallbackExtendedResponseDtoWalletHash: ").append(toIndentedString(invoiceCallbackExtendedResponseDtoWalletHash)).append("\n");
    sb.append("    invoiceCallbackExtendedResponseDtoPsysCid: ").append(toIndentedString(invoiceCallbackExtendedResponseDtoPsysCid)).append("\n");
    sb.append("    invoiceCallbackExtendedResponseDtoCurrency: ").append(toIndentedString(invoiceCallbackExtendedResponseDtoCurrency)).append("\n");
    sb.append("    invoiceCallbackExtendedResponseDtoSourceCurrency: ").append(toIndentedString(invoiceCallbackExtendedResponseDtoSourceCurrency)).append("\n");
    sb.append("    invoiceCallbackExtendedResponseDtoSourceRate: ").append(toIndentedString(invoiceCallbackExtendedResponseDtoSourceRate)).append("\n");
    sb.append("    invoiceCallbackExtendedResponseDtoExpectedConfirmations: ").append(toIndentedString(invoiceCallbackExtendedResponseDtoExpectedConfirmations)).append("\n");
    sb.append("    qrCode: ").append(toIndentedString(qrCode)).append("\n");
    sb.append("    verifyHash: ").append(toIndentedString(verifyHash)).append("\n");
    sb.append("    invoiceCallbackExtendedResponseDtoInvoiceCommission: ").append(toIndentedString(invoiceCallbackExtendedResponseDtoInvoiceCommission)).append("\n");
    sb.append("    invoiceCallbackExtendedResponseDtoInvoiceSum: ").append(toIndentedString(invoiceCallbackExtendedResponseDtoInvoiceSum)).append("\n");
    sb.append("    invoiceCallbackExtendedResponseDtoInvoiceTotalSum: ").append(toIndentedString(invoiceCallbackExtendedResponseDtoInvoiceTotalSum)).append("\n");
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
