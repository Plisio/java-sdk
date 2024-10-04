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
 * FeePlanBtcDto
 */

public class FeePlanBtcDto extends FeePlanCommonDto {
  @SerializedName("conf_target")
  private BigDecimal confTarget = null;

  @SerializedName("feeRate")
  private Float feeRate = null;

  @SerializedName("feeRateUnit")
  private BigDecimal feeRateUnit = null;

  public FeePlanBtcDto confTarget(BigDecimal confTarget) {
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

  public FeePlanBtcDto feeRate(Float feeRate) {
    this.feeRate = feeRate;
    return this;
  }

   /**
   * fee rate that will be used for transaction
   * @return feeRate
  **/
  @Schema(description = "fee rate that will be used for transaction")
  public Float getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(Float feeRate) {
    this.feeRate = feeRate;
  }

  public FeePlanBtcDto feeRateUnit(BigDecimal feeRateUnit) {
    this.feeRateUnit = feeRateUnit;
    return this;
  }

   /**
   * fee rate unit
   * @return feeRateUnit
  **/
  @Schema(description = "fee rate unit")
  public BigDecimal getFeeRateUnit() {
    return feeRateUnit;
  }

  public void setFeeRateUnit(BigDecimal feeRateUnit) {
    this.feeRateUnit = feeRateUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeePlanBtcDto feePlanBtcDto = (FeePlanBtcDto) o;
    return Objects.equals(this.confTarget, feePlanBtcDto.confTarget) &&
        Objects.equals(this.feeRate, feePlanBtcDto.feeRate) &&
        Objects.equals(this.feeRateUnit, feePlanBtcDto.feeRateUnit) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confTarget, feeRate, feeRateUnit, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeePlanBtcDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    confTarget: ").append(toIndentedString(confTarget)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateUnit: ").append(toIndentedString(feeRateUnit)).append("\n");
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
