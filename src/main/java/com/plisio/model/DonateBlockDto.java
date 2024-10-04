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
 * DonateBlockDto
 */

public class DonateBlockDto {
  @SerializedName("donate_id")
  private String donateId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("icon")
  private String icon = null;

  @SerializedName("status")
  private Integer status = null;

  public DonateBlockDto donateId(String donateId) {
    this.donateId = donateId;
    return this;
  }

   /**
   * Name
   * @return donateId
  **/
  @Schema(description = "Name")
  public String getDonateId() {
    return donateId;
  }

  public void setDonateId(String donateId) {
    this.donateId = donateId;
  }

  public DonateBlockDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @Schema(description = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DonateBlockDto url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Url
   * @return url
  **/
  @Schema(description = "Url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public DonateBlockDto image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Image
   * @return image
  **/
  @Schema(description = "Image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public DonateBlockDto icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Icon
   * @return icon
  **/
  @Schema(description = "Icon")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public DonateBlockDto status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Status
   * @return status
  **/
  @Schema(description = "Status")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DonateBlockDto donateBlockDto = (DonateBlockDto) o;
    return Objects.equals(this.donateId, donateBlockDto.donateId) &&
        Objects.equals(this.name, donateBlockDto.name) &&
        Objects.equals(this.url, donateBlockDto.url) &&
        Objects.equals(this.image, donateBlockDto.image) &&
        Objects.equals(this.icon, donateBlockDto.icon) &&
        Objects.equals(this.status, donateBlockDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(donateId, name, url, image, icon, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DonateBlockDto {\n");
    
    sb.append("    donateId: ").append(toIndentedString(donateId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
