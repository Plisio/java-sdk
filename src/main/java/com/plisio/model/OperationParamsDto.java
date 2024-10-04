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
/**
 * OperationParamsDto
 */

public class OperationParamsDto {
  @SerializedName("fee")
  private FeeParamsDto fee = null;

  @SerializedName("order_number")
  private String orderNumber = null;

  @SerializedName("order_name")
  private String orderName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("source_amount")
  private String sourceAmount = null;

  @SerializedName("source_currency")
  private String sourceCurrency = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("avatar")
  private String avatar = null;

  @SerializedName("store")
  private String store = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("psys_cid")
  private String psysCid = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("source_rate")
  private String sourceRate = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("donate_hash")
  private String donateHash = null;

  public OperationParamsDto fee(FeeParamsDto fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @Schema(description = "")
  public FeeParamsDto getFee() {
    return fee;
  }

  public void setFee(FeeParamsDto fee) {
    this.fee = fee;
  }

  public OperationParamsDto orderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Invoice order number. Must be unique number in your store for each new store&#x60;s order!!!
   * @return orderNumber
  **/
  @Schema(description = "Invoice order number. Must be unique number in your store for each new store`s order!!!")
  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public OperationParamsDto orderName(String orderName) {
    this.orderName = orderName;
    return this;
  }

   /**
   * Order name
   * @return orderName
  **/
  @Schema(description = "Order name")
  public String getOrderName() {
    return orderName;
  }

  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  public OperationParamsDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Order description
   * @return description
  **/
  @Schema(description = "Order description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OperationParamsDto sourceAmount(String sourceAmount) {
    this.sourceAmount = sourceAmount;
    return this;
  }

   /**
   * Invoice amount in fiat currency
   * @return sourceAmount
  **/
  @Schema(description = "Invoice amount in fiat currency")
  public String getSourceAmount() {
    return sourceAmount;
  }

  public void setSourceAmount(String sourceAmount) {
    this.sourceAmount = sourceAmount;
  }

  public OperationParamsDto sourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
    return this;
  }

   /**
   * Invoice fiat currency
   * @return sourceCurrency
  **/
  @Schema(description = "Invoice fiat currency")
  public String getSourceCurrency() {
    return sourceCurrency;
  }

  public void setSourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
  }

  public OperationParamsDto value(String value) {
    this.value = value;
    return this;
  }

   /**
   * fee value
   * @return value
  **/
  @Schema(description = "fee value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public OperationParamsDto avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Custom invoice avatar
   * @return avatar
  **/
  @Schema(description = "Custom invoice avatar")
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public OperationParamsDto store(String store) {
    this.store = store;
    return this;
  }

   /**
   * Custom invoice store name
   * @return store
  **/
  @Schema(description = "Custom invoice store name")
  public String getStore() {
    return store;
  }

  public void setStore(String store) {
    this.store = store;
  }

  public OperationParamsDto currency(String currency) {
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

  public OperationParamsDto psysCid(String psysCid) {
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

  public OperationParamsDto amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Invoice amount in selected cryptocurrency
   * @return amount
  **/
  @Schema(description = "Invoice amount in selected cryptocurrency")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public OperationParamsDto sourceRate(String sourceRate) {
    this.sourceRate = sourceRate;
    return this;
  }

   /**
   * Cryptocurrency rate
   * @return sourceRate
  **/
  @Schema(description = "Cryptocurrency rate")
  public String getSourceRate() {
    return sourceRate;
  }

  public void setSourceRate(String sourceRate) {
    this.sourceRate = sourceRate;
  }

  public OperationParamsDto email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of payer
   * @return email
  **/
  @Schema(description = "Email of payer")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public OperationParamsDto donateHash(String donateHash) {
    this.donateHash = donateHash;
    return this;
  }

   /**
   * Donation hash
   * @return donateHash
  **/
  @Schema(description = "Donation hash")
  public String getDonateHash() {
    return donateHash;
  }

  public void setDonateHash(String donateHash) {
    this.donateHash = donateHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationParamsDto operationParamsDto = (OperationParamsDto) o;
    return Objects.equals(this.fee, operationParamsDto.fee) &&
        Objects.equals(this.orderNumber, operationParamsDto.orderNumber) &&
        Objects.equals(this.orderName, operationParamsDto.orderName) &&
        Objects.equals(this.description, operationParamsDto.description) &&
        Objects.equals(this.sourceAmount, operationParamsDto.sourceAmount) &&
        Objects.equals(this.sourceCurrency, operationParamsDto.sourceCurrency) &&
        Objects.equals(this.value, operationParamsDto.value) &&
        Objects.equals(this.avatar, operationParamsDto.avatar) &&
        Objects.equals(this.store, operationParamsDto.store) &&
        Objects.equals(this.currency, operationParamsDto.currency) &&
        Objects.equals(this.psysCid, operationParamsDto.psysCid) &&
        Objects.equals(this.amount, operationParamsDto.amount) &&
        Objects.equals(this.sourceRate, operationParamsDto.sourceRate) &&
        Objects.equals(this.email, operationParamsDto.email) &&
        Objects.equals(this.donateHash, operationParamsDto.donateHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, orderNumber, orderName, description, sourceAmount, sourceCurrency, value, avatar, store, currency, psysCid, amount, sourceRate, email, donateHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationParamsDto {\n");
    
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    orderName: ").append(toIndentedString(orderName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sourceAmount: ").append(toIndentedString(sourceAmount)).append("\n");
    sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    psysCid: ").append(toIndentedString(psysCid)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    sourceRate: ").append(toIndentedString(sourceRate)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    donateHash: ").append(toIndentedString(donateHash)).append("\n");
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
