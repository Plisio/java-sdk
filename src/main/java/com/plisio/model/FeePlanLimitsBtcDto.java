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
 * FeePlanLimitsBtcDto
 */

public class FeePlanLimitsBtcDto {
  @SerializedName("plan")
  private String plan = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("unit")
  private BigDecimal unit = null;

  @SerializedName("conf_target")
  private BigDecimal confTarget = null;

  @SerializedName("feerate")
  private BigDecimal feerate = null;

  @SerializedName("sat_b")
  private BigDecimal satB = null;

  @SerializedName("dynamicValues")
  private String dynamicValues = null;

  public FeePlanLimitsBtcDto plan(String plan) {
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

  public FeePlanLimitsBtcDto value(String value) {
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

  public FeePlanLimitsBtcDto unit(BigDecimal unit) {
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

  public FeePlanLimitsBtcDto confTarget(BigDecimal confTarget) {
    this.confTarget = confTarget;
    return this;
  }

   /**
   * estimate fee to be included into next &#x27;conf_target&#x27; block(s)
   * @return confTarget
  **/
  @Schema(description = "estimate fee to be included into next 'conf_target' block(s)")
  public BigDecimal getConfTarget() {
    return confTarget;
  }

  public void setConfTarget(BigDecimal confTarget) {
    this.confTarget = confTarget;
  }

  public FeePlanLimitsBtcDto feerate(BigDecimal feerate) {
    this.feerate = feerate;
    return this;
  }

   /**
   * Fee rate in BTC/Kb
   * @return feerate
  **/
  @Schema(description = "Fee rate in BTC/Kb")
  public BigDecimal getFeerate() {
    return feerate;
  }

  public void setFeerate(BigDecimal feerate) {
    this.feerate = feerate;
  }

  public FeePlanLimitsBtcDto satB(BigDecimal satB) {
    this.satB = satB;
    return this;
  }

   /**
   * Fee rate in sat/byte
   * @return satB
  **/
  @Schema(description = "Fee rate in sat/byte")
  public BigDecimal getSatB() {
    return satB;
  }

  public void setSatB(BigDecimal satB) {
    this.satB = satB;
  }

  public FeePlanLimitsBtcDto dynamicValues(String dynamicValues) {
    this.dynamicValues = dynamicValues;
    return this;
  }

   /**
   * Name of dynamic property name (ex: sat_b)
   * @return dynamicValues
  **/
  @Schema(description = "Name of dynamic property name (ex: sat_b)")
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
    FeePlanLimitsBtcDto feePlanLimitsBtcDto = (FeePlanLimitsBtcDto) o;
    return Objects.equals(this.plan, feePlanLimitsBtcDto.plan) &&
        Objects.equals(this.value, feePlanLimitsBtcDto.value) &&
        Objects.equals(this.unit, feePlanLimitsBtcDto.unit) &&
        Objects.equals(this.confTarget, feePlanLimitsBtcDto.confTarget) &&
        Objects.equals(this.feerate, feePlanLimitsBtcDto.feerate) &&
        Objects.equals(this.satB, feePlanLimitsBtcDto.satB) &&
        Objects.equals(this.dynamicValues, feePlanLimitsBtcDto.dynamicValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plan, value, unit, confTarget, feerate, satB, dynamicValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeePlanLimitsBtcDto {\n");
    
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    confTarget: ").append(toIndentedString(confTarget)).append("\n");
    sb.append("    feerate: ").append(toIndentedString(feerate)).append("\n");
    sb.append("    satB: ").append(toIndentedString(satB)).append("\n");
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
