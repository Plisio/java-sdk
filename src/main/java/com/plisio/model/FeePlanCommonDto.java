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
 * FeePlanCommonDto
 */

public class FeePlanCommonDto {
  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  public FeePlanCommonDto key(String key) {
    this.key = key;
    return this;
  }

   /**
   * fee plan key
   * @return key
  **/
  @Schema(description = "fee plan key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public FeePlanCommonDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * fee plan name
   * @return name
  **/
  @Schema(description = "fee plan name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeePlanCommonDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * fee plan description
   * @return description
  **/
  @Schema(description = "fee plan description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeePlanCommonDto feePlanCommonDto = (FeePlanCommonDto) o;
    return Objects.equals(this.key, feePlanCommonDto.key) &&
        Objects.equals(this.name, feePlanCommonDto.name) &&
        Objects.equals(this.description, feePlanCommonDto.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeePlanCommonDto {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
