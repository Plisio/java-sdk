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
 * FeePlanCustomDto
 */

public class FeePlanCustomDto {
  @SerializedName("min")
  private Integer min = null;

  @SerializedName("max")
  private Integer max = null;

  @SerializedName("default")
  private Integer _default = null;

  @SerializedName("borders")
  private String borders = null;

  @SerializedName("unit")
  private String unit = null;

  @SerializedName("field")
  private String field = null;

  public FeePlanCustomDto min(Integer min) {
    this.min = min;
    return this;
  }

   /**
   * minimal custom fee plan value
   * @return min
  **/
  @Schema(description = "minimal custom fee plan value")
  public Integer getMin() {
    return min;
  }

  public void setMin(Integer min) {
    this.min = min;
  }

  public FeePlanCustomDto max(Integer max) {
    this.max = max;
    return this;
  }

   /**
   * estimated fee parameter to confirm the transaction in the “conf_target” blocks
   * @return max
  **/
  @Schema(description = "estimated fee parameter to confirm the transaction in the “conf_target” blocks")
  public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }

  public FeePlanCustomDto _default(Integer _default) {
    this._default = _default;
    return this;
  }

   /**
   * estimated fee parameter to confirm the transaction in the “conf_target” blocks
   * @return _default
  **/
  @Schema(description = "estimated fee parameter to confirm the transaction in the “conf_target” blocks")
  public Integer getDefault() {
    return _default;
  }

  public void setDefault(Integer _default) {
    this._default = _default;
  }

  public FeePlanCustomDto borders(String borders) {
    this.borders = borders;
    return this;
  }

   /**
   * comma-separated rates of supported plans
   * @return borders
  **/
  @Schema(description = "comma-separated rates of supported plans")
  public String getBorders() {
    return borders;
  }

  public void setBorders(String borders) {
    this.borders = borders;
  }

  public FeePlanCustomDto unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Fee unit
   * @return unit
  **/
  @Schema(description = "Fee unit")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public FeePlanCustomDto field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Fee unit
   * @return field
  **/
  @Schema(description = "Fee unit")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeePlanCustomDto feePlanCustomDto = (FeePlanCustomDto) o;
    return Objects.equals(this.min, feePlanCustomDto.min) &&
        Objects.equals(this.max, feePlanCustomDto.max) &&
        Objects.equals(this._default, feePlanCustomDto._default) &&
        Objects.equals(this.borders, feePlanCustomDto.borders) &&
        Objects.equals(this.unit, feePlanCustomDto.unit) &&
        Objects.equals(this.field, feePlanCustomDto.field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, _default, borders, unit, field);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeePlanCustomDto {\n");
    
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    borders: ").append(toIndentedString(borders)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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
