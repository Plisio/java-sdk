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
import com.plisio.model.FeePlanDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CommissionResponseDto
 */

public class CommissionResponseDto {
  @SerializedName("commission")
  private String commission = null;

  @SerializedName("fee")
  private String fee = null;

  @SerializedName("feeUnit")
  private String feeUnit = null;

  @SerializedName("plan")
  private String plan = null;

  @SerializedName("useWallet")
  private String useWallet = null;

  @SerializedName("useWalletBalance")
  private String useWalletBalance = null;

  @SerializedName("plans")
  private List<FeePlanDto> plans = null;

  public CommissionResponseDto commission(String commission) {
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

  public CommissionResponseDto fee(String fee) {
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

  public CommissionResponseDto feeUnit(String feeUnit) {
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

  public CommissionResponseDto plan(String plan) {
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

  public CommissionResponseDto useWallet(String useWallet) {
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

  public CommissionResponseDto useWalletBalance(String useWalletBalance) {
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

  public CommissionResponseDto plans(List<FeePlanDto> plans) {
    this.plans = plans;
    return this;
  }

  public CommissionResponseDto addPlansItem(FeePlanDto plansItem) {
    if (this.plans == null) {
      this.plans = new ArrayList<FeePlanDto>();
    }
    this.plans.add(plansItem);
    return this;
  }

   /**
   * Cryptocurrency fee plans
   * @return plans
  **/
  @Schema(description = "Cryptocurrency fee plans")
  public List<FeePlanDto> getPlans() {
    return plans;
  }

  public void setPlans(List<FeePlanDto> plans) {
    this.plans = plans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommissionResponseDto commissionResponseDto = (CommissionResponseDto) o;
    return Objects.equals(this.commission, commissionResponseDto.commission) &&
        Objects.equals(this.fee, commissionResponseDto.fee) &&
        Objects.equals(this.feeUnit, commissionResponseDto.feeUnit) &&
        Objects.equals(this.plan, commissionResponseDto.plan) &&
        Objects.equals(this.useWallet, commissionResponseDto.useWallet) &&
        Objects.equals(this.useWalletBalance, commissionResponseDto.useWalletBalance) &&
        Objects.equals(this.plans, commissionResponseDto.plans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commission, fee, feeUnit, plan, useWallet, useWalletBalance, plans);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommissionResponseDto {\n");
    
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    feeUnit: ").append(toIndentedString(feeUnit)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    useWallet: ").append(toIndentedString(useWallet)).append("\n");
    sb.append("    useWalletBalance: ").append(toIndentedString(useWalletBalance)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
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
