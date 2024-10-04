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
 * PaysysDto
 */

public class PaysysDto {
  @SerializedName("name")
  private String name = null;

  @SerializedName("cid")
  private String cid = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("icon")
  private String icon = null;

  @SerializedName("rate_usd")
  private String rateUsd = null;

  @SerializedName("price_usd")
  private String priceUsd = null;

  @SerializedName("precision")
  private String precision = null;

  @SerializedName("output_precision")
  private String outputPrecision = null;

  @SerializedName("fiat")
  private Object fiat = null;

  @SerializedName("fiat_rate")
  private Object fiatRate = null;

  @SerializedName("min_sum_in")
  private Object minSumIn = null;

  @SerializedName("invoice_commission_percentage")
  private String invoiceCommissionPercentage = null;

  @SerializedName("hidden")
  private Integer hidden = null;

  @SerializedName("maintenance")
  private Boolean maintenance = null;

  @SerializedName("contractOf")
  private Object contractOf = null;

  @SerializedName("contractStandard")
  private Object contractStandard = null;

  public PaysysDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Cryptocurrency name
   * @return name
  **/
  @Schema(description = "Cryptocurrency name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PaysysDto cid(String cid) {
    this.cid = cid;
    return this;
  }

   /**
   * Cryptocurrency Plisio Abbr
   * @return cid
  **/
  @Schema(description = "Cryptocurrency Plisio Abbr")
  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }

  public PaysysDto currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Cryptocurrency Abbr
   * @return currency
  **/
  @Schema(description = "Cryptocurrency Abbr")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PaysysDto icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Cryptocurrency icon
   * @return icon
  **/
  @Schema(description = "Cryptocurrency icon")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public PaysysDto rateUsd(String rateUsd) {
    this.rateUsd = rateUsd;
    return this;
  }

   /**
   * Cryptocurrency USD rate
   * @return rateUsd
  **/
  @Schema(description = "Cryptocurrency USD rate")
  public String getRateUsd() {
    return rateUsd;
  }

  public void setRateUsd(String rateUsd) {
    this.rateUsd = rateUsd;
  }

  public PaysysDto priceUsd(String priceUsd) {
    this.priceUsd = priceUsd;
    return this;
  }

   /**
   * Cryptocurrency USD price
   * @return priceUsd
  **/
  @Schema(description = "Cryptocurrency USD price")
  public String getPriceUsd() {
    return priceUsd;
  }

  public void setPriceUsd(String priceUsd) {
    this.priceUsd = priceUsd;
  }

  public PaysysDto precision(String precision) {
    this.precision = precision;
    return this;
  }

   /**
   * Cryptocurrency precision
   * @return precision
  **/
  @Schema(description = "Cryptocurrency precision")
  public String getPrecision() {
    return precision;
  }

  public void setPrecision(String precision) {
    this.precision = precision;
  }

  public PaysysDto outputPrecision(String outputPrecision) {
    this.outputPrecision = outputPrecision;
    return this;
  }

   /**
   * Cryptocurrency output precision
   * @return outputPrecision
  **/
  @Schema(description = "Cryptocurrency output precision")
  public String getOutputPrecision() {
    return outputPrecision;
  }

  public void setOutputPrecision(String outputPrecision) {
    this.outputPrecision = outputPrecision;
  }

  public PaysysDto fiat(Object fiat) {
    this.fiat = fiat;
    return this;
  }

   /**
   * Fiat abbr
   * @return fiat
  **/
  @Schema(description = "Fiat abbr")
  public Object getFiat() {
    return fiat;
  }

  public void setFiat(Object fiat) {
    this.fiat = fiat;
  }

  public PaysysDto fiatRate(Object fiatRate) {
    this.fiatRate = fiatRate;
    return this;
  }

   /**
   * Cryptocurrency fiat rate (default USD)
   * @return fiatRate
  **/
  @Schema(description = "Cryptocurrency fiat rate (default USD)")
  public Object getFiatRate() {
    return fiatRate;
  }

  public void setFiatRate(Object fiatRate) {
    this.fiatRate = fiatRate;
  }

  public PaysysDto minSumIn(Object minSumIn) {
    this.minSumIn = minSumIn;
    return this;
  }

   /**
   * Invoice amount minimum
   * @return minSumIn
  **/
  @Schema(description = "Invoice amount minimum")
  public Object getMinSumIn() {
    return minSumIn;
  }

  public void setMinSumIn(Object minSumIn) {
    this.minSumIn = minSumIn;
  }

  public PaysysDto invoiceCommissionPercentage(String invoiceCommissionPercentage) {
    this.invoiceCommissionPercentage = invoiceCommissionPercentage;
    return this;
  }

   /**
   * Plisio commission percentage
   * @return invoiceCommissionPercentage
  **/
  @Schema(description = "Plisio commission percentage")
  public String getInvoiceCommissionPercentage() {
    return invoiceCommissionPercentage;
  }

  public void setInvoiceCommissionPercentage(String invoiceCommissionPercentage) {
    this.invoiceCommissionPercentage = invoiceCommissionPercentage;
  }

  public PaysysDto hidden(Integer hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * Is cryptocurrency enabled (1 - disable, 0 - enabled)
   * @return hidden
  **/
  @Schema(description = "Is cryptocurrency enabled (1 - disable, 0 - enabled)")
  public Integer getHidden() {
    return hidden;
  }

  public void setHidden(Integer hidden) {
    this.hidden = hidden;
  }

  public PaysysDto maintenance(Boolean maintenance) {
    this.maintenance = maintenance;
    return this;
  }

   /**
   * Cryptocurrency node temporary on maintenance
   * @return maintenance
  **/
  @Schema(description = "Cryptocurrency node temporary on maintenance")
  public Boolean isMaintenance() {
    return maintenance;
  }

  public void setMaintenance(Boolean maintenance) {
    this.maintenance = maintenance;
  }

  public PaysysDto contractOf(Object contractOf) {
    this.contractOf = contractOf;
    return this;
  }

   /**
   * Pay fee from another crypto
   * @return contractOf
  **/
  @Schema(description = "Pay fee from another crypto")
  public Object getContractOf() {
    return contractOf;
  }

  public void setContractOf(Object contractOf) {
    this.contractOf = contractOf;
  }

  public PaysysDto contractStandard(Object contractStandard) {
    this.contractStandard = contractStandard;
    return this;
  }

   /**
   * Standard of contract
   * @return contractStandard
  **/
  @Schema(description = "Standard of contract")
  public Object getContractStandard() {
    return contractStandard;
  }

  public void setContractStandard(Object contractStandard) {
    this.contractStandard = contractStandard;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaysysDto paysysDto = (PaysysDto) o;
    return Objects.equals(this.name, paysysDto.name) &&
        Objects.equals(this.cid, paysysDto.cid) &&
        Objects.equals(this.currency, paysysDto.currency) &&
        Objects.equals(this.icon, paysysDto.icon) &&
        Objects.equals(this.rateUsd, paysysDto.rateUsd) &&
        Objects.equals(this.priceUsd, paysysDto.priceUsd) &&
        Objects.equals(this.precision, paysysDto.precision) &&
        Objects.equals(this.outputPrecision, paysysDto.outputPrecision) &&
        Objects.equals(this.fiat, paysysDto.fiat) &&
        Objects.equals(this.fiatRate, paysysDto.fiatRate) &&
        Objects.equals(this.minSumIn, paysysDto.minSumIn) &&
        Objects.equals(this.invoiceCommissionPercentage, paysysDto.invoiceCommissionPercentage) &&
        Objects.equals(this.hidden, paysysDto.hidden) &&
        Objects.equals(this.maintenance, paysysDto.maintenance) &&
        Objects.equals(this.contractOf, paysysDto.contractOf) &&
        Objects.equals(this.contractStandard, paysysDto.contractStandard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, cid, currency, icon, rateUsd, priceUsd, precision, outputPrecision, fiat, fiatRate, minSumIn, invoiceCommissionPercentage, hidden, maintenance, contractOf, contractStandard);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaysysDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    rateUsd: ").append(toIndentedString(rateUsd)).append("\n");
    sb.append("    priceUsd: ").append(toIndentedString(priceUsd)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    outputPrecision: ").append(toIndentedString(outputPrecision)).append("\n");
    sb.append("    fiat: ").append(toIndentedString(fiat)).append("\n");
    sb.append("    fiatRate: ").append(toIndentedString(fiatRate)).append("\n");
    sb.append("    minSumIn: ").append(toIndentedString(minSumIn)).append("\n");
    sb.append("    invoiceCommissionPercentage: ").append(toIndentedString(invoiceCommissionPercentage)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    maintenance: ").append(toIndentedString(maintenance)).append("\n");
    sb.append("    contractOf: ").append(toIndentedString(contractOf)).append("\n");
    sb.append("    contractStandard: ").append(toIndentedString(contractStandard)).append("\n");
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
