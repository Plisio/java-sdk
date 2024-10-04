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
import com.plisio.model.InvoiceSimpleResponseDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * OperationSimpleDto
 */

public class OperationSimpleDto extends InvoiceSimpleResponseDto {
  @SerializedName("shop_id")
  private String shopId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("tx_url")
  private String txUrl = null;

  @SerializedName("id")
  private String id = null;

  public OperationSimpleDto shopId(String shopId) {
    this.shopId = shopId;
    return this;
  }

   /**
   * Shop ID
   * @return shopId
  **/
  @Schema(description = "Shop ID")
  public String getShopId() {
    return shopId;
  }

  public void setShopId(String shopId) {
    this.shopId = shopId;
  }

  public OperationSimpleDto type(String type) {
    this.type = type;
    return this;
  }

   /**
   * cash_in, cash_out, mass_cash_out, invoice
   * @return type
  **/
  @Schema(description = "cash_in, cash_out, mass_cash_out, invoice")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OperationSimpleDto status(String status) {
    this.status = status;
    return this;
  }

   /**
   * pending, completed, error, new, expired, mismatch, cancelled
   * @return status
  **/
  @Schema(description = "pending, completed, error, new, expired, mismatch, cancelled")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OperationSimpleDto txUrl(String txUrl) {
    this.txUrl = txUrl;
    return this;
  }

   /**
   * link to the cryptocurrency block explorer
   * @return txUrl
  **/
  @Schema(description = "link to the cryptocurrency block explorer")
  public String getTxUrl() {
    return txUrl;
  }

  public void setTxUrl(String txUrl) {
    this.txUrl = txUrl;
  }

  public OperationSimpleDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * internal Plisio operation ID
   * @return id
  **/
  @Schema(description = "internal Plisio operation ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationSimpleDto operationSimpleDto = (OperationSimpleDto) o;
    return Objects.equals(this.shopId, operationSimpleDto.shopId) &&
        Objects.equals(this.type, operationSimpleDto.type) &&
        Objects.equals(this.status, operationSimpleDto.status) &&
        Objects.equals(this.txUrl, operationSimpleDto.txUrl) &&
        Objects.equals(this.id, operationSimpleDto.id) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopId, type, status, txUrl, id, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationSimpleDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    txUrl: ").append(toIndentedString(txUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
