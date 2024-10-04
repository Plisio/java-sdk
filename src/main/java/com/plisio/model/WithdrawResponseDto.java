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
import com.plisio.model.FeeParamsDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * WithdrawResponseDto
 */

public class WithdrawResponseDto {
  @SerializedName("type")
  private String type = null;

  @SerializedName("status")
  private String status = null;

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
  private FeeParamsDto params = null;

  @SerializedName("created_at_utc")
  private Integer createdAtUtc = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("tx_url")
  private String txUrl = null;

  @SerializedName("tx_id")
  private List<String> txId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("txn_id")
  private String txnId = null;

  public WithdrawResponseDto type(String type) {
    this.type = type;
    return this;
  }

   /**
   * &#x27;cash_out&#x27; or &#x27;mass_cash_out&#x27; depending on the request
   * @return type
  **/
  @Schema(description = "'cash_out' or 'mass_cash_out' depending on the request")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public WithdrawResponseDto status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Cash-out status &#x27;competed&#x27;, &#x27;error&#x27;
   * @return status
  **/
  @Schema(description = "Cash-out status 'competed', 'error'")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public WithdrawResponseDto psysCid(String psysCid) {
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

  public WithdrawResponseDto currency(String currency) {
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

  public WithdrawResponseDto sourceCurrency(String sourceCurrency) {
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

  public WithdrawResponseDto sourceRate(String sourceRate) {
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

  public WithdrawResponseDto fee(String fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Transaction fee stated in the transfer
   * @return fee
  **/
  @Schema(description = "Transaction fee stated in the transfer")
  public String getFee() {
    return fee;
  }

  public void setFee(String fee) {
    this.fee = fee;
  }

  public WithdrawResponseDto walletHash(String walletHash) {
    this.walletHash = walletHash;
    return this;
  }

   /**
   * Destination hash (type&#x3D;cash_out)
   * @return walletHash
  **/
  @Schema(description = "Destination hash (type=cash_out)")
  public String getWalletHash() {
    return walletHash;
  }

  public void setWalletHash(String walletHash) {
    this.walletHash = walletHash;
  }

  public WithdrawResponseDto sendmany(List<String> sendmany) {
    this.sendmany = sendmany;
    return this;
  }

  public WithdrawResponseDto addSendmanyItem(String sendmanyItem) {
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

  public WithdrawResponseDto params(FeeParamsDto params) {
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @Schema(description = "")
  public FeeParamsDto getParams() {
    return params;
  }

  public void setParams(FeeParamsDto params) {
    this.params = params;
  }

  public WithdrawResponseDto createdAtUtc(Integer createdAtUtc) {
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

  public WithdrawResponseDto amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * transfer amount in cryptocurrency
   * @return amount
  **/
  @Schema(description = "transfer amount in cryptocurrency")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public WithdrawResponseDto txUrl(String txUrl) {
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

  public WithdrawResponseDto txId(List<String> txId) {
    this.txId = txId;
    return this;
  }

  public WithdrawResponseDto addTxIdItem(String txIdItem) {
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

  public WithdrawResponseDto id(String id) {
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

  public WithdrawResponseDto txnId(String txnId) {
    this.txnId = txnId;
    return this;
  }

   /**
   * internal Plisio operation ID
   * @return txnId
  **/
  @Schema(description = "internal Plisio operation ID")
  public String getTxnId() {
    return txnId;
  }

  public void setTxnId(String txnId) {
    this.txnId = txnId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WithdrawResponseDto withdrawResponseDto = (WithdrawResponseDto) o;
    return Objects.equals(this.type, withdrawResponseDto.type) &&
        Objects.equals(this.status, withdrawResponseDto.status) &&
        Objects.equals(this.psysCid, withdrawResponseDto.psysCid) &&
        Objects.equals(this.currency, withdrawResponseDto.currency) &&
        Objects.equals(this.sourceCurrency, withdrawResponseDto.sourceCurrency) &&
        Objects.equals(this.sourceRate, withdrawResponseDto.sourceRate) &&
        Objects.equals(this.fee, withdrawResponseDto.fee) &&
        Objects.equals(this.walletHash, withdrawResponseDto.walletHash) &&
        Objects.equals(this.sendmany, withdrawResponseDto.sendmany) &&
        Objects.equals(this.params, withdrawResponseDto.params) &&
        Objects.equals(this.createdAtUtc, withdrawResponseDto.createdAtUtc) &&
        Objects.equals(this.amount, withdrawResponseDto.amount) &&
        Objects.equals(this.txUrl, withdrawResponseDto.txUrl) &&
        Objects.equals(this.txId, withdrawResponseDto.txId) &&
        Objects.equals(this.id, withdrawResponseDto.id) &&
        Objects.equals(this.txnId, withdrawResponseDto.txnId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, status, psysCid, currency, sourceCurrency, sourceRate, fee, walletHash, sendmany, params, createdAtUtc, amount, txUrl, txId, id, txnId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WithdrawResponseDto {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    psysCid: ").append(toIndentedString(psysCid)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
    sb.append("    sourceRate: ").append(toIndentedString(sourceRate)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    walletHash: ").append(toIndentedString(walletHash)).append("\n");
    sb.append("    sendmany: ").append(toIndentedString(sendmany)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    createdAtUtc: ").append(toIndentedString(createdAtUtc)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    txUrl: ").append(toIndentedString(txUrl)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    txnId: ").append(toIndentedString(txnId)).append("\n");
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
