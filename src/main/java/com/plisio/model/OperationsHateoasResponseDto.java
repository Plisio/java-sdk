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
import com.plisio.model.HateoasLinksDto;
import com.plisio.model.HateoasMetaDto;
import com.plisio.model.OperationDto;
import com.plisio.model.SuccessResponseDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * OperationsHateoasResponseDto
 */

public class OperationsHateoasResponseDto extends SuccessResponseDto {
  @SerializedName("operations")
  private List<OperationDto> operations = null;

  @SerializedName("_links")
  private HateoasLinksDto _links = null;

  @SerializedName("_meta")
  private HateoasMetaDto _meta = null;

  public OperationsHateoasResponseDto operations(List<OperationDto> operations) {
    this.operations = operations;
    return this;
  }

  public OperationsHateoasResponseDto addOperationsItem(OperationDto operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<OperationDto>();
    }
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Get operations
   * @return operations
  **/
  @Schema(description = "")
  public List<OperationDto> getOperations() {
    return operations;
  }

  public void setOperations(List<OperationDto> operations) {
    this.operations = operations;
  }

  public OperationsHateoasResponseDto _links(HateoasLinksDto _links) {
    this._links = _links;
    return this;
  }

   /**
   * Get _links
   * @return _links
  **/
  @Schema(description = "")
  public HateoasLinksDto getLinks() {
    return _links;
  }

  public void setLinks(HateoasLinksDto _links) {
    this._links = _links;
  }

  public OperationsHateoasResponseDto _meta(HateoasMetaDto _meta) {
    this._meta = _meta;
    return this;
  }

   /**
   * Get _meta
   * @return _meta
  **/
  @Schema(description = "")
  public HateoasMetaDto getMeta() {
    return _meta;
  }

  public void setMeta(HateoasMetaDto _meta) {
    this._meta = _meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationsHateoasResponseDto operationsHateoasResponseDto = (OperationsHateoasResponseDto) o;
    return Objects.equals(this.operations, operationsHateoasResponseDto.operations) &&
        Objects.equals(this._links, operationsHateoasResponseDto._links) &&
        Objects.equals(this._meta, operationsHateoasResponseDto._meta) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations, _links, _meta, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationsHateoasResponseDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    _meta: ").append(toIndentedString(_meta)).append("\n");
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
