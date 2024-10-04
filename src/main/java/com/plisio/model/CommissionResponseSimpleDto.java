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
import com.plisio.model.CommissionResponseSimpleErrorDto;
import com.plisio.model.FeePlanCustomDto;
import com.plisio.model.FeeSimplePlanDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CommissionResponseSimpleDto
 */

public class CommissionResponseSimpleDto {
  @SerializedName("commission")
  private String commission = null;

  @SerializedName("fee")
  private String fee = null;

  @SerializedName("feeUnit")
  private String feeUnit = null;

  @SerializedName("feeFiat")
  private String feeFiat = null;

  @SerializedName("feeFiatUnit")
  private String feeFiatUnit = null;

  @SerializedName("maxAmount")
  private String maxAmount = null;

  @SerializedName("plan")
  private String plan = null;

  @SerializedName("useWallet")
  private String useWallet = null;

  @SerializedName("useWalletBalance")
  private String useWalletBalance = null;

  @SerializedName("plans")
  private FeeSimplePlanDto plans = null;

  @SerializedName("custom")
  private List<FeePlanCustomDto> custom = null;

  @SerializedName("errors")
  private List<CommissionResponseSimpleErrorDto> errors = null;

  @SerializedName("customFeeRate")
  private Float customFeeRate = null;

  public CommissionResponseSimpleDto commission(String commission) {
    this.commission = commission;
    return this;
  }

   /**
   * Plisio commission value
   * @return commission
  **/
  @Schema(description = "Plisio commission value")
  public String getCommission() {
    return commission;
  }

  public void setCommission(String commission) {
    this.commission = commission;
  }

  public CommissionResponseSimpleDto fee(String fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Cryptocurrency fee value
   * @return fee
  **/
  @Schema(description = "Cryptocurrency fee value")
  public String getFee() {
    return fee;
  }

  public void setFee(String fee) {
    this.fee = fee;
  }

  public CommissionResponseSimpleDto feeUnit(String feeUnit) {
    this.feeUnit = feeUnit;
    return this;
  }

   /**
   * Cryptocurrency feeUnit value
   * @return feeUnit
  **/
  @Schema(description = "Cryptocurrency feeUnit value")
  public String getFeeUnit() {
    return feeUnit;
  }

  public void setFeeUnit(String feeUnit) {
    this.feeUnit = feeUnit;
  }

  public CommissionResponseSimpleDto feeFiat(String feeFiat) {
    this.feeFiat = feeFiat;
    return this;
  }

   /**
   * Cryptocurrency fee value in selected fiat currency
   * @return feeFiat
  **/
  @Schema(description = "Cryptocurrency fee value in selected fiat currency")
  public String getFeeFiat() {
    return feeFiat;
  }

  public void setFeeFiat(String feeFiat) {
    this.feeFiat = feeFiat;
  }

  public CommissionResponseSimpleDto feeFiatUnit(String feeFiatUnit) {
    this.feeFiatUnit = feeFiatUnit;
    return this;
  }

   /**
   * Selected fiat currency
   * @return feeFiatUnit
  **/
  @Schema(description = "Selected fiat currency")
  public String getFeeFiatUnit() {
    return feeFiatUnit;
  }

  public void setFeeFiatUnit(String feeFiatUnit) {
    this.feeFiatUnit = feeFiatUnit;
  }

  public CommissionResponseSimpleDto maxAmount(String maxAmount) {
    this.maxAmount = maxAmount;
    return this;
  }

   /**
   * Maximum allowed amount to withdrawal
   * @return maxAmount
  **/
  @Schema(description = "Maximum allowed amount to withdrawal")
  public String getMaxAmount() {
    return maxAmount;
  }

  public void setMaxAmount(String maxAmount) {
    this.maxAmount = maxAmount;
  }

  public CommissionResponseSimpleDto plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Plisio&#x27;s cryptocurrency fee estimation plan
   * @return plan
  **/
  @Schema(description = "Plisio's cryptocurrency fee estimation plan")
  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

  public CommissionResponseSimpleDto useWallet(String useWallet) {
    this.useWallet = useWallet;
    return this;
  }

   /**
   * Pay fee from wallet
   * @return useWallet
  **/
  @Schema(description = "Pay fee from wallet")
  public String getUseWallet() {
    return useWallet;
  }

  public void setUseWallet(String useWallet) {
    this.useWallet = useWallet;
  }

  public CommissionResponseSimpleDto useWalletBalance(String useWalletBalance) {
    this.useWalletBalance = useWalletBalance;
    return this;
  }

   /**
   * Balance of wallet that will be used to pay fee
   * @return useWalletBalance
  **/
  @Schema(description = "Balance of wallet that will be used to pay fee")
  public String getUseWalletBalance() {
    return useWalletBalance;
  }

  public void setUseWalletBalance(String useWalletBalance) {
    this.useWalletBalance = useWalletBalance;
  }

  public CommissionResponseSimpleDto plans(FeeSimplePlanDto plans) {
    this.plans = plans;
    return this;
  }

   /**
   * Get plans
   * @return plans
  **/
  @Schema(description = "")
  public FeeSimplePlanDto getPlans() {
    return plans;
  }

  public void setPlans(FeeSimplePlanDto plans) {
    this.plans = plans;
  }

  public CommissionResponseSimpleDto custom(List<FeePlanCustomDto> custom) {
    this.custom = custom;
    return this;
  }

  public CommissionResponseSimpleDto addCustomItem(FeePlanCustomDto customItem) {
    if (this.custom == null) {
      this.custom = new ArrayList<FeePlanCustomDto>();
    }
    this.custom.add(customItem);
    return this;
  }

   /**
   * Cryptocurrency fee limits
   * @return custom
  **/
  @Schema(description = "Cryptocurrency fee limits")
  public List<FeePlanCustomDto> getCustom() {
    return custom;
  }

  public void setCustom(List<FeePlanCustomDto> custom) {
    this.custom = custom;
  }

  public CommissionResponseSimpleDto errors(List<CommissionResponseSimpleErrorDto> errors) {
    this.errors = errors;
    return this;
  }

  public CommissionResponseSimpleDto addErrorsItem(CommissionResponseSimpleErrorDto errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<CommissionResponseSimpleErrorDto>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @Schema(description = "")
  public List<CommissionResponseSimpleErrorDto> getErrors() {
    return errors;
  }

  public void setErrors(List<CommissionResponseSimpleErrorDto> errors) {
    this.errors = errors;
  }

  public CommissionResponseSimpleDto customFeeRate(Float customFeeRate) {
    this.customFeeRate = customFeeRate;
    return this;
  }

   /**
   * Get customFeeRate
   * @return customFeeRate
  **/
  @Schema(description = "")
  public Float getCustomFeeRate() {
    return customFeeRate;
  }

  public void setCustomFeeRate(Float customFeeRate) {
    this.customFeeRate = customFeeRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommissionResponseSimpleDto commissionResponseSimpleDto = (CommissionResponseSimpleDto) o;
    return Objects.equals(this.commission, commissionResponseSimpleDto.commission) &&
        Objects.equals(this.fee, commissionResponseSimpleDto.fee) &&
        Objects.equals(this.feeUnit, commissionResponseSimpleDto.feeUnit) &&
        Objects.equals(this.feeFiat, commissionResponseSimpleDto.feeFiat) &&
        Objects.equals(this.feeFiatUnit, commissionResponseSimpleDto.feeFiatUnit) &&
        Objects.equals(this.maxAmount, commissionResponseSimpleDto.maxAmount) &&
        Objects.equals(this.plan, commissionResponseSimpleDto.plan) &&
        Objects.equals(this.useWallet, commissionResponseSimpleDto.useWallet) &&
        Objects.equals(this.useWalletBalance, commissionResponseSimpleDto.useWalletBalance) &&
        Objects.equals(this.plans, commissionResponseSimpleDto.plans) &&
        Objects.equals(this.custom, commissionResponseSimpleDto.custom) &&
        Objects.equals(this.errors, commissionResponseSimpleDto.errors) &&
        Objects.equals(this.customFeeRate, commissionResponseSimpleDto.customFeeRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commission, fee, feeUnit, feeFiat, feeFiatUnit, maxAmount, plan, useWallet, useWalletBalance, plans, custom, errors, customFeeRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommissionResponseSimpleDto {\n");
    
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    feeUnit: ").append(toIndentedString(feeUnit)).append("\n");
    sb.append("    feeFiat: ").append(toIndentedString(feeFiat)).append("\n");
    sb.append("    feeFiatUnit: ").append(toIndentedString(feeFiatUnit)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    useWallet: ").append(toIndentedString(useWallet)).append("\n");
    sb.append("    useWalletBalance: ").append(toIndentedString(useWalletBalance)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    customFeeRate: ").append(toIndentedString(customFeeRate)).append("\n");
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
