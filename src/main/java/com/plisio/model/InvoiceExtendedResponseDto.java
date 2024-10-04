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
import com.plisio.model.InvoiceSimpleResponseDto;
import com.plisio.model.OperationParamsDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InvoiceExtendedResponseDto
 */

public class InvoiceExtendedResponseDto extends InvoiceSimpleResponseDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("received_amount")
  private String receivedAmount = null;

  @SerializedName("pending_amount")
  private String pendingAmount = null;

  @SerializedName("remaining_amount")
  private String remainingAmount = null;

  @SerializedName("wallet_hash")
  private String walletHash = null;

  @SerializedName("psys_cid")
  private String psysCid = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("source_currency")
  private String sourceCurrency = null;

  @SerializedName("source_rate")
  private String sourceRate = null;

  @SerializedName("expected_confirmations")
  private String expectedConfirmations = null;

  @SerializedName("invoice_commission")
  private String invoiceCommission = null;

  @SerializedName("invoice_sum")
  private String invoiceSum = null;

  @SerializedName("invoice_total_sum")
  private String invoiceExtendedResponseDtoInvoiceTotalSum = null;

  @SerializedName("email_already_set")
  private Boolean emailAlreadySet = null;

  @SerializedName("tx_url")
  private String txUrl = null;

  @SerializedName("tx_id")
  private List<String> txId = null;

  @SerializedName("switch_id")
  private String switchId = null;

  @SerializedName("paid_id")
  private String paidId = null;

  @SerializedName("params")
  private OperationParamsDto params = null;

  @SerializedName("view_key")
  private String viewKey = null;

  public InvoiceExtendedResponseDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Plisio’s intertnal ID (copy of txn_id)
   * @return id
  **/
  @Schema(description = "Plisio’s intertnal ID (copy of txn_id)")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InvoiceExtendedResponseDto amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Invoice amount in the selected cryptocurrency
   * @return amount
  **/
  @Schema(description = "Invoice amount in the selected cryptocurrency")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public InvoiceExtendedResponseDto receivedAmount(String receivedAmount) {
    this.receivedAmount = receivedAmount;
    return this;
  }

   /**
   * Received and approved amount in the selected cryptocurrency
   * @return receivedAmount
  **/
  @Schema(description = "Received and approved amount in the selected cryptocurrency")
  public String getReceivedAmount() {
    return receivedAmount;
  }

  public void setReceivedAmount(String receivedAmount) {
    this.receivedAmount = receivedAmount;
  }

  public InvoiceExtendedResponseDto pendingAmount(String pendingAmount) {
    this.pendingAmount = pendingAmount;
    return this;
  }

   /**
   * Pending (not approve) amount in the selected cryptocurrency
   * @return pendingAmount
  **/
  @Schema(description = "Pending (not approve) amount in the selected cryptocurrency")
  public String getPendingAmount() {
    return pendingAmount;
  }

  public void setPendingAmount(String pendingAmount) {
    this.pendingAmount = pendingAmount;
  }

  public InvoiceExtendedResponseDto remainingAmount(String remainingAmount) {
    this.remainingAmount = remainingAmount;
    return this;
  }

   /**
   * Remaining amount in the selected cryptocurrency
   * @return remainingAmount
  **/
  @Schema(description = "Remaining amount in the selected cryptocurrency")
  public String getRemainingAmount() {
    return remainingAmount;
  }

  public void setRemainingAmount(String remainingAmount) {
    this.remainingAmount = remainingAmount;
  }

  public InvoiceExtendedResponseDto walletHash(String walletHash) {
    this.walletHash = walletHash;
    return this;
  }

   /**
   * Invoice hash
   * @return walletHash
  **/
  @Schema(description = "Invoice hash")
  public String getWalletHash() {
    return walletHash;
  }

  public void setWalletHash(String walletHash) {
    this.walletHash = walletHash;
  }

  public InvoiceExtendedResponseDto psysCid(String psysCid) {
    this.psysCid = psysCid;
    return this;
  }

   /**
   * ID column from https://plisio.net/documentation/appendices/supported-cryptocurrencies
   * @return psysCid
  **/
  @Schema(description = "ID column from https://plisio.net/documentation/appendices/supported-cryptocurrencies")
  public String getPsysCid() {
    return psysCid;
  }

  public void setPsysCid(String psysCid) {
    this.psysCid = psysCid;
  }

  public InvoiceExtendedResponseDto currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Code column from https://plisio.net/documentation/appendices/supported-cryptocurrencies
   * @return currency
  **/
  @Schema(description = "Code column from https://plisio.net/documentation/appendices/supported-cryptocurrencies")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public InvoiceExtendedResponseDto sourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
    return this;
  }

   /**
   * Fiat currency - only USD available for the moment
   * @return sourceCurrency
  **/
  @Schema(description = "Fiat currency - only USD available for the moment")
  public String getSourceCurrency() {
    return sourceCurrency;
  }

  public void setSourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
  }

  public InvoiceExtendedResponseDto sourceRate(String sourceRate) {
    this.sourceRate = sourceRate;
    return this;
  }

   /**
   * Exchange rate from the “psys_cid” to the “source_currency” at the moment of transfer
   * @return sourceRate
  **/
  @Schema(description = "Exchange rate from the “psys_cid” to the “source_currency” at the moment of transfer")
  public String getSourceRate() {
    return sourceRate;
  }

  public void setSourceRate(String sourceRate) {
    this.sourceRate = sourceRate;
  }

  public InvoiceExtendedResponseDto expectedConfirmations(String expectedConfirmations) {
    this.expectedConfirmations = expectedConfirmations;
    return this;
  }

   /**
   * How many confirmations expected to mark invoice completed
   * @return expectedConfirmations
  **/
  @Schema(description = "How many confirmations expected to mark invoice completed")
  public String getExpectedConfirmations() {
    return expectedConfirmations;
  }

  public void setExpectedConfirmations(String expectedConfirmations) {
    this.expectedConfirmations = expectedConfirmations;
  }

  public InvoiceExtendedResponseDto invoiceCommission(String invoiceCommission) {
    this.invoiceCommission = invoiceCommission;
    return this;
  }

   /**
   * Plisio commission
   * @return invoiceCommission
  **/
  @Schema(description = "Plisio commission")
  public String getInvoiceCommission() {
    return invoiceCommission;
  }

  public void setInvoiceCommission(String invoiceCommission) {
    this.invoiceCommission = invoiceCommission;
  }

  public InvoiceExtendedResponseDto invoiceSum(String invoiceSum) {
    this.invoiceSum = invoiceSum;
    return this;
  }

   /**
   * shop pays commission: invoice amount - invoice_commission client pays commission: invoice amount
   * @return invoiceSum
  **/
  @Schema(description = "shop pays commission: invoice amount - invoice_commission client pays commission: invoice amount")
  public String getInvoiceSum() {
    return invoiceSum;
  }

  public void setInvoiceSum(String invoiceSum) {
    this.invoiceSum = invoiceSum;
  }

  public InvoiceExtendedResponseDto invoiceExtendedResponseDtoInvoiceTotalSum(String invoiceExtendedResponseDtoInvoiceTotalSum) {
    this.invoiceExtendedResponseDtoInvoiceTotalSum = invoiceExtendedResponseDtoInvoiceTotalSum;
    return this;
  }

   /**
   * shop pays commission: invoice amount client pays commission: invoice_commission + invoice_sum
   * @return invoiceExtendedResponseDtoInvoiceTotalSum
  **/
  @Schema(description = "shop pays commission: invoice amount client pays commission: invoice_commission + invoice_sum")
  public String getInvoiceExtendedResponseDtoInvoiceTotalSum() {
    return invoiceExtendedResponseDtoInvoiceTotalSum;
  }

  public void setInvoiceExtendedResponseDtoInvoiceTotalSum(String invoiceExtendedResponseDtoInvoiceTotalSum) {
    this.invoiceExtendedResponseDtoInvoiceTotalSum = invoiceExtendedResponseDtoInvoiceTotalSum;
  }

  public InvoiceExtendedResponseDto emailAlreadySet(Boolean emailAlreadySet) {
    this.emailAlreadySet = emailAlreadySet;
    return this;
  }

   /**
   * If email has been set
   * @return emailAlreadySet
  **/
  @Schema(description = "If email has been set")
  public Boolean isEmailAlreadySet() {
    return emailAlreadySet;
  }

  public void setEmailAlreadySet(Boolean emailAlreadySet) {
    this.emailAlreadySet = emailAlreadySet;
  }

  public InvoiceExtendedResponseDto txUrl(String txUrl) {
    this.txUrl = txUrl;
    return this;
  }

   /**
   * link to the cryptocurrency block explorer
   * @return txUrl
  **/
  @Schema(description = "link to the cryptocurrency block explorer")
  public String getTxUrl() {
    return txUrl;
  }

  public void setTxUrl(String txUrl) {
    this.txUrl = txUrl;
  }

  public InvoiceExtendedResponseDto txId(List<String> txId) {
    this.txId = txId;
    return this;
  }

  public InvoiceExtendedResponseDto addTxIdItem(String txIdItem) {
    if (this.txId == null) {
      this.txId = new ArrayList<String>();
    }
    this.txId.add(txIdItem);
    return this;
  }

   /**
   * array of transaction ids
   * @return txId
  **/
  @Schema(description = "array of transaction ids")
  public List<String> getTxId() {
    return txId;
  }

  public void setTxId(List<String> txId) {
    this.txId = txId;
  }

  public InvoiceExtendedResponseDto switchId(String switchId) {
    this.switchId = switchId;
    return this;
  }

   /**
   * Initial invoice ID
   * @return switchId
  **/
  @Schema(description = "Initial invoice ID")
  public String getSwitchId() {
    return switchId;
  }

  public void setSwitchId(String switchId) {
    this.switchId = switchId;
  }

  public InvoiceExtendedResponseDto paidId(String paidId) {
    this.paidId = paidId;
    return this;
  }

   /**
   * ID of invoice that has money
   * @return paidId
  **/
  @Schema(description = "ID of invoice that has money")
  public String getPaidId() {
    return paidId;
  }

  public void setPaidId(String paidId) {
    this.paidId = paidId;
  }

  public InvoiceExtendedResponseDto params(OperationParamsDto params) {
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @Schema(description = "")
  public OperationParamsDto getParams() {
    return params;
  }

  public void setParams(OperationParamsDto params) {
    this.params = params;
  }

  public InvoiceExtendedResponseDto viewKey(String viewKey) {
    this.viewKey = viewKey;
    return this;
  }

   /**
   * invoice read-only view key
   * @return viewKey
  **/
  @Schema(description = "invoice read-only view key")
  public String getViewKey() {
    return viewKey;
  }

  public void setViewKey(String viewKey) {
    this.viewKey = viewKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceExtendedResponseDto invoiceExtendedResponseDto = (InvoiceExtendedResponseDto) o;
    return Objects.equals(this.id, invoiceExtendedResponseDto.id) &&
        Objects.equals(this.amount, invoiceExtendedResponseDto.amount) &&
        Objects.equals(this.receivedAmount, invoiceExtendedResponseDto.receivedAmount) &&
        Objects.equals(this.pendingAmount, invoiceExtendedResponseDto.pendingAmount) &&
        Objects.equals(this.remainingAmount, invoiceExtendedResponseDto.remainingAmount) &&
        Objects.equals(this.walletHash, invoiceExtendedResponseDto.walletHash) &&
        Objects.equals(this.psysCid, invoiceExtendedResponseDto.psysCid) &&
        Objects.equals(this.currency, invoiceExtendedResponseDto.currency) &&
        Objects.equals(this.sourceCurrency, invoiceExtendedResponseDto.sourceCurrency) &&
        Objects.equals(this.sourceRate, invoiceExtendedResponseDto.sourceRate) &&
        Objects.equals(this.expectedConfirmations, invoiceExtendedResponseDto.expectedConfirmations) &&
        Objects.equals(this.invoiceCommission, invoiceExtendedResponseDto.invoiceCommission) &&
        Objects.equals(this.invoiceSum, invoiceExtendedResponseDto.invoiceSum) &&
        Objects.equals(this.invoiceExtendedResponseDtoInvoiceTotalSum, invoiceExtendedResponseDto.invoiceExtendedResponseDtoInvoiceTotalSum) &&
        Objects.equals(this.emailAlreadySet, invoiceExtendedResponseDto.emailAlreadySet) &&
        Objects.equals(this.txUrl, invoiceExtendedResponseDto.txUrl) &&
        Objects.equals(this.txId, invoiceExtendedResponseDto.txId) &&
        Objects.equals(this.switchId, invoiceExtendedResponseDto.switchId) &&
        Objects.equals(this.paidId, invoiceExtendedResponseDto.paidId) &&
        Objects.equals(this.params, invoiceExtendedResponseDto.params) &&
        Objects.equals(this.viewKey, invoiceExtendedResponseDto.viewKey) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount, receivedAmount, pendingAmount, remainingAmount, walletHash, psysCid, currency, sourceCurrency, sourceRate, expectedConfirmations, invoiceCommission, invoiceSum, invoiceExtendedResponseDtoInvoiceTotalSum, emailAlreadySet, txUrl, txId, switchId, paidId, params, viewKey, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceExtendedResponseDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    receivedAmount: ").append(toIndentedString(receivedAmount)).append("\n");
    sb.append("    pendingAmount: ").append(toIndentedString(pendingAmount)).append("\n");
    sb.append("    remainingAmount: ").append(toIndentedString(remainingAmount)).append("\n");
    sb.append("    walletHash: ").append(toIndentedString(walletHash)).append("\n");
    sb.append("    psysCid: ").append(toIndentedString(psysCid)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
    sb.append("    sourceRate: ").append(toIndentedString(sourceRate)).append("\n");
    sb.append("    expectedConfirmations: ").append(toIndentedString(expectedConfirmations)).append("\n");
    sb.append("    invoiceCommission: ").append(toIndentedString(invoiceCommission)).append("\n");
    sb.append("    invoiceSum: ").append(toIndentedString(invoiceSum)).append("\n");
    sb.append("    invoiceExtendedResponseDtoInvoiceTotalSum: ").append(toIndentedString(invoiceExtendedResponseDtoInvoiceTotalSum)).append("\n");
    sb.append("    emailAlreadySet: ").append(toIndentedString(emailAlreadySet)).append("\n");
    sb.append("    txUrl: ").append(toIndentedString(txUrl)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    switchId: ").append(toIndentedString(switchId)).append("\n");
    sb.append("    paidId: ").append(toIndentedString(paidId)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    viewKey: ").append(toIndentedString(viewKey)).append("\n");
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
