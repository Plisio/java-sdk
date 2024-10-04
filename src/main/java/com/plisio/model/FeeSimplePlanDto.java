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
import com.plisio.model.FeeSimplePlanItemDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * FeeSimplePlanDto
 */

public class FeeSimplePlanDto {
  @SerializedName("economy")
  private FeeSimplePlanItemDto economy = null;

  @SerializedName("normal")
  private FeeSimplePlanItemDto normal = null;

  @SerializedName("priority")
  private FeeSimplePlanItemDto priority = null;

  public FeeSimplePlanDto economy(FeeSimplePlanItemDto economy) {
    this.economy = economy;
    return this;
  }

   /**
   * Get economy
   * @return economy
  **/
  @Schema(description = "")
  public FeeSimplePlanItemDto getEconomy() {
    return economy;
  }

  public void setEconomy(FeeSimplePlanItemDto economy) {
    this.economy = economy;
  }

  public FeeSimplePlanDto normal(FeeSimplePlanItemDto normal) {
    this.normal = normal;
    return this;
  }

   /**
   * Get normal
   * @return normal
  **/
  @Schema(description = "")
  public FeeSimplePlanItemDto getNormal() {
    return normal;
  }

  public void setNormal(FeeSimplePlanItemDto normal) {
    this.normal = normal;
  }

  public FeeSimplePlanDto priority(FeeSimplePlanItemDto priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(description = "")
  public FeeSimplePlanItemDto getPriority() {
    return priority;
  }

  public void setPriority(FeeSimplePlanItemDto priority) {
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
    FeeSimplePlanDto feeSimplePlanDto = (FeeSimplePlanDto) o;
    return Objects.equals(this.economy, feeSimplePlanDto.economy) &&
        Objects.equals(this.normal, feeSimplePlanDto.normal) &&
        Objects.equals(this.priority, feeSimplePlanDto.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(economy, normal, priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeSimplePlanDto {\n");
    
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
