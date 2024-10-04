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
import com.plisio.model.InvoiceExtendedResponseDto;
import com.plisio.model.SuccessResponseDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InvoiceWhiteLabelResponseDto
 */

public class InvoiceWhiteLabelResponseDto extends SuccessResponseDto {
  @SerializedName("data")
  private InvoiceExtendedResponseDto data = null;

  public InvoiceWhiteLabelResponseDto data(InvoiceExtendedResponseDto data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public InvoiceExtendedResponseDto getData() {
    return data;
  }

  public void setData(InvoiceExtendedResponseDto data) {
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
    InvoiceWhiteLabelResponseDto invoiceWhiteLabelResponseDto = (InvoiceWhiteLabelResponseDto) o;
    return Objects.equals(this.data, invoiceWhiteLabelResponseDto.data) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceWhiteLabelResponseDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
