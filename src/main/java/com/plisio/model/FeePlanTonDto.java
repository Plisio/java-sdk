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
 * FeePlanTonDto
 */

public class FeePlanTonDto extends FeePlanCommonDto {
  @SerializedName("value")
  private BigDecimal value = null;

  @SerializedName("feeUnit")
  private BigDecimal feeUnit = null;

  public FeePlanTonDto value(BigDecimal value) {
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

  public FeePlanTonDto feeUnit(BigDecimal feeUnit) {
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
    FeePlanTonDto feePlanTonDto = (FeePlanTonDto) o;
    return Objects.equals(this.value, feePlanTonDto.value) &&
        Objects.equals(this.feeUnit, feePlanTonDto.feeUnit) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, feeUnit, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeePlanTonDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
