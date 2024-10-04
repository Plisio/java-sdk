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
 * FeeParamsDto
 */

public class FeeParamsDto {
  @SerializedName("conf_target")
  private String confTarget = null;

  @SerializedName("plan")
  private String plan = null;

  @SerializedName("value")
  private String value = null;

  public FeeParamsDto confTarget(String confTarget) {
    this.confTarget = confTarget;
    return this;
  }

   /**
   * estimated fee parameter to confirm the transaction in the “conf_target” blocks
   * @return confTarget
  **/
  @Schema(description = "estimated fee parameter to confirm the transaction in the “conf_target” blocks")
  public String getConfTarget() {
    return confTarget;
  }

  public void setConfTarget(String confTarget) {
    this.confTarget = confTarget;
  }

  public FeeParamsDto plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * the Plisio’s fee plan name
   * @return plan
  **/
  @Schema(description = "the Plisio’s fee plan name")
  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

  public FeeParamsDto value(String value) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeParamsDto feeParamsDto = (FeeParamsDto) o;
    return Objects.equals(this.confTarget, feeParamsDto.confTarget) &&
        Objects.equals(this.plan, feeParamsDto.plan) &&
        Objects.equals(this.value, feeParamsDto.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confTarget, plan, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeParamsDto {\n");
    
    sb.append("    confTarget: ").append(toIndentedString(confTarget)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
