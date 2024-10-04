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
 * FeeSimplePlanItemDto
 */

public class FeeSimplePlanItemDto {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("value")
  private String value = null;

  public FeeSimplePlanItemDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Fee plan name
   * @return name
  **/
  @Schema(description = "Fee plan name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeeSimplePlanItemDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Fee plan detailed description
   * @return description
  **/
  @Schema(description = "Fee plan detailed description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FeeSimplePlanItemDto value(String value) {
    this.value = value;
    return this;
  }

   /**
   * estimated fee value
   * @return value
  **/
  @Schema(description = "estimated fee value")
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
    FeeSimplePlanItemDto feeSimplePlanItemDto = (FeeSimplePlanItemDto) o;
    return Objects.equals(this.name, feeSimplePlanItemDto.name) &&
        Objects.equals(this.description, feeSimplePlanItemDto.description) &&
        Objects.equals(this.value, feeSimplePlanItemDto.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeSimplePlanItemDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
