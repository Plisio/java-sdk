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
import com.plisio.model.OperationParamsDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * OperationDto
 */

public class OperationDto {
  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("shop_id")
  private String shopId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("pending_sum")
  private String pendingSum = null;

  @SerializedName("psys_cid")
  private String psysCid = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("source_currency")
  private String sourceCurrency = null;

  @SerializedName("source_rate")
  private String sourceRate = null;

  @SerializedName("fee")
  private String fee = null;

  @SerializedName("wallet_hash")
  private String walletHash = null;

  @SerializedName("sendmany")
  private List<String> sendmany = null;

  @SerializedName("params")
  private OperationParamsDto params = null;

  @SerializedName("expire_at_utc")
  private Integer expireAtUtc = null;

  @SerializedName("created_at_utc")
  private Integer createdAtUtc = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("sum")
  private String sum = null;

  @SerializedName("commission")
  private String commission = null;

  @SerializedName("tx_url")
  private String txUrl = null;

  @SerializedName("tx_id")
  private List<String> txId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("actual_sum")
  private String actualSum = null;

  @SerializedName("actual_commission")
  private String actualCommission = null;

  @SerializedName("actual_fee")
  private String actualFee = null;

  @SerializedName("actual_invoice_sum")
  private String actualInvoiceSum = null;

  @SerializedName("tx")
  private List<Object> tx = null;

  @SerializedName("confirmations")
  private Integer confirmations = null;

  @SerializedName("status_code")
  private Integer statusCode = null;

  @SerializedName("parent_id")
  private String parentId = null;

  public OperationDto userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Profile ID
   * @return userId
  **/
  @Schema(description = "Profile ID")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public OperationDto shopId(String shopId) {
    this.shopId = shopId;
    return this;
  }

   /**
   * Shop ID
   * @return shopId
  **/
  @Schema(description = "Shop ID")
  public String getShopId() {
    return shopId;
  }

  public void setShopId(String shopId) {
    this.shopId = shopId;
  }

  public OperationDto type(String type) {
    this.type = type;
    return this;
  }

   /**
   * cash_in, cash_out, mass_cash_out, invoice
   * @return type
  **/
  @Schema(description = "cash_in, cash_out, mass_cash_out, invoice")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OperationDto status(String status) {
    this.status = status;
    return this;
  }

   /**
   * pending, completed, error, new, expired, mismatch, cancelled
   * @return status
  **/
  @Schema(description = "pending, completed, error, new, expired, mismatch, cancelled")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OperationDto pendingSum(String pendingSum) {
    this.pendingSum = pendingSum;
    return this;
  }

   /**
   * unconfirmed amount (mempool)
   * @return pendingSum
  **/
  @Schema(description = "unconfirmed amount (mempool)")
  public String getPendingSum() {
    return pendingSum;
  }

  public void setPendingSum(String pendingSum) {
    this.pendingSum = pendingSum;
  }

  public OperationDto psysCid(String psysCid) {
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

  public OperationDto currency(String currency) {
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

  public OperationDto sourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
    return this;
  }

   /**
   * fiat currency - USD by default or source_currency was set
   * @return sourceCurrency
  **/
  @Schema(description = "fiat currency - USD by default or source_currency was set")
  public String getSourceCurrency() {
    return sourceCurrency;
  }

  public void setSourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
  }

  public OperationDto sourceRate(String sourceRate) {
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

  public OperationDto fee(String fee) {
    this.fee = fee;
    return this;
  }

   /**
   * transaction fee stated in the transfer
   * @return fee
  **/
  @Schema(description = "transaction fee stated in the transfer")
  public String getFee() {
    return fee;
  }

  public void setFee(String fee) {
    this.fee = fee;
  }

  public OperationDto walletHash(String walletHash) {
    this.walletHash = walletHash;
    return this;
  }

   /**
   * destination hash (type&#x3D;cash_out) or invoice hash
   * @return walletHash
  **/
  @Schema(description = "destination hash (type=cash_out) or invoice hash")
  public String getWalletHash() {
    return walletHash;
  }

  public void setWalletHash(String walletHash) {
    this.walletHash = walletHash;
  }

  public OperationDto sendmany(List<String> sendmany) {
    this.sendmany = sendmany;
    return this;
  }

  public OperationDto addSendmanyItem(String sendmanyItem) {
    if (this.sendmany == null) {
      this.sendmany = new ArrayList<String>();
    }
    this.sendmany.add(sendmanyItem);
    return this;
  }

   /**
   * Pairs of hashes and values (type&#x3D;mass_cash_out)
   * @return sendmany
  **/
  @Schema(description = "Pairs of hashes and values (type=mass_cash_out)")
  public List<String> getSendmany() {
    return sendmany;
  }

  public void setSendmany(List<String> sendmany) {
    this.sendmany = sendmany;
  }

  public OperationDto params(OperationParamsDto params) {
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

  public OperationDto expireAtUtc(Integer expireAtUtc) {
    this.expireAtUtc = expireAtUtc;
    return this;
  }

   /**
   * timestamp in UTC timezone; it may need to be divided by 1000
   * @return expireAtUtc
  **/
  @Schema(description = "timestamp in UTC timezone; it may need to be divided by 1000")
  public Integer getExpireAtUtc() {
    return expireAtUtc;
  }

  public void setExpireAtUtc(Integer expireAtUtc) {
    this.expireAtUtc = expireAtUtc;
  }

  public OperationDto createdAtUtc(Integer createdAtUtc) {
    this.createdAtUtc = createdAtUtc;
    return this;
  }

   /**
   * timestamp in the UTC timezone; it may need to be divided by 1000
   * @return createdAtUtc
  **/
  @Schema(description = "timestamp in the UTC timezone; it may need to be divided by 1000")
  public Integer getCreatedAtUtc() {
    return createdAtUtc;
  }

  public void setCreatedAtUtc(Integer createdAtUtc) {
    this.createdAtUtc = createdAtUtc;
  }

  public OperationDto amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * amount received/transferred by an operation (invoice, cash-in/cash-out)
   * @return amount
  **/
  @Schema(description = "amount received/transferred by an operation (invoice, cash-in/cash-out)")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public OperationDto sum(String sum) {
    this.sum = sum;
    return this;
  }

   /**
   * Invoice: params.amount + Plisio commission (if customer pays commission) or params.amount (if merchant pays commission) Cash-out: transfer amount + network fee Cash-in: received amount
   * @return sum
  **/
  @Schema(description = "Invoice: params.amount + Plisio commission (if customer pays commission) or params.amount (if merchant pays commission) Cash-out: transfer amount + network fee Cash-in: received amount")
  public String getSum() {
    return sum;
  }

  public void setSum(String sum) {
    this.sum = sum;
  }

  public OperationDto commission(String commission) {
    this.commission = commission;
    return this;
  }

   /**
   * Plisio commission
   * @return commission
  **/
  @Schema(description = "Plisio commission")
  public String getCommission() {
    return commission;
  }

  public void setCommission(String commission) {
    this.commission = commission;
  }

  public OperationDto txUrl(String txUrl) {
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

  public OperationDto txId(List<String> txId) {
    this.txId = txId;
    return this;
  }

  public OperationDto addTxIdItem(String txIdItem) {
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

  public OperationDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * internal Plisio operation ID
   * @return id
  **/
  @Schema(description = "internal Plisio operation ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OperationDto actualSum(String actualSum) {
    this.actualSum = actualSum;
    return this;
  }

   /**
   * Real incoming amount
   * @return actualSum
  **/
  @Schema(description = "Real incoming amount")
  public String getActualSum() {
    return actualSum;
  }

  public void setActualSum(String actualSum) {
    this.actualSum = actualSum;
  }

  public OperationDto actualCommission(String actualCommission) {
    this.actualCommission = actualCommission;
    return this;
  }

   /**
   * Plisio commission taken
   * @return actualCommission
  **/
  @Schema(description = "Plisio commission taken")
  public String getActualCommission() {
    return actualCommission;
  }

  public void setActualCommission(String actualCommission) {
    this.actualCommission = actualCommission;
  }

  public OperationDto actualFee(String actualFee) {
    this.actualFee = actualFee;
    return this;
  }

   /**
   * Network fee (move invoice to wallet)
   * @return actualFee
  **/
  @Schema(description = "Network fee (move invoice to wallet)")
  public String getActualFee() {
    return actualFee;
  }

  public void setActualFee(String actualFee) {
    this.actualFee = actualFee;
  }

  public OperationDto actualInvoiceSum(String actualInvoiceSum) {
    this.actualInvoiceSum = actualInvoiceSum;
    return this;
  }

   /**
   * actual_sum - actual_commis_sim - actual_fee
   * @return actualInvoiceSum
  **/
  @Schema(description = "actual_sum - actual_commis_sim - actual_fee")
  public String getActualInvoiceSum() {
    return actualInvoiceSum;
  }

  public void setActualInvoiceSum(String actualInvoiceSum) {
    this.actualInvoiceSum = actualInvoiceSum;
  }

  public OperationDto tx(List<Object> tx) {
    this.tx = tx;
    return this;
  }

  public OperationDto addTxItem(Object txItem) {
    if (this.tx == null) {
      this.tx = new ArrayList<Object>();
    }
    this.tx.add(txItem);
    return this;
  }

   /**
   * array of transaction payment items
   * @return tx
  **/
  @Schema(description = "array of transaction payment items")
  public List<Object> getTx() {
    return tx;
  }

  public void setTx(List<Object> tx) {
    this.tx = tx;
  }

  public OperationDto confirmations(Integer confirmations) {
    this.confirmations = confirmations;
    return this;
  }

   /**
   * Number of confirmations of this transaction. We don&#x27;t update confirmation after operation is confirmed
   * @return confirmations
  **/
  @Schema(description = "Number of confirmations of this transaction. We don't update confirmation after operation is confirmed")
  public Integer getConfirmations() {
    return confirmations;
  }

  public void setConfirmations(Integer confirmations) {
    this.confirmations = confirmations;
  }

  public OperationDto statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Status code
   * @return statusCode
  **/
  @Schema(description = "Status code")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public OperationDto parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * ID of parent invoice
   * @return parentId
  **/
  @Schema(description = "ID of parent invoice")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationDto operationDto = (OperationDto) o;
    return Objects.equals(this.userId, operationDto.userId) &&
        Objects.equals(this.shopId, operationDto.shopId) &&
        Objects.equals(this.type, operationDto.type) &&
        Objects.equals(this.status, operationDto.status) &&
        Objects.equals(this.pendingSum, operationDto.pendingSum) &&
        Objects.equals(this.psysCid, operationDto.psysCid) &&
        Objects.equals(this.currency, operationDto.currency) &&
        Objects.equals(this.sourceCurrency, operationDto.sourceCurrency) &&
        Objects.equals(this.sourceRate, operationDto.sourceRate) &&
        Objects.equals(this.fee, operationDto.fee) &&
        Objects.equals(this.walletHash, operationDto.walletHash) &&
        Objects.equals(this.sendmany, operationDto.sendmany) &&
        Objects.equals(this.params, operationDto.params) &&
        Objects.equals(this.expireAtUtc, operationDto.expireAtUtc) &&
        Objects.equals(this.createdAtUtc, operationDto.createdAtUtc) &&
        Objects.equals(this.amount, operationDto.amount) &&
        Objects.equals(this.sum, operationDto.sum) &&
        Objects.equals(this.commission, operationDto.commission) &&
        Objects.equals(this.txUrl, operationDto.txUrl) &&
        Objects.equals(this.txId, operationDto.txId) &&
        Objects.equals(this.id, operationDto.id) &&
        Objects.equals(this.actualSum, operationDto.actualSum) &&
        Objects.equals(this.actualCommission, operationDto.actualCommission) &&
        Objects.equals(this.actualFee, operationDto.actualFee) &&
        Objects.equals(this.actualInvoiceSum, operationDto.actualInvoiceSum) &&
        Objects.equals(this.tx, operationDto.tx) &&
        Objects.equals(this.confirmations, operationDto.confirmations) &&
        Objects.equals(this.statusCode, operationDto.statusCode) &&
        Objects.equals(this.parentId, operationDto.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, shopId, type, status, pendingSum, psysCid, currency, sourceCurrency, sourceRate, fee, walletHash, sendmany, params, expireAtUtc, createdAtUtc, amount, sum, commission, txUrl, txId, id, actualSum, actualCommission, actualFee, actualInvoiceSum, tx, confirmations, statusCode, parentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationDto {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    pendingSum: ").append(toIndentedString(pendingSum)).append("\n");
    sb.append("    psysCid: ").append(toIndentedString(psysCid)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
    sb.append("    sourceRate: ").append(toIndentedString(sourceRate)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    walletHash: ").append(toIndentedString(walletHash)).append("\n");
    sb.append("    sendmany: ").append(toIndentedString(sendmany)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    expireAtUtc: ").append(toIndentedString(expireAtUtc)).append("\n");
    sb.append("    createdAtUtc: ").append(toIndentedString(createdAtUtc)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    txUrl: ").append(toIndentedString(txUrl)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    actualSum: ").append(toIndentedString(actualSum)).append("\n");
    sb.append("    actualCommission: ").append(toIndentedString(actualCommission)).append("\n");
    sb.append("    actualFee: ").append(toIndentedString(actualFee)).append("\n");
    sb.append("    actualInvoiceSum: ").append(toIndentedString(actualInvoiceSum)).append("\n");
    sb.append("    tx: ").append(toIndentedString(tx)).append("\n");
    sb.append("    confirmations: ").append(toIndentedString(confirmations)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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
