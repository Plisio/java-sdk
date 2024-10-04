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
 * HateoasMetaDto
 */

public class HateoasMetaDto {
  @SerializedName("totalCount")
  private Integer totalCount = null;

  @SerializedName("pageCount")
  private Integer pageCount = null;

  @SerializedName("currentPage")
  private Integer currentPage = null;

  @SerializedName("perPage")
  private Integer perPage = null;

  public HateoasMetaDto totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * HATEOAS pagination items count
   * @return totalCount
  **/
  @Schema(description = "HATEOAS pagination items count")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public HateoasMetaDto pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * HATEOAS pagination pages count
   * @return pageCount
  **/
  @Schema(description = "HATEOAS pagination pages count")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public HateoasMetaDto currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

   /**
   * HATEOAS pagination current page
   * @return currentPage
  **/
  @Schema(description = "HATEOAS pagination current page")
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public HateoasMetaDto perPage(Integer perPage) {
    this.perPage = perPage;
    return this;
  }

   /**
   * HATEOAS pagination items per page
   * @return perPage
  **/
  @Schema(description = "HATEOAS pagination items per page")
  public Integer getPerPage() {
    return perPage;
  }

  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HateoasMetaDto hateoasMetaDto = (HateoasMetaDto) o;
    return Objects.equals(this.totalCount, hateoasMetaDto.totalCount) &&
        Objects.equals(this.pageCount, hateoasMetaDto.pageCount) &&
        Objects.equals(this.currentPage, hateoasMetaDto.currentPage) &&
        Objects.equals(this.perPage, hateoasMetaDto.perPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, pageCount, currentPage, perPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HateoasMetaDto {\n");
    
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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
