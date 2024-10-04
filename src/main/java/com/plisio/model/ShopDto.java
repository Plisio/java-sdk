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
 * ShopDto
 */

public class ShopDto {
  @SerializedName("name")
  private String name = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("logo")
  private String logo = null;

  @SerializedName("commission_payment")
  private Integer commissionPayment = null;

  @SerializedName("white_label")
  private Boolean whiteLabel = null;

  @SerializedName("extra_commission")
  private Float extraCommission = null;

  @SerializedName("verified")
  private Boolean verified = null;

  public ShopDto name(String name) {
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

  public ShopDto link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @Schema(description = "")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public ShopDto logo(String logo) {
    this.logo = logo;
    return this;
  }

   /**
   * Shop logo url
   * @return logo
  **/
  @Schema(description = "Shop logo url")
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public ShopDto commissionPayment(Integer commissionPayment) {
    this.commissionPayment = commissionPayment;
    return this;
  }

   /**
   * Who pays the commission: Shop or Client
   * @return commissionPayment
  **/
  @Schema(description = "Who pays the commission: Shop or Client")
  public Integer getCommissionPayment() {
    return commissionPayment;
  }

  public void setCommissionPayment(Integer commissionPayment) {
    this.commissionPayment = commissionPayment;
  }

  public ShopDto whiteLabel(Boolean whiteLabel) {
    this.whiteLabel = whiteLabel;
    return this;
  }

   /**
   * Is white-label is enabled
   * @return whiteLabel
  **/
  @Schema(description = "Is white-label is enabled")
  public Boolean isWhiteLabel() {
    return whiteLabel;
  }

  public void setWhiteLabel(Boolean whiteLabel) {
    this.whiteLabel = whiteLabel;
  }

  public ShopDto extraCommission(Float extraCommission) {
    this.extraCommission = extraCommission;
    return this;
  }

   /**
   * Extra white-label commission
   * @return extraCommission
  **/
  @Schema(description = "Extra white-label commission")
  public Float getExtraCommission() {
    return extraCommission;
  }

  public void setExtraCommission(Float extraCommission) {
    this.extraCommission = extraCommission;
  }

  public ShopDto verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

   /**
   * Is domain verified
   * @return verified
  **/
  @Schema(description = "Is domain verified")
  public Boolean isVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopDto shopDto = (ShopDto) o;
    return Objects.equals(this.name, shopDto.name) &&
        Objects.equals(this.link, shopDto.link) &&
        Objects.equals(this.logo, shopDto.logo) &&
        Objects.equals(this.commissionPayment, shopDto.commissionPayment) &&
        Objects.equals(this.whiteLabel, shopDto.whiteLabel) &&
        Objects.equals(this.extraCommission, shopDto.extraCommission) &&
        Objects.equals(this.verified, shopDto.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, link, logo, commissionPayment, whiteLabel, extraCommission, verified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    commissionPayment: ").append(toIndentedString(commissionPayment)).append("\n");
    sb.append("    whiteLabel: ").append(toIndentedString(whiteLabel)).append("\n");
    sb.append("    extraCommission: ").append(toIndentedString(extraCommission)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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
