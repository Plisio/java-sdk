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
import com.plisio.model.PaysysDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InvoicePaysysDto
 */

public class InvoicePaysysDto extends PaysysDto {
  @SerializedName("amount")
  private String amount = null;

  public InvoicePaysysDto amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Invoice amount in this crypto
   * @return amount
  **/
  @Schema(description = "Invoice amount in this crypto")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicePaysysDto invoicePaysysDto = (InvoicePaysysDto) o;
    return Objects.equals(this.amount, invoicePaysysDto.amount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicePaysysDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
