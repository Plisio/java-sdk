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
 * BalanceResponseDto
 */

public class BalanceResponseDto {
  @SerializedName("psys_cid")
  private String psysCid = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("balance")
  private String balance = null;

  public BalanceResponseDto psysCid(String psysCid) {
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

  public BalanceResponseDto currency(String currency) {
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

  public BalanceResponseDto balance(String balance) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceResponseDto balanceResponseDto = (BalanceResponseDto) o;
    return Objects.equals(this.psysCid, balanceResponseDto.psysCid) &&
        Objects.equals(this.currency, balanceResponseDto.currency) &&
        Objects.equals(this.balance, balanceResponseDto.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(psysCid, currency, balance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceResponseDto {\n");
    
    sb.append("    psysCid: ").append(toIndentedString(psysCid)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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
