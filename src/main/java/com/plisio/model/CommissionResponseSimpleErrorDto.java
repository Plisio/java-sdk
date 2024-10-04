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
 * CommissionResponseSimpleErrorDto
 */

public class CommissionResponseSimpleErrorDto {
  @SerializedName("amount")
  private String amount = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("balance")
  private String balance = null;

  @SerializedName("cid")
  private String cid = null;

  public CommissionResponseSimpleErrorDto amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount
   * @return amount
  **/
  @Schema(description = "Amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public CommissionResponseSimpleErrorDto to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Plisio commission value
   * @return to
  **/
  @Schema(description = "Plisio commission value")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public CommissionResponseSimpleErrorDto balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Balance in cryptocurrency
   * @return balance
  **/
  @Schema(description = "Balance in cryptocurrency")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public CommissionResponseSimpleErrorDto cid(String cid) {
    this.cid = cid;
    return this;
  }

   /**
   * Cryptocurrency Plisio Abbr
   * @return cid
  **/
  @Schema(description = "Cryptocurrency Plisio Abbr")
  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommissionResponseSimpleErrorDto commissionResponseSimpleErrorDto = (CommissionResponseSimpleErrorDto) o;
    return Objects.equals(this.amount, commissionResponseSimpleErrorDto.amount) &&
        Objects.equals(this.to, commissionResponseSimpleErrorDto.to) &&
        Objects.equals(this.balance, commissionResponseSimpleErrorDto.balance) &&
        Objects.equals(this.cid, commissionResponseSimpleErrorDto.cid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, to, balance, cid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommissionResponseSimpleErrorDto {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
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
