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
 * DonateDto
 */

public class DonateDto {
  @SerializedName("name")
  private String name = null;

  @SerializedName("info_name")
  private String infoName = null;

  @SerializedName("info_description")
  private String infoDescription = null;

  @SerializedName("info_image")
  private String infoImage = null;

  @SerializedName("allowed_psys_name")
  private String allowedPsysName = null;

  @SerializedName("allowed_psys_cids")
  private String allowedPsysCids = null;

  @SerializedName("completed_name")
  private String completedName = null;

  @SerializedName("completed_text")
  private String completedText = null;

  @SerializedName("color_background_first")
  private String colorBackgroundFirst = null;

  @SerializedName("color_background_second")
  private String colorBackgroundSecond = null;

  @SerializedName("color_title")
  private String colorTitle = null;

  @SerializedName("color_description")
  private String colorDescription = null;

  @SerializedName("color_link_button")
  private String colorLinkButton = null;

  @SerializedName("color_text")
  private String colorText = null;

  @SerializedName("button_color")
  private String buttonColor = null;

  @SerializedName("button_type")
  private String buttonType = null;

  @SerializedName("url_donate")
  private String urlDonate = null;

  @SerializedName("block_info")
  private Object blockInfo = null;

  public DonateDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Donate name
   * @return name
  **/
  @Schema(description = "Donate name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DonateDto infoName(String infoName) {
    this.infoName = infoName;
    return this;
  }

   /**
   * Donate info name
   * @return infoName
  **/
  @Schema(description = "Donate info name")
  public String getInfoName() {
    return infoName;
  }

  public void setInfoName(String infoName) {
    this.infoName = infoName;
  }

  public DonateDto infoDescription(String infoDescription) {
    this.infoDescription = infoDescription;
    return this;
  }

   /**
   * Donate description
   * @return infoDescription
  **/
  @Schema(description = "Donate description")
  public String getInfoDescription() {
    return infoDescription;
  }

  public void setInfoDescription(String infoDescription) {
    this.infoDescription = infoDescription;
  }

  public DonateDto infoImage(String infoImage) {
    this.infoImage = infoImage;
    return this;
  }

   /**
   * Donate info image url
   * @return infoImage
  **/
  @Schema(description = "Donate info image url")
  public String getInfoImage() {
    return infoImage;
  }

  public void setInfoImage(String infoImage) {
    this.infoImage = infoImage;
  }

  public DonateDto allowedPsysName(String allowedPsysName) {
    this.allowedPsysName = allowedPsysName;
    return this;
  }

   /**
   * Donate allowed_psys_name
   * @return allowedPsysName
  **/
  @Schema(description = "Donate allowed_psys_name")
  public String getAllowedPsysName() {
    return allowedPsysName;
  }

  public void setAllowedPsysName(String allowedPsysName) {
    this.allowedPsysName = allowedPsysName;
  }

  public DonateDto allowedPsysCids(String allowedPsysCids) {
    this.allowedPsysCids = allowedPsysCids;
    return this;
  }

   /**
   * Donate $allowed_psys_cids
   * @return allowedPsysCids
  **/
  @Schema(description = "Donate $allowed_psys_cids")
  public String getAllowedPsysCids() {
    return allowedPsysCids;
  }

  public void setAllowedPsysCids(String allowedPsysCids) {
    this.allowedPsysCids = allowedPsysCids;
  }

  public DonateDto completedName(String completedName) {
    this.completedName = completedName;
    return this;
  }

   /**
   * Donate $completed_name
   * @return completedName
  **/
  @Schema(description = "Donate $completed_name")
  public String getCompletedName() {
    return completedName;
  }

  public void setCompletedName(String completedName) {
    this.completedName = completedName;
  }

  public DonateDto completedText(String completedText) {
    this.completedText = completedText;
    return this;
  }

   /**
   * Donate $completed_text
   * @return completedText
  **/
  @Schema(description = "Donate $completed_text")
  public String getCompletedText() {
    return completedText;
  }

  public void setCompletedText(String completedText) {
    this.completedText = completedText;
  }

  public DonateDto colorBackgroundFirst(String colorBackgroundFirst) {
    this.colorBackgroundFirst = colorBackgroundFirst;
    return this;
  }

   /**
   * Donate $color_background_first
   * @return colorBackgroundFirst
  **/
  @Schema(description = "Donate $color_background_first")
  public String getColorBackgroundFirst() {
    return colorBackgroundFirst;
  }

  public void setColorBackgroundFirst(String colorBackgroundFirst) {
    this.colorBackgroundFirst = colorBackgroundFirst;
  }

  public DonateDto colorBackgroundSecond(String colorBackgroundSecond) {
    this.colorBackgroundSecond = colorBackgroundSecond;
    return this;
  }

   /**
   * Donate $color_background_second
   * @return colorBackgroundSecond
  **/
  @Schema(description = "Donate $color_background_second")
  public String getColorBackgroundSecond() {
    return colorBackgroundSecond;
  }

  public void setColorBackgroundSecond(String colorBackgroundSecond) {
    this.colorBackgroundSecond = colorBackgroundSecond;
  }

  public DonateDto colorTitle(String colorTitle) {
    this.colorTitle = colorTitle;
    return this;
  }

   /**
   * Donate $color_title
   * @return colorTitle
  **/
  @Schema(description = "Donate $color_title")
  public String getColorTitle() {
    return colorTitle;
  }

  public void setColorTitle(String colorTitle) {
    this.colorTitle = colorTitle;
  }

  public DonateDto colorDescription(String colorDescription) {
    this.colorDescription = colorDescription;
    return this;
  }

   /**
   * Donate $color_description
   * @return colorDescription
  **/
  @Schema(description = "Donate $color_description")
  public String getColorDescription() {
    return colorDescription;
  }

  public void setColorDescription(String colorDescription) {
    this.colorDescription = colorDescription;
  }

  public DonateDto colorLinkButton(String colorLinkButton) {
    this.colorLinkButton = colorLinkButton;
    return this;
  }

   /**
   * Donate $color_link_button
   * @return colorLinkButton
  **/
  @Schema(description = "Donate $color_link_button")
  public String getColorLinkButton() {
    return colorLinkButton;
  }

  public void setColorLinkButton(String colorLinkButton) {
    this.colorLinkButton = colorLinkButton;
  }

  public DonateDto colorText(String colorText) {
    this.colorText = colorText;
    return this;
  }

   /**
   * Donate $color_text
   * @return colorText
  **/
  @Schema(description = "Donate $color_text")
  public String getColorText() {
    return colorText;
  }

  public void setColorText(String colorText) {
    this.colorText = colorText;
  }

  public DonateDto buttonColor(String buttonColor) {
    this.buttonColor = buttonColor;
    return this;
  }

   /**
   * Donate $button_color
   * @return buttonColor
  **/
  @Schema(description = "Donate $button_color")
  public String getButtonColor() {
    return buttonColor;
  }

  public void setButtonColor(String buttonColor) {
    this.buttonColor = buttonColor;
  }

  public DonateDto buttonType(String buttonType) {
    this.buttonType = buttonType;
    return this;
  }

   /**
   * Donate $button_type
   * @return buttonType
  **/
  @Schema(description = "Donate $button_type")
  public String getButtonType() {
    return buttonType;
  }

  public void setButtonType(String buttonType) {
    this.buttonType = buttonType;
  }

  public DonateDto urlDonate(String urlDonate) {
    this.urlDonate = urlDonate;
    return this;
  }

   /**
   * Donate $url_donate
   * @return urlDonate
  **/
  @Schema(description = "Donate $url_donate")
  public String getUrlDonate() {
    return urlDonate;
  }

  public void setUrlDonate(String urlDonate) {
    this.urlDonate = urlDonate;
  }

  public DonateDto blockInfo(Object blockInfo) {
    this.blockInfo = blockInfo;
    return this;
  }

   /**
   * Model DonateBlockDto
   * @return blockInfo
  **/
  @Schema(description = "Model DonateBlockDto")
  public Object getBlockInfo() {
    return blockInfo;
  }

  public void setBlockInfo(Object blockInfo) {
    this.blockInfo = blockInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DonateDto donateDto = (DonateDto) o;
    return Objects.equals(this.name, donateDto.name) &&
        Objects.equals(this.infoName, donateDto.infoName) &&
        Objects.equals(this.infoDescription, donateDto.infoDescription) &&
        Objects.equals(this.infoImage, donateDto.infoImage) &&
        Objects.equals(this.allowedPsysName, donateDto.allowedPsysName) &&
        Objects.equals(this.allowedPsysCids, donateDto.allowedPsysCids) &&
        Objects.equals(this.completedName, donateDto.completedName) &&
        Objects.equals(this.completedText, donateDto.completedText) &&
        Objects.equals(this.colorBackgroundFirst, donateDto.colorBackgroundFirst) &&
        Objects.equals(this.colorBackgroundSecond, donateDto.colorBackgroundSecond) &&
        Objects.equals(this.colorTitle, donateDto.colorTitle) &&
        Objects.equals(this.colorDescription, donateDto.colorDescription) &&
        Objects.equals(this.colorLinkButton, donateDto.colorLinkButton) &&
        Objects.equals(this.colorText, donateDto.colorText) &&
        Objects.equals(this.buttonColor, donateDto.buttonColor) &&
        Objects.equals(this.buttonType, donateDto.buttonType) &&
        Objects.equals(this.urlDonate, donateDto.urlDonate) &&
        Objects.equals(this.blockInfo, donateDto.blockInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, infoName, infoDescription, infoImage, allowedPsysName, allowedPsysCids, completedName, completedText, colorBackgroundFirst, colorBackgroundSecond, colorTitle, colorDescription, colorLinkButton, colorText, buttonColor, buttonType, urlDonate, blockInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DonateDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    infoName: ").append(toIndentedString(infoName)).append("\n");
    sb.append("    infoDescription: ").append(toIndentedString(infoDescription)).append("\n");
    sb.append("    infoImage: ").append(toIndentedString(infoImage)).append("\n");
    sb.append("    allowedPsysName: ").append(toIndentedString(allowedPsysName)).append("\n");
    sb.append("    allowedPsysCids: ").append(toIndentedString(allowedPsysCids)).append("\n");
    sb.append("    completedName: ").append(toIndentedString(completedName)).append("\n");
    sb.append("    completedText: ").append(toIndentedString(completedText)).append("\n");
    sb.append("    colorBackgroundFirst: ").append(toIndentedString(colorBackgroundFirst)).append("\n");
    sb.append("    colorBackgroundSecond: ").append(toIndentedString(colorBackgroundSecond)).append("\n");
    sb.append("    colorTitle: ").append(toIndentedString(colorTitle)).append("\n");
    sb.append("    colorDescription: ").append(toIndentedString(colorDescription)).append("\n");
    sb.append("    colorLinkButton: ").append(toIndentedString(colorLinkButton)).append("\n");
    sb.append("    colorText: ").append(toIndentedString(colorText)).append("\n");
    sb.append("    buttonColor: ").append(toIndentedString(buttonColor)).append("\n");
    sb.append("    buttonType: ").append(toIndentedString(buttonType)).append("\n");
    sb.append("    urlDonate: ").append(toIndentedString(urlDonate)).append("\n");
    sb.append("    blockInfo: ").append(toIndentedString(blockInfo)).append("\n");
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
