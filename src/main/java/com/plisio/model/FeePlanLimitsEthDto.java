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
import java.math.BigDecimal;
/**
 * FeePlanLimitsEthDto
 */

public class FeePlanLimitsEthDto {
  @SerializedName("plan")
  private String plan = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("unit")
  private BigDecimal unit = null;

  @SerializedName("gasLimit")
  private Integer gasLimit = null;

  @SerializedName("gasPrice")
  private Integer gasPrice = null;

  @SerializedName("dynamicValues")
  private String dynamicValues = null;

  public FeePlanLimitsEthDto plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Plan name: normal, priority or custom
   * @return plan
  **/
  @Schema(description = "Plan name: normal, priority or custom")
  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

  public FeePlanLimitsEthDto value(String value) {
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

  public FeePlanLimitsEthDto unit(BigDecimal unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Fee unit
   * @return unit
  **/
  @Schema(description = "Fee unit")
  public BigDecimal getUnit() {
    return unit;
  }

  public void setUnit(BigDecimal unit) {
    this.unit = unit;
  }

  public FeePlanLimitsEthDto gasLimit(Integer gasLimit) {
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Ethereum gas limit
   * @return gasLimit
  **/
  @Schema(description = "Ethereum gas limit")
  public Integer getGasLimit() {
    return gasLimit;
  }

  public void setGasLimit(Integer gasLimit) {
    this.gasLimit = gasLimit;
  }

  public FeePlanLimitsEthDto gasPrice(Integer gasPrice) {
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * Ethereum gas price in Gwai
   * @return gasPrice
  **/
  @Schema(description = "Ethereum gas price in Gwai")
  public Integer getGasPrice() {
    return gasPrice;
  }

  public void setGasPrice(Integer gasPrice) {
    this.gasPrice = gasPrice;
  }

  public FeePlanLimitsEthDto dynamicValues(String dynamicValues) {
    this.dynamicValues = dynamicValues;
    return this;
  }

   /**
   * Name of dynamic property name (ex: gasPrice)
   * @return dynamicValues
  **/
  @Schema(description = "Name of dynamic property name (ex: gasPrice)")
  public String getDynamicValues() {
    return dynamicValues;
  }

  public void setDynamicValues(String dynamicValues) {
    this.dynamicValues = dynamicValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeePlanLimitsEthDto feePlanLimitsEthDto = (FeePlanLimitsEthDto) o;
    return Objects.equals(this.plan, feePlanLimitsEthDto.plan) &&
        Objects.equals(this.value, feePlanLimitsEthDto.value) &&
        Objects.equals(this.unit, feePlanLimitsEthDto.unit) &&
        Objects.equals(this.gasLimit, feePlanLimitsEthDto.gasLimit) &&
        Objects.equals(this.gasPrice, feePlanLimitsEthDto.gasPrice) &&
        Objects.equals(this.dynamicValues, feePlanLimitsEthDto.dynamicValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plan, value, unit, gasLimit, gasPrice, dynamicValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeePlanLimitsEthDto {\n");
    
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    dynamicValues: ").append(toIndentedString(dynamicValues)).append("\n");
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
