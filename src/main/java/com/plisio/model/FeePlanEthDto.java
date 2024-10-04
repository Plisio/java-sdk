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
import com.plisio.model.FeePlanCommonDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * FeePlanEthDto
 */

public class FeePlanEthDto extends FeePlanCommonDto {
  @SerializedName("gasLimit")
  private Float gasLimit = null;

  @SerializedName("gasPrice")
  private Float gasPrice = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("feeUnit")
  private String feeUnit = null;

  @SerializedName("nonce")
  private Object nonce = null;

  public FeePlanEthDto gasLimit(Float gasLimit) {
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Ethereum gas limit
   * @return gasLimit
  **/
  @Schema(description = "Ethereum gas limit")
  public Float getGasLimit() {
    return gasLimit;
  }

  public void setGasLimit(Float gasLimit) {
    this.gasLimit = gasLimit;
  }

  public FeePlanEthDto gasPrice(Float gasPrice) {
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * Ethereum gas price
   * @return gasPrice
  **/
  @Schema(description = "Ethereum gas price")
  public Float getGasPrice() {
    return gasPrice;
  }

  public void setGasPrice(Float gasPrice) {
    this.gasPrice = gasPrice;
  }

  public FeePlanEthDto value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Fee value
   * @return value
  **/
  @Schema(description = "Fee value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public FeePlanEthDto feeUnit(String feeUnit) {
    this.feeUnit = feeUnit;
    return this;
  }

   /**
   * Fee unit value
   * @return feeUnit
  **/
  @Schema(description = "Fee unit value")
  public String getFeeUnit() {
    return feeUnit;
  }

  public void setFeeUnit(String feeUnit) {
    this.feeUnit = feeUnit;
  }

  public FeePlanEthDto nonce(Object nonce) {
    this.nonce = nonce;
    return this;
  }

   /**
   * Nonce param to update tx
   * @return nonce
  **/
  @Schema(description = "Nonce param to update tx")
  public Object getNonce() {
    return nonce;
  }

  public void setNonce(Object nonce) {
    this.nonce = nonce;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeePlanEthDto feePlanEthDto = (FeePlanEthDto) o;
    return Objects.equals(this.gasLimit, feePlanEthDto.gasLimit) &&
        Objects.equals(this.gasPrice, feePlanEthDto.gasPrice) &&
        Objects.equals(this.value, feePlanEthDto.value) &&
        Objects.equals(this.feeUnit, feePlanEthDto.feeUnit) &&
        Objects.equals(this.nonce, feePlanEthDto.nonce) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gasLimit, gasPrice, value, feeUnit, nonce, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeePlanEthDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    feeUnit: ").append(toIndentedString(feeUnit)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
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
