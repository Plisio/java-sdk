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
 * FeePlanDto
 */

public class FeePlanDto {
  @SerializedName("economy")
  private Object economy = null;

  @SerializedName("normal")
  private Object normal = null;

  @SerializedName("priority")
  private Object priority = null;

  public FeePlanDto economy(Object economy) {
    this.economy = economy;
    return this;
  }

   /**
   * estimated fee parameter to confirm the transaction in the “conf_target” blocks
   * @return economy
  **/
  @Schema(description = "estimated fee parameter to confirm the transaction in the “conf_target” blocks")
  public Object getEconomy() {
    return economy;
  }

  public void setEconomy(Object economy) {
    this.economy = economy;
  }

  public FeePlanDto normal(Object normal) {
    this.normal = normal;
    return this;
  }

   /**
   * estimated fee parameter to confirm the transaction in the “conf_target” blocks
   * @return normal
  **/
  @Schema(description = "estimated fee parameter to confirm the transaction in the “conf_target” blocks")
  public Object getNormal() {
    return normal;
  }

  public void setNormal(Object normal) {
    this.normal = normal;
  }

  public FeePlanDto priority(Object priority) {
    this.priority = priority;
    return this;
  }

   /**
   * estimated fee parameter to confirm the transaction in the “conf_target” blocks
   * @return priority
  **/
  @Schema(description = "estimated fee parameter to confirm the transaction in the “conf_target” blocks")
  public Object getPriority() {
    return priority;
  }

  public void setPriority(Object priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeePlanDto feePlanDto = (FeePlanDto) o;
    return Objects.equals(this.economy, feePlanDto.economy) &&
        Objects.equals(this.normal, feePlanDto.normal) &&
        Objects.equals(this.priority, feePlanDto.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(economy, normal, priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeePlanDto {\n");
    
    sb.append("    economy: ").append(toIndentedString(economy)).append("\n");
    sb.append("    normal: ").append(toIndentedString(normal)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
