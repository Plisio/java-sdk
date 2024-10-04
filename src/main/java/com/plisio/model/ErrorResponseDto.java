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
import com.plisio.model.ErrorDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ErrorResponseDto
 */

public class ErrorResponseDto {
  @SerializedName("status")
  private String status = null;

  @SerializedName("data")
  private ErrorDto data = null;

  public ErrorResponseDto status(String status) {
    this.status = status;
    return this;
  }

   /**
   * success or error
   * @return status
  **/
  @Schema(example = "error", description = "success or error")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ErrorResponseDto data(ErrorDto data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public ErrorDto getData() {
    return data;
  }

  public void setData(ErrorDto data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponseDto errorResponseDto = (ErrorResponseDto) o;
    return Objects.equals(this.status, errorResponseDto.status) &&
        Objects.equals(this.data, errorResponseDto.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponseDto {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
