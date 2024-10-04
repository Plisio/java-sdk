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
import com.plisio.model.InvoicePaysysDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InvoicePaysysContractsGroupDto
 */

public class InvoicePaysysContractsGroupDto extends InvoicePaysysDto {
  @SerializedName("contractGroupCid")
  private String contractGroupCid = null;

  @SerializedName("contractGroupIcon")
  private String contractGroupIcon = null;

  @SerializedName("contractGroupName")
  private String contractGroupName = null;

  public InvoicePaysysContractsGroupDto contractGroupCid(String contractGroupCid) {
    this.contractGroupCid = contractGroupCid;
    return this;
  }

   /**
   * Contract group cid
   * @return contractGroupCid
  **/
  @Schema(description = "Contract group cid")
  public String getContractGroupCid() {
    return contractGroupCid;
  }

  public void setContractGroupCid(String contractGroupCid) {
    this.contractGroupCid = contractGroupCid;
  }

  public InvoicePaysysContractsGroupDto contractGroupIcon(String contractGroupIcon) {
    this.contractGroupIcon = contractGroupIcon;
    return this;
  }

   /**
   * Contract group icon
   * @return contractGroupIcon
  **/
  @Schema(description = "Contract group icon")
  public String getContractGroupIcon() {
    return contractGroupIcon;
  }

  public void setContractGroupIcon(String contractGroupIcon) {
    this.contractGroupIcon = contractGroupIcon;
  }

  public InvoicePaysysContractsGroupDto contractGroupName(String contractGroupName) {
    this.contractGroupName = contractGroupName;
    return this;
  }

   /**
   * Contract group name
   * @return contractGroupName
  **/
  @Schema(description = "Contract group name")
  public String getContractGroupName() {
    return contractGroupName;
  }

  public void setContractGroupName(String contractGroupName) {
    this.contractGroupName = contractGroupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicePaysysContractsGroupDto invoicePaysysContractsGroupDto = (InvoicePaysysContractsGroupDto) o;
    return Objects.equals(this.contractGroupCid, invoicePaysysContractsGroupDto.contractGroupCid) &&
        Objects.equals(this.contractGroupIcon, invoicePaysysContractsGroupDto.contractGroupIcon) &&
        Objects.equals(this.contractGroupName, invoicePaysysContractsGroupDto.contractGroupName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractGroupCid, contractGroupIcon, contractGroupName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicePaysysContractsGroupDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    contractGroupCid: ").append(toIndentedString(contractGroupCid)).append("\n");
    sb.append("    contractGroupIcon: ").append(toIndentedString(contractGroupIcon)).append("\n");
    sb.append("    contractGroupName: ").append(toIndentedString(contractGroupName)).append("\n");
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
