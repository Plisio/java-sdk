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
import com.plisio.model.InvoiceExtendedResponseDto;
import com.plisio.model.InvoicePaysysDto;
import com.plisio.model.ShopInfoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InvoiceDetailsResponseDto
 */

public class InvoiceDetailsResponseDto {
  @SerializedName("invoice")
  private InvoiceExtendedResponseDto invoice = null;

  @SerializedName("active_invoice_id")
  private String activeInvoiceId = null;

  @SerializedName("shop")
  private ShopInfoDto shop = null;

  @SerializedName("paysys")
  private InvoicePaysysDto paysys = null;

  @SerializedName("allowed_psys_cids")
  private List<InvoicePaysysDto> allowedPsysCids = null;

  public InvoiceDetailsResponseDto invoice(InvoiceExtendedResponseDto invoice) {
    this.invoice = invoice;
    return this;
  }

   /**
   * Get invoice
   * @return invoice
  **/
  @Schema(description = "")
  public InvoiceExtendedResponseDto getInvoice() {
    return invoice;
  }

  public void setInvoice(InvoiceExtendedResponseDto invoice) {
    this.invoice = invoice;
  }

  public InvoiceDetailsResponseDto activeInvoiceId(String activeInvoiceId) {
    this.activeInvoiceId = activeInvoiceId;
    return this;
  }

   /**
   * Current active invoice ID. Invoice ID with the last selected cryptocurrency
   * @return activeInvoiceId
  **/
  @Schema(description = "Current active invoice ID. Invoice ID with the last selected cryptocurrency")
  public String getActiveInvoiceId() {
    return activeInvoiceId;
  }

  public void setActiveInvoiceId(String activeInvoiceId) {
    this.activeInvoiceId = activeInvoiceId;
  }

  public InvoiceDetailsResponseDto shop(ShopInfoDto shop) {
    this.shop = shop;
    return this;
  }

   /**
   * Get shop
   * @return shop
  **/
  @Schema(description = "")
  public ShopInfoDto getShop() {
    return shop;
  }

  public void setShop(ShopInfoDto shop) {
    this.shop = shop;
  }

  public InvoiceDetailsResponseDto paysys(InvoicePaysysDto paysys) {
    this.paysys = paysys;
    return this;
  }

   /**
   * Get paysys
   * @return paysys
  **/
  @Schema(description = "")
  public InvoicePaysysDto getPaysys() {
    return paysys;
  }

  public void setPaysys(InvoicePaysysDto paysys) {
    this.paysys = paysys;
  }

  public InvoiceDetailsResponseDto allowedPsysCids(List<InvoicePaysysDto> allowedPsysCids) {
    this.allowedPsysCids = allowedPsysCids;
    return this;
  }

  public InvoiceDetailsResponseDto addAllowedPsysCidsItem(InvoicePaysysDto allowedPsysCidsItem) {
    if (this.allowedPsysCids == null) {
      this.allowedPsysCids = new ArrayList<InvoicePaysysDto>();
    }
    this.allowedPsysCids.add(allowedPsysCidsItem);
    return this;
  }

   /**
   * Allowed cryptocurrencies for select
   * @return allowedPsysCids
  **/
  @Schema(description = "Allowed cryptocurrencies for select")
  public List<InvoicePaysysDto> getAllowedPsysCids() {
    return allowedPsysCids;
  }

  public void setAllowedPsysCids(List<InvoicePaysysDto> allowedPsysCids) {
    this.allowedPsysCids = allowedPsysCids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceDetailsResponseDto invoiceDetailsResponseDto = (InvoiceDetailsResponseDto) o;
    return Objects.equals(this.invoice, invoiceDetailsResponseDto.invoice) &&
        Objects.equals(this.activeInvoiceId, invoiceDetailsResponseDto.activeInvoiceId) &&
        Objects.equals(this.shop, invoiceDetailsResponseDto.shop) &&
        Objects.equals(this.paysys, invoiceDetailsResponseDto.paysys) &&
        Objects.equals(this.allowedPsysCids, invoiceDetailsResponseDto.allowedPsysCids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoice, activeInvoiceId, shop, paysys, allowedPsysCids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceDetailsResponseDto {\n");
    
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    activeInvoiceId: ").append(toIndentedString(activeInvoiceId)).append("\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
    sb.append("    paysys: ").append(toIndentedString(paysys)).append("\n");
    sb.append("    allowedPsysCids: ").append(toIndentedString(allowedPsysCids)).append("\n");
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
