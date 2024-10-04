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
 * ShopInfoDto
 */

public class ShopInfoDto {
  @SerializedName("name")
  private String name = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("logo")
  private String logo = null;

  @SerializedName("successUrl")
  private String successUrl = null;

  @SerializedName("failedUrl")
  private String failedUrl = null;

  @SerializedName("allow_renew")
  private Boolean allowRenew = null;

  public ShopInfoDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Shop name
   * @return name
  **/
  @Schema(description = "Shop name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ShopInfoDto link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Shop URL
   * @return link
  **/
  @Schema(description = "Shop URL")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public ShopInfoDto logo(String logo) {
    this.logo = logo;
    return this;
  }

   /**
   * Shop logo
   * @return logo
  **/
  @Schema(description = "Shop logo")
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public ShopInfoDto successUrl(String successUrl) {
    this.successUrl = successUrl;
    return this;
  }

   /**
   * Success callback URL
   * @return successUrl
  **/
  @Schema(description = "Success callback URL")
  public String getSuccessUrl() {
    return successUrl;
  }

  public void setSuccessUrl(String successUrl) {
    this.successUrl = successUrl;
  }

  public ShopInfoDto failedUrl(String failedUrl) {
    this.failedUrl = failedUrl;
    return this;
  }

   /**
   * Fail callback URL
   * @return failedUrl
  **/
  @Schema(description = "Fail callback URL")
  public String getFailedUrl() {
    return failedUrl;
  }

  public void setFailedUrl(String failedUrl) {
    this.failedUrl = failedUrl;
  }

  public ShopInfoDto allowRenew(Boolean allowRenew) {
    this.allowRenew = allowRenew;
    return this;
  }

   /**
   * Show renew button after invoice expored
   * @return allowRenew
  **/
  @Schema(description = "Show renew button after invoice expored")
  public Boolean isAllowRenew() {
    return allowRenew;
  }

  public void setAllowRenew(Boolean allowRenew) {
    this.allowRenew = allowRenew;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopInfoDto shopInfoDto = (ShopInfoDto) o;
    return Objects.equals(this.name, shopInfoDto.name) &&
        Objects.equals(this.link, shopInfoDto.link) &&
        Objects.equals(this.logo, shopInfoDto.logo) &&
        Objects.equals(this.successUrl, shopInfoDto.successUrl) &&
        Objects.equals(this.failedUrl, shopInfoDto.failedUrl) &&
        Objects.equals(this.allowRenew, shopInfoDto.allowRenew);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, link, logo, successUrl, failedUrl, allowRenew);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopInfoDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    failedUrl: ").append(toIndentedString(failedUrl)).append("\n");
    sb.append("    allowRenew: ").append(toIndentedString(allowRenew)).append("\n");
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
