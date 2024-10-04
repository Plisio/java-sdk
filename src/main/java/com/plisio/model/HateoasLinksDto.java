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
import com.plisio.model.HateoasLinkDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * HateoasLinksDto
 */

public class HateoasLinksDto {
  @SerializedName("self")
  private HateoasLinkDto self = null;

  @SerializedName("next")
  private HateoasLinkDto next = null;

  @SerializedName("last")
  private HateoasLinkDto last = null;

  public HateoasLinksDto self(HateoasLinkDto self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @Schema(description = "")
  public HateoasLinkDto getSelf() {
    return self;
  }

  public void setSelf(HateoasLinkDto self) {
    this.self = self;
  }

  public HateoasLinksDto next(HateoasLinkDto next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @Schema(description = "")
  public HateoasLinkDto getNext() {
    return next;
  }

  public void setNext(HateoasLinkDto next) {
    this.next = next;
  }

  public HateoasLinksDto last(HateoasLinkDto last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @Schema(description = "")
  public HateoasLinkDto getLast() {
    return last;
  }

  public void setLast(HateoasLinkDto last) {
    this.last = last;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HateoasLinksDto hateoasLinksDto = (HateoasLinksDto) o;
    return Objects.equals(this.self, hateoasLinksDto.self) &&
        Objects.equals(this.next, hateoasLinksDto.next) &&
        Objects.equals(this.last, hateoasLinksDto.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, next, last);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HateoasLinksDto {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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
