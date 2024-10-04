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
import java.math.BigDecimal;
/**
 * FeePlanXmrDto
 */

public class FeePlanXmrDto extends FeePlanCommonDto {
  @SerializedName("conf_target")
  private Object confTarget = null;

  @SerializedName("value")
  private BigDecimal value = null;

  @SerializedName("feeUnit")
  private BigDecimal feeUnit = null;

  public FeePlanXmrDto confTarget(Object confTarget) {
    this.confTarget = confTarget;
    return this;
  }

   /**
   * Priority value of XMR
   * @return confTarget
  **/
  @Schema(description = "Priority value of XMR")
  public Object getConfTarget() {
    return confTarget;
  }

  public void setConfTarget(Object confTarget) {
    this.confTarget = confTarget;
  }

  public FeePlanXmrDto value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Fee value
   * @return value
  **/
  @Schema(description = "Fee value")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public FeePlanXmrDto feeUnit(BigDecimal feeUnit) {
    this.feeUnit = feeUnit;
    return this;
  }

   /**
   * Fee unit
   * @return feeUnit
  **/
  @Schema(description = "Fee unit")
  public BigDecimal getFeeUnit() {
    return feeUnit;
  }

  public void setFeeUnit(BigDecimal feeUnit) {
    this.feeUnit = feeUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeePlanXmrDto feePlanXmrDto = (FeePlanXmrDto) o;
    return Objects.equals(this.confTarget, feePlanXmrDto.confTarget) &&
        Objects.equals(this.value, feePlanXmrDto.value) &&
        Objects.equals(this.feeUnit, feePlanXmrDto.feeUnit) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confTarget, value, feeUnit, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeePlanXmrDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    confTarget: ").append(toIndentedString(confTarget)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    feeUnit: ").append(toIndentedString(feeUnit)).append("\n");
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
