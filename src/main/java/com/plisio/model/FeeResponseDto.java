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
 * FeeResponseDto
 */

public class FeeResponseDto {
  @SerializedName("fee")
  private String fee = null;

  @SerializedName("psys_cid")
  private String psysCid = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("plan")
  private String plan = null;

  public FeeResponseDto fee(String fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Fee value
   * @return fee
  **/
  @Schema(description = "Fee value")
  public String getFee() {
    return fee;
  }

  public void setFee(String fee) {
    this.fee = fee;
  }

  public FeeResponseDto psysCid(String psysCid) {
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

  public FeeResponseDto currency(String currency) {
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

  public FeeResponseDto plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * normal or priority (https://plisio.net/documentation/endpoints/fee-plans)
   * @return plan
  **/
  @Schema(description = "normal or priority (https://plisio.net/documentation/endpoints/fee-plans)")
  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeResponseDto feeResponseDto = (FeeResponseDto) o;
    return Objects.equals(this.fee, feeResponseDto.fee) &&
        Objects.equals(this.psysCid, feeResponseDto.psysCid) &&
        Objects.equals(this.currency, feeResponseDto.currency) &&
        Objects.equals(this.plan, feeResponseDto.plan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, psysCid, currency, plan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeResponseDto {\n");
    
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    psysCid: ").append(toIndentedString(psysCid)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
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
